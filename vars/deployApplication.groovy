def call(Map config = [:]) {
    loadMapFile(name: 'jobScript.map')
    loadLinuxScript(name: 'deployApplication.sh')
    sh "mkdir -p k8s-manifest"
    dir("k8s-manifest") {
        git credentialsId: 'd281bfc1-1637-4c18-a8a2-cf3567ce567f', url: "${config.k8sManifest}"
    }
    sh "./deployApplication.sh ${config.jobName} ${config.imageVersion} ${config.deployEnviroment}"
}
