deployFile = $1
stackName = $2
docker stack deploy --compose-file $deployFile --with-registry-auth $stackName

jobname=$1
deployment_file=$(./parseFile.sh $jobname)
image_version=$2
./imageVerify.sh $jobname $image_version
echo ${deployment_file} ${image_version} 
echo "Starting deploy application on k8s"
echo "----------------------------------"
echo "Unlock the deployment"
# sed -ie "s/THIS_STRING_IS_REPLACED_DURING_BUILD/$(date)/g" ${deployment_file}
echo "Deploying application"
sed -ie "s|IMAGE_VERSION|${image_version}|g" ${deployment_file}
# kubectl apply -f ${deployment_file}
cat ${deployment_file}

if [ $? -eq 0 ];then
echo "Deployment Done"
else
echo "Deployment False"
exit 1
fi