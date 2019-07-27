def name="";

node {  
    stage('check') { 
        echo("check");
	echo(name);
	    try{
		 sh      "cd /var/lib/jenkins/workspace/gtihub1/jenkins-test1"   
		 sh	"git status"
		sh	"git pull https://github.com/zhangzhiwei321/jenkins-test1.git" 
		sh	"git branch"
		sh	"git checkout  master"
	    }catch(e){
		sh	"git clone  https://github.com/zhangzhiwei321/jenkins-test1.git"
		sh      "cd /var/lib/jenkins/workspace/gtihub1/jenkins-test1"
                sh	"git status"
		sh	"git pull https://github.com/zhangzhiwei321/jenkins-test1.git" 
		sh	"git branch"
		sh	"git checkout  master"
	    }
	    

    }
    stage('install') { 
        echo("install")
		echo(install);
		if(install){
		sh	"rm -rf node_modules*"
		sh	"npm i"
		}else{
			
		}
    }
    stage('build') { 
        echo("build")
		npm run build
    }

	stage("release"){
		echo("release")
	sh	"rm -rf /usr/local/nginx/web/vue/*"
	sh	"mv dist/* /usr/local/nginx/web/vue"
	}
}
