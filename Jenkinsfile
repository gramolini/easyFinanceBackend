pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                bat 'mvn -version'
                bat 'mvn clean install'
            }
        }
        stage('Sending to cloud') {
            steps {
                bat 'mvn dockerfile:push'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}