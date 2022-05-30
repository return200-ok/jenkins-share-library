deployEnviroment="kubernetes"
deployMethod="manual"

deployK8s(){
    jobname=$1
    deployment_file=$(./parseFile.sh $jobname)
    image_version=$2
    ./imageVerify.sh $jobname $image_version
    echo ${deployment_file} ${image_version} 
    echo "Starting deploy application on k8s"
    echo "----------------------------------"
    echo "Unlock the deployment"
    # verify your job with current date
    sed -ie "s/THIS_STRING_IS_REPLACED_DURING_BUILD/$(date)/g" ${deployment_file}
    echo "Deploying application"
    sed -ie "s|IMAGE_VERSION|${image_version}|g" ${deployment_file}
    # kubectl apply -f ${deployment_file}
    cat ${deployment_file}
    if [ $? -eq 0 ];then
    echo "Deployment Done"
    # add feedback script
    else
    echo "Deployment False"
    # add feedback script
    exit 1
    fi
}
deploySwarm(){
    docker stack deploy --compose-file $deployFile --with-registry-auth $stackName
}

deployWithAnsible(){
    
}

if [[ $deployEnviroment == "kubernetes" ]]; then
    if [[ $deployMethod == "manual" ]]; then
        deployK8s $jobname $imageVersion
    elif [[ $deployMethod == "ansible" ]] then
        deployK8s $jobname $imageVersion
    else
        echo "foo"
    fi
elif [[ $deployEnviroment == "swarm" ]]; then
    echo "Deploy to Swarm"
elif [[ $deployEnviroment == "otherEnv" ]]; then
    echo "Deploy to foo bar"
else
    echo "foo bar"
fi
