def call(Map config = [:]) {
    loadMapFile(name: 'jobScript.map')
    loadLinuxScript(name: 'imageVerify.sh')
    loadLinuxScript(name: 'deployWithK8s.sh')
    sh "./deployWithK8s.sh ${config.jobName} ${config.imageVersion}"
}