def call() {
    loadLinuxScript(name: 'printEnvGitlab.sh')
    def x = env.GIT_URL
    switch(x){
        case ~/(.*)gitlab(.*)/:
            println "Version Control is GitLab"
            sh "./printEnvGitlab.sh"
        break
        case ~/(.*)github(.*)/:
            println "Version Control is Github"
        break
        
    }
}
def parseServiceName(gitlabSourceRepoName) {
    def lowerString = gitlabSourceRepoName.toLowerCase()
    def trimString = lowerString.trim() 
    def serviceName = trimString.replace(' ', '-')
    return serviceName
}