pipeline {
    agent any
    options {
        timeout(time: 15, unit: 'SECONDS')
    }
    stages {
        stage('Cloning repository') {
            steps {
                bat 'git clone https://github.com/gramolini/financeManagerForAllBackend.git'
            }
        }
        stage('Building') {
            steps {
                bat 'mvn clean'
                bat 'mvn package'
            }
        }
        stage('Sending to cloud') {
            steps {
                bat 'mvn dockerfile:push'
            }
        }
    }
}