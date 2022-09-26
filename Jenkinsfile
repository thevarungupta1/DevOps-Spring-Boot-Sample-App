pipeline {
    agent any

    stages {
        stage('build'){
            steps{
                sh 'echo building...'
            }
        }
        stage('test') {
            steps{
                sh 'echo testing..'
            }
        }
        stage('docker build') {
            steps{
                sh 'echo docker building..'
            }
        }
        stage('docker-login') {
            steps{
               sh 'echo docker-hub login..'
            }
        }
        stage('docker push') {
            steps{
                sh 'echo docker-hub pushing..'
            }
        }
    }
}
