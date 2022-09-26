pipeline {
    agent any

    stages {
        stage('build'){
            sh 'echo building...'
        }
        stage('test') {
            sh 'echo testing..'
        }
        stage('docker build') {
            sh 'echo docker building..'
        }
        stage('docker-login') {
            sh 'echo docker-hub login..'
        }
        stage('docker push') {
            sh 'echo docker-hub pushing..'
        }
    }
}
