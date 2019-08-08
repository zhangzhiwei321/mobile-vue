#!/bin/bash -ilex
def name="";

node { 
 stage('check') { 
 echo("check");
 echo(name);
 sh 'ls'
 sh 'cd jenkins-test1&&git pull origin dev'
 sh 'ls'
 sh 'cd jenkins-test1&&git pull origin dev'
 sh 'cd jenkins-test1&&git status'
 sh 'cd jenkins-test1&&git branch'
 sh 'cd jenkins-test1&&git checkout dev'
    }
 stage('install') { 
 echo("install")
 echo(install);
 if(install){
 sh "cd jenkins-test1&&rm -rf node_modules*"
 sh "cd jenkins-test1&&cnpm i"
		}
    }
 stage('build') { 
 echo("build")
 sh "cd jenkins-test1&&npm run build"
    }

 stage("release"){
 echo("release")
 sh "rm -rf /web/vue/*"
 sh"mv ./jenkins-test1/dist/* /web/vue"
	}
}
