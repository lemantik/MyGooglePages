pipeline {
    agent any 
    stages {
        stage('Grant access to files') {
            steps {
                sh 'chmod +x drivers/phantomjs'
                sh 'chmod +x ./gradlew'
            }
        }
        stage('Execute Gradle Tasks - clean and test') {
            steps {
                sh './gradlew clean test'
            }
        }
    }
}