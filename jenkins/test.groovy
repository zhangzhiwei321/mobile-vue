pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh "ls" 
            }
        }
        stage('Test') { 
            steps {
                sh "echo install"
            }
        }
        stage('Deploy') { 
            steps {
                sh "docker ps"
            }
        }
    }
}
