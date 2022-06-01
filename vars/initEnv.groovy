def call() {
    loadLinuxScript(name: 'printEnvGitlab.sh')
    def x = env.GIT_URL
    switch(x){
        case ~/(.*)gitlab(.*)/ : echo "gitlab"
        default: log.info("value is not present")
    }
    sh "./printEnvGitlab.sh"
}
def parseServiceName(gitlabSourceRepoName) {
    def lowerString = gitlabSourceRepoName.toLowerCase()
    def trimString = lowerString.trim() 
    def serviceName = trimString.replace(' ', '-')
    return serviceName
}