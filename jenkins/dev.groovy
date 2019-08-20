def name = "";

node {
	stage('check') {
		echo("check");
		echo(name);
		git url: 'git@github.com:zhangzhiwei321/mobile-vue.git', branch: 'dev';
	}
	stage('install') {
		echo("install")
		echo(install);
		if (params.install) {
			echo(install);
			sh "rm -rf node_modules*"
			sh "cnpm i"
		}
	}
	stage('build') {
		echo("build")
		sh "npm run build"
	}

	stage("release") {
		echo("release")
		sh "rm -rf /web/vue/*"
		sh "mv dist/* /web/vue"
	}
}   

