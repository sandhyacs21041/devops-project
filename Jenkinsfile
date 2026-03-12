pipeline {
 agent any

 stages {

  stage('Clone') {
   steps {
    git branch: 'main', url: 'https://github.com/sandhyacs21041/devops-project.git'
   }
  }

  stage('Build') {
   steps {
    bat 'mvn clean install'
   }
  }

  stage('Test') {
   steps {
    bat 'mvn test'
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