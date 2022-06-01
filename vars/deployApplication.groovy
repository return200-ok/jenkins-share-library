def call(Map config = [:]) {
    loadMapFile(name: 'jobScript.map')
    loadLinuxScript(name: 'deployApplication.sh')
    sh "./deployApplication.sh ${config.jobName} ${config.imageVersion} ${config.deployEnviroment}"
}
