node{
    stage("SCM checkout"){
        git poll: false, url: 'https://github.com/megharavi/mobile_with_Dockerfile.git'
    }
        
    stage('Mvn test') {
        def mvnHOME = tool name: 'maven_3_6_0', type: 'maven'
        def mvnCMD = "${mvnHOME}/bin/mvn package"
    }
}
