def call() {
    loadLinuxScript(name: 'printEnvGitlab.sh')
    def x = env.GIT_URL
    switch(x){
        case ~/(.*)gitlab(.*)/:
            println "Version Control is GitLab"
        case ~/(.*)github(.*)/:
            println "Version Control is Github"
        break
        
    }
    sh "./printEnvGitlab.sh"
}
def parseServiceName(gitlabSourceRepoName) {
    def lowerString = gitlabSourceRepoName.toLowerCase()
    def trimString = lowerString.trim() 
    def serviceName = trimString.replace(' ', '-')
    return serviceName
}