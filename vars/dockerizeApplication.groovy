def call(Map config = [:]) {
    appImage = docker.build "${config.imageName}"
    docker.withRegistry("${config.DOCKER_REGISTRY_URL}", "${config.REGISTRY_CREDENTIAL}") {
        appImage.push("latest")
        appImage.push("${env.imageTag}")
    }
}