verify_image_match () {
    a=false
    image_require=$(grep -w $1 jobScript.map | awk '{print $3}')
    for image in $image_require
    do
        if [[ $2 == *"$image"* ]];then
            a=true
        fi
    done
    if $a;then
        return 0
    else 
        echo "input image not valid for this job"
        exit 1
    fi
}

verify_image_match $1 $2