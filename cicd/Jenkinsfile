pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {
        stage('Reading parameters') {
            steps {
                echo BRANCH_NAME
            }
        }
    }
}