def name="";

node {  
    stage('check') { 
        echo("check");
	echo(name);	
	         "rm -rf /var/lib/jenkins/workspace/Pipeline-test1/jenkins-test1/*"
	    	 git clone git@github.com:zhangzhiwei321/jenkins-test1.git/
		 git status
	         git pull origin dev
	    	 git branch
	    	 git checkout dev
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
