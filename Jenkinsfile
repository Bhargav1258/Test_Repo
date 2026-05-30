pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            publishTestNGResults(
                testResultsPattern: 'test-output/testng-results.xml'
            )
        }
    }
}