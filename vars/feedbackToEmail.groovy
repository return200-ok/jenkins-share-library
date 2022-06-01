def call(Map config = [:]) {
    emailext (
            subject: "${env.SERVICE} - Build # $BUILD_NUMBER - ${currentBuild.currentResult}!",
            to: 'lenhhoxung98s@gmail.com',
            body: """ <p>${currentBuild.currentResult}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
                      <p>Please check console output at <a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a> to view the results.</p>""",
            recipientProviders: [[$class: 'DevelopersRecipientProvider']])
}