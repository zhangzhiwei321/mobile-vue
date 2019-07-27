def name="";

node {  
    stage('check') { 
        echo("check");
	    sh "rm -rf /var/lib/jenkins/workspace/gtihub1/jenkins-test1"
		echo(name);
		sh	"git clone  https://github.com/zhangzhiwei321/jenkins-test1.git"
		sh      "cd /var/lib/jenkins/workspace/gtihub1/jenkins-test1"
                sh	"git status"
		sh	"git pull https://github.com/zhangzhiwei321/jenkins-test1.git" 
		sh	"git branch"
		sh	"git checkout  master"

    }
    stage('install') { 
        echo("install")
	    sh      "cd /var/lib/jenkins/workspace/gtihub1/jenkins-test1"
		echo(install);
		if(install){
		sh	"rm -rf node_modules*"
		sh	"cnpm i"
		}else{
			
		}
    }
    stage('build') { 
        echo("build")
	    sh      "cd /var/lib/jenkins/workspace/gtihub1/jenkins-test1"
		npm run build
    }

	stage("release"){
		echo("release")
	sh	"rm -rf /usr/local/nginx/web/vue/*"
	sh	"mv dist/* /usr/local/nginx/web/vue"
	}
}
