#!/bin/bash -ilex

def name = "";

node {
	stage('check') {
		echo("check");
		echo(name);
		sh 'ls'
		sh 'git pull origin dev'
		sh 'git status'
		sh 'git branch'
		sh 'git checkout dev'
	}
	stage('install') {
		echo("install")
		echo(install);
		if (install) {
			sh "rm -rf node_modules*"
			sh "cnpm i"
		}
	}
	stage('build') {
		echo("build")
		sh "npm run build"
	}

	stage("release") {
		echo("release")
		sh "rm -rf /web/vue/*"
		sh "mv ./jenkins-test1/dist/* /web/vue"
	}
}
