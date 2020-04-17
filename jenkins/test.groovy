pipeline {
    agent {
        docker {
            image 'node'
            args '--name vue-mobile'
        }
    } 
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
                sh "npm install --registry=https://registry.npm.taobao.org"
            }
        }
    }
}
