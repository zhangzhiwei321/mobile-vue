def name="";

node {  
    stage('check') { 
        echo("check");
		echo(name);
		try{
		sh	"git branch"
		sh	"git checkout  master"
		sh	"git pull" 
		}catch(e){
		sh	"git clone  git.github.com/zhangzhiwei321/jenkins-test1.git"
		sh	"git branch"
		sh	"git checkout  master"
		sh	"git pull" 
		}
		

    }
    stage('install') { 
        echo("install")
		echo(install);
		if(install){
		sh	"rm -rf node_modules*"
		sh	"cnpm i"
		}else{
			
		}
    }
    stage('build') { 
        echo("build")
		npm run build
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
