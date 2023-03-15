pipeline {
    agent any
    options {
        timeout(time: 15, unit: 'SECONDS')
    }
    stages {
        stage('Cloning repository') {
            steps {
                sh 'git clone https://github.com/gramolini/financeManagerForAllBackend.git'
            }
        }
        stage('Building') {
            steps {
                sh './mvn clean'
                sh './mvn package'
            }
        }
        stage('Sending to cloud') {
            steps {
                sh './mvn dockerfile:push'
            }
        }
    }
}