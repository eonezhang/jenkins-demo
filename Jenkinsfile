#!/usr/bin/groovy
@Library('eone_shared_lib')
import com.eonezhang.jenkins.pipelineshared.Utils
def util = new Utils()

node {
	stage('Canary release') {
		echo 'NOTE: running pipelines for the first time will take longer as build and base docker images are pulled onto the node'
		echo util.helloWorld()
		// echo "project version is ${util.getProjectVersion()}"
		echo util.getPomVersion(pwd() + "@script/pom.xml")
		// echo util.getProjectVersion()
	}
	stage('Canary release1') {
		echo 'NOTE: running pipelines for the first time will take longer as build and base docker images are pulled onto the node'
	}
}