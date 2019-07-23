def name="";

node {  
    stage('check') { 
        echo("check")
	echo(name)
    }
    stage('install') { 
        echo("install")
	    echo(install)	;
    }
    stage('build') { 
        echo("build")
    }
}
