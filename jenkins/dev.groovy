def name="";

node {  
    stage('check') { 
        echo("check");
		echo(name);
		try{
			git branch
			git checkout  master
			git pull 
		}catch(e){
			git clone  git@github.com:zhangzhiwei321/jenkins-test1.git
			git branch
			git checkout  master
			git pull 
		}
		

    }
    stage('install') { 
        echo("install")
		echo(install);
		if(install){
			rm -rf node_modules*
			cnpm i
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
		rm -f /usr/local/nginx/web/vue/*
		mv dist/* /usr/local/nginx/web/vue
	}
}
