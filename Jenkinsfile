pipeline {
agent any


tools {
    jdk 'JDK21'
}

stages {

    stage('Checkout') {
        steps {
            git branch: 'regression',
                url: 'https://github.com/Bhargav1258/Test_Repo.git'
        }
    }

    stage('Build and Test') {
        steps {
            bat 'mvn clean test'
        }
    }stage('Docker Build') {

    steps {

        bat 'docker build -t cucumber-framework .'

    }

}

stage('Docker Run') {

    steps {

        bat 'docker run --rm cucumber-framework'

    }

}

    stage('Publish Results') {
        steps {
            junit allowEmptyResults: true,
            testResults: '**/surefire-reports/*.xml'
        }
    }
}

post {

    success {
        echo 'Build Successful'
    }

    failure {
        echo 'Build Failed'
    }

    always {
        echo 'Pipeline Execution Completed'
    }
}


}
