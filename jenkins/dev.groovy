def name="";

node {  
    stage('check') { 
        echo("check");
		echo(install);
    }
    stage('install') { 
        echo("install")
    }
    stage('build') { 
        echo("build")
    }
}
