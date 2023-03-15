pipeline {
    agent any
    options {
        timeout(time: 15, unit: 'SECONDS')
    }
    stages {
        stage('Building') {
            steps {
                sh 'mvn clean'
                sh 'mvn package'
            }
        }
        stage('Sending to cloud') {
            steps {
                sh 'mvn dockerfile:push'
            }
        }
    }
}