def call(Map config = [:]) {
    loadMapFile(name: 'jobScript.map')
    loadLinuxScript(name: 'imageVerify.sh')
    loadLinuxScript(name: 'deployKubernetes.sh')
    sh "./deployKubernetes.sh ${config.jobName} ${config.imageVersion}"
}