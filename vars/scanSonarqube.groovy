def call(Map config = [:]){
    loadLinuxScript(name: 'scanSonarqube.sh')
    sh "./scanSonarqube.sh ${config.projectKey} ${config.hostUrl} ${config.loginToken}"
}