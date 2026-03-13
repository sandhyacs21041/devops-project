pipeline {
    agent any

    stages {

        stage('Checkout SCM') {
            steps {
                git branch: 'main', url: 'https://github.com/sandhyacs21041/devops-project.git'
            }
        }

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
                bat 'docker stop placement-container || exit 0'
                bat 'docker rm placement-container || exit 0'
                bat 'docker run -d -p 8080:8080 --name placement-container placement-app'
            }
        }

    }
}