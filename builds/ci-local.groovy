pipeline {
    agent any

    stages {
        stage('Unit Testing') {
            steps {
                echo 'Hello World'
            }
        }
    }

    post {
        always {
            postBuildNimble(webhookToken: '736903366', webhookUrl: 'https://e4cd-140-82-201-129.in.ngrok.io/rest/v2/api/IntegrationService/apps/jenkins/COGN000134ECR1')
        }
    }
}
