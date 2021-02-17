pipeline {
   agent any
    stages {
        stage('Init') {
            steps {
                echo 'Init phase'
                echo 'Starting pipeline'
            }
        }
        stage('Build') {
            steps {
                echo 'Building Sample Project'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in Staging Area'
            }
        }
        stage('Deploy Production') {
            steps {
                echo 'Deploy for production'
            }
        }
    }
}
