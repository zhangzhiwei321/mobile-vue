#!/bin/bash -ilex
def name="";

node {  
    stage('check') { 
        	echo("check");
		echo(name);
		if [ -d "./Pipeline-script/.git" ];then
		echo "文件夹存在"
	    	sh 'cd jenkins-test1'
	        git 'pull origin dev'
	    	git 'status'
	    	git 'branch'
	    	git 'checkout dev'
		else
		echo "文件夹不存在"
		git clone https://github.com/zhangzhiwei321/jenkins-test1.git
	    	sh 'cd jenkins-test1'
	        git 'pull origin dev'
	    	git 'status'
	    	git 'branch'
	    	git 'checkout dev'
		fi
    }
    stage('install') { 
        echo("install")
		echo(install);
		if(install){
		sh "rm -rf node_modules*"
		sh "cnpm i"
		}
    }
    stage('build') { 
        	echo("build")
		sh "npm run build"
    }

	stage("release"){
		echo("release")
		sh "rm -rf /usr/local/nginx/web/vue/*"
		sh"mv dist/* /usr/local/nginx/web/vue"
	}
}
