node{
    stage("SCM checkout"){
        git poll: false, url: 'https://github.com/megharavi/mobile_with_Dockerfile.git'
    }
        
    stage('Mvn test') {
        mvnHOME = tool 'maven'
        withEnv([MVN_HOME = $mvnHOME]){
        sh '"{$MVN_HOME}/bin/mvn" -Dmaven.test.failure.ignore clean package'
        }
    }
   stage('Results') {
       junit '**/target/surefire-reports/TEST-*.xml'
       archiveArtifacts 'target/*.jar'
   }
}
