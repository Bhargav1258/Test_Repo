pipeline {
    agent any

    tools {
        jdk 'JDK21'
    }

    stages {
        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true, testResults: '**/surefire-reports/*.xml'
        }
    }
}