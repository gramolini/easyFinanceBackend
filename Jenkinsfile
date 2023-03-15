pipeline {
    agent any
    options {
        timeout(time: 15, unit: 'SECONDS')
    }
    stages {
        stage('Cleaning') {
            steps {
                sh 'mvn clean'
            }
            steps {
                sh 'mvn package'
            }
        }
    }
}