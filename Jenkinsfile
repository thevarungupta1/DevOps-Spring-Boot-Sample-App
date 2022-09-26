pipeline {
    agent any

//     environment {
//         DOCKERHUB_CREDENTIALS=credentials("docker-hub")
//     }

    stages {
        stage("build"){
            steps{
                bat "mvn -version"
                bat "mvn clean install"
            }
        }
        stage("test") {
            steps{
                bat "mvn test"
            }
        }
//         stage('docker build') {
//             steps{
//                 sh 'docker build spring-boot-demo-app -t spring-boot-demo-app .'
//                 sh 'docker tag spring-boot-demo-app varungupta2809/backenn-image'
//             }
//         }
//         stage('docker-login') {
//             steps{
//                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USE'
//             }
//         }
//         stage('docker push') {
//             steps{
//                 sh 'sh docker push varungupta2809/backenn-image'
//             }
//         }
    }
}
