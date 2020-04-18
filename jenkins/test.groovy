input '00000'
pipeline {
    agent none
    stages {
          stage('Check') { 
            agent any
            steps {
                sh "echo BUILD_NUMBER=${BUILD_NUMBER}"
                sh "echo BUILD_TAG=${BUILD_TAG}"
                sh "echo BUILD_URL=${BUILD_URL}"
                sh "echo EXECUTOR_NUMBER=${EXECUTOR_NUMBER}"
                sh "echo JAVA_HOME=${JAVA_HOME}"
                sh "echo JENKINS_URL=${JENKINS_URL}"
                sh "echo JOB_NAME=${JOB_NAME}"
                sh "echo NODE_NAME=${NODE_NAME}"
                sh "echo WORKSPACE=${WORKSPACE}"
                sh "echo params=${params}"
            }
        }
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
             post {
                 always{
                     sh 'git --version'
                }
            }
        }
    }

}
