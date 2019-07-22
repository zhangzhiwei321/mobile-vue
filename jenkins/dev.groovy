def name="";

node {  
    stage('check') { 
        echo("check")
		
    }
    stage('install') { 
        echo("install")
    }
    stage('build') { 
        echo("build")
    }
}
