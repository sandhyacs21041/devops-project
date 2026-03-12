pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'cd backend && mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'cd backend && mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t placement-app .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8080:8080 placement-app'
            }
        }

    }
}