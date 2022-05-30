def call(Map config = [:]) {
    loadMapFile(name: 'jobScript.map')
    loadLinuxScript(name: 'imageVerify.sh')
    loadLinuxScript(name: 'deployApplication.sh')
    sh "./deployApplication.sh ${config.method} ${config.platform} ${config.jobName} ${config.imageVersion}"
}