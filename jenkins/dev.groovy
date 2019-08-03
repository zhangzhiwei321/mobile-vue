def name="";

node {  
    stage('check') { 
        	echo("check");
		echo(name);	
	         "rm -rf /var/lib/jenkins/workspace/Pipeline-test1/jenkins-test1/*"
	    	 sh 'git clone git@github.com:zhangzhiwei321/jenkins-test1.git/'
		 'git status'
	         'git pull origin dev'
	    	 'git branch'
	    	 'git checkout dev'
    }
    stage('install') { 
        echo("install")
		echo(install);
		if(install){
		"rm -rf node_modules*"
		"cnpm i"
		}
    }
    stage('build') { 
        	echo("build")
		"npm run build"
    }

	stage("release"){
		echo("release")
		"rm -rf /usr/local/nginx/web/vue/*"
		"mv dist/* /usr/local/nginx/web/vue"
	}
}
