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
                sh 'mvn clean install'
                stash includes: 'target/*.jar', name: 'spring-boot-sample-app-0.0.1-SNAPSHOT.jar'
            }
        }
        stage('test') {
            steps {
                echo 'mvn test'
            }
        }
        stage('sonarqube') {
            agent {
                docker { image 'sonarqube' }
            }
            steps {
                sh 'echo scanning!'
            }
        }
        stage('build docker image') {
            steps {
                sh 'docker build --build-arg JAR_FILE=spring-boot-sample-app-0.0.1-SNAPSHOT.jar -t spring-boot-sample-app .'
                sh 'docker tag spring-boot-sample-app varungupta2809/spring-boot-sample-app'
            }
        }
        stage('docker login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('docker push') {
            steps {
                sh 'docker push varungupta2809/spring-boot-sample-app:latest'
            }
        }
    }
}