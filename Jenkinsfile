pipeline {
    agent any

    stages {
        stage('Compile')
        {
            steps {
                bat './gradlew build'
            }
        }
    }
    post {
        success{
            deploy adapters: [tomcat9(url:"http://localhost:8080", credentialsId:"tomcat", path:"")], war:"**/build/libs/*.war", contextPath:""
        }
    }
}
