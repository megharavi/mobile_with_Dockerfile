node{
    stage("SCM checkout"){
        git poll: false, url: 'https://github.com/megharavi/mobile_with_Dockerfile.git'
    }
        
    stage('Mvn test') {
        steps{
            withMaven(maven : 'maven_3_6_0'){
            sh 'mvn test'
        }
        }
    }
    stage('Mvn DEPLOY') {
        steps{
            withMaven(maven : 'maven_3_6_0'){
            sh 'mvn deploy'
        }
        }
    }
}
