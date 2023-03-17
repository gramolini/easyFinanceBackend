pipeline {
    agent any
    stages {

        stage('Build') {
            steps {
                bat 'mvn -version'
                bat 'mvn clean install'
            }
        }
        stage('Send image to Docker Hub') {
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