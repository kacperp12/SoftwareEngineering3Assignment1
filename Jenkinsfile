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
        success {
            deploy(adapters:[tomcat(url:"http://localhost:8080", credentialsId:"token-tomcat", path:"")], war:"**/build/libs/*.war", contextPath:"")
        }
    }
}
