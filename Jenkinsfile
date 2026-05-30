pipeline {
    agent any

    stages {
        stage('Check Java') {
            steps {
                bat 'java -version'
                bat 'javac -version'
                bat 'mvn -version'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}