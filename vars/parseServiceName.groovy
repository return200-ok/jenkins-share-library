def call() {
    loadLinuxScript(name: 'printEnvGitlab.sh')
    def x = env.GIT_URL
    switch(x){
        case ~/(.*)gitlab(.*)/:
            println "Version Control is GitLab"
            // sh "./printEnvGitlab.sh"
            def serviceName = parseServiceName("${gitlabSourceRepoName}")
            return serviceName
        break
        case ~/(.*)github(.*)/:
            println "Version Control is Github"
        break
        case ~/(.*)bitbucket(.*)/:
            println "Version Control is Bitbucket"
        break
        
    }
}
def parseServiceName(gitlabSourceRepoName) {
    def lowerString = gitlabSourceRepoName.toLowerCase()
    def trimString = lowerString.trim() 
    def serviceName = trimString.replace(' ', '-')
    return serviceName
}