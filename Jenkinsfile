pipeline {
    agent {
        docker {
            image "maven:3.9.0-eclipse-temurin-19"
            label "docker"
        }
    }
    stages {
//         stage('Checking out the repository') {
//             steps {
//                 checkout scmGit(branches:
//                     [[name: '${BRANCH_NAME}']], extensions: [], userRemoteConfigs:
//                     [[credentialsId: 'de46b8ff-a9cc-4c6d-8b62-f6911ee7b0a3',
//                     url: 'https://github.com/gramolini/financeManagerForAllBackend.git']]
//                 )
//             }
//         }
        stage('Build') {
            steps {
                bat 'mvn -version'
                bat 'mvn clean install'
            }
        }
//         stage('Sending to cloud') {
//             steps {
//                 bat 'mvn dockerfile:push'
//             }
//         }
    }

    post {
        always {
            cleanWs()
        }
    }
}