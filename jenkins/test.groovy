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
            agent {
                node{ reuseNode ture}
            }
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
