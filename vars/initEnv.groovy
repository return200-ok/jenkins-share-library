// def call() {
//     loadLinuxScript(name: 'initEnviroment.sh')
//     sh "./initEnviroment.sh"
// }
def parseServiceName(gitlabSourceRepoName) {
    def lowerServiceName = gitlabSourceRepoName.toLowerCase()
    def serviceName = lowerServiceName.trim() 
    return serviceName
}