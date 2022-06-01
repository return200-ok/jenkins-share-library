// def call() {
//     loadLinuxScript(name: 'initEnviroment.sh')
//     sh "./initEnviroment.sh"
// }
def parseServiceName(gitlabSourceRepoName) {
    def serviceName = gitlabSourceRepoName.toLowerCase().trim()
    // def serviceName = lowerServiceName.trim() 
    return serviceName
}