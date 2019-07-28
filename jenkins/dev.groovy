def name="";

node {  
    stage('check') { 
        echo("check");
	echo(name);	
	    	sh      "cd /var/lib/jenkins/workspace/Pipeline-test1/jenkins-test1"
		sh	"git status"
	    	sh	"git pull origin dev:dev"
	    	sh	"git branch"
	    	sh	"git checkout dev"
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
		sh     "cnpm run build"
    }

	stage("release"){
		echo("release")
	sh	"rm -rf /usr/local/nginx/web/vue/*"
	sh	"mv dist/* /usr/local/nginx/web/vue"
	}
}
