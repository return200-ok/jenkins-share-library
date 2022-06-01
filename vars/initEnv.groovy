// def call() {
//     loadLinuxScript(name: 'initEnviroment.sh')
//     sh "./initEnviroment.sh"
// }
def getFullServiceName(gitlabSourceRepoName) {
    def lowerServiceName = gitlabSourceRepoName.toLowerCase()
    def serviceName = lowerServiceName.trim() 
    return serviceName
}