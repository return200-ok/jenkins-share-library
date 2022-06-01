def call() {
    loadLinuxScript(name: 'initEnviroment.sh')
    sh "./initEnviroment.sh"
}