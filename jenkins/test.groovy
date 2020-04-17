pipeline {
    agent none
    stages {
        stage('Build') { 
            agent {docker 'node'}
            steps {
                sh "ls" 
            }
        }
        stage('Test') { 
            agent any
            steps {
                sh 'echo docker ps'
            }
        }
        stage('Deploy') { 
            agent any
            steps{
                sh 'git --version'
                sh 'docker --version'
            }
        }
    }
    post {
        
        always{
            node {}
            sh 'node -v'
            sh 'git --version'
        }
    }
}
