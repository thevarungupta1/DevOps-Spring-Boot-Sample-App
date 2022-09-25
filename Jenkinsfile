pipeline{
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    environment {
        DOCKERHUB_CREDENTIALS=credentials('docker-hub')
    }
    stages{
        stage('build') {
            steps {
                echo 'building...'
            }
        }
        stage('test') {
            steps {
                echo 'testing...'
            }
        }
        stage('build docker image') {
            steps {
                sh 'docker build -t varungupta2809/myapp-test:latest .'
            }
        }
        stage('docker login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('docker push') {
            steps {
                sh 'docker push varungupta2809/myapp-test:latest'
            }
        }
    }
}