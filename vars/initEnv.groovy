def call() {
    loadLinuxScript(name: 'printEnvGitlab.sh')
    sh "./printEnvGitlab.sh"
}
def parseServiceName(gitlabSourceRepoName) {
    def lowerString = gitlabSourceRepoName.toLowerCase()
    def trimString = lowerString.trim() 
    def serviceName = trimString.replace(' ', '-')
    return serviceName
}