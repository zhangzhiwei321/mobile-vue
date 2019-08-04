def name="";

node {  
    stage('check') { 
        	echo("check");
		echo(name);	
	    	sh 'cd jenkins-test1'
	        git 'pull origin dev'
	    	git 'status'
	    	git 'branch'
	    	git 'checkout dev'
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
