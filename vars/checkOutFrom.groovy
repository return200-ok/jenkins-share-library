def call(Map config = [:]) {
    checkout changelog: true, poll: true, scm: [
        $class: 'GitSCM',
        branches: [[name: "*/${config.branches}"]],
        doGenerateSubmoduleConfigurations: false,
        submoduleCfg: [],
        userRemoteConfigs: [[credentialsId: "${config.CREDENTIAL_ID}", url: "${config.repo_url}"]]
    ]
}




