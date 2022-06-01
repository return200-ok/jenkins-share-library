def call() {
    loadLinuxScript(name: 'initEnviroment.sh')
    sh "./initEnviroment.sh"
}
def parseServiceName(gitlabSourceRepoName) {
    def lowerString = gitlabSourceRepoName.toLowerCase()
    def trimString = lowerString.trim() 
    def serviceName = trimString.replace(' ', '-')
    return serviceName
}