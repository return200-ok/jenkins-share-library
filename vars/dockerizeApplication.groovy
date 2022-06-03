// Using jenkins plugin
def call(Map config = [:]) {
    appImage = docker.build "${config.serviceName}"
    docker.withRegistry("${config.DOCKER_REGISTRY_URL}", "${config.REGISTRY_CREDENTIAL}") {
        appImage.push("latest")
        appImage.push("${env.imageTag}")
    }
}
// ------------------------------------------------
// Using bash script
// def call(Map config = [:]) {
//     loadLinuxScript(name: 'dockerizeApp.sh')
//     sh "./dockerizeApp.sh ${config.IMAGE_NAME} ${config.IMAGE_TAG} ${config.DOCKER_REGISTRY_URL} ${config.DOCKER_REGISTRY_PASSWORD}"
// }