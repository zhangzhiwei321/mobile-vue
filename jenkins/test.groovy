pipeline {
    agent none
    stages {
        stage('Build') { 
            agent {docker node}
            steps {
                sh "ls" 
            }
            steps {
                sh "echo install"
            }
            steps {
                sh "npm run build"
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
}
