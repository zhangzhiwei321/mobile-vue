def name="";

node {  
    stage('check') { 
<<<<<<< .mine
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
		
=======
        echo("check")
	echo(name)











>>>>>>> .theirs
    }
    stage('install') { 
        echo("install")
<<<<<<< .mine
		echo(install);
		if(install){
			rm -rf node_modules*
			cnpm i
		}else{
			
		}
=======
	    echo(install)	;






>>>>>>> .theirs
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
