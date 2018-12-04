pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello world!'
                sh 'chmod +x drivers/phantomjs'
                sh 'chmod +x ./gradlew'
                sh './gradlew clean test'
            }
        }
    }
}