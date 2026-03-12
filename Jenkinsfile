
pipeline {
 agent any

 stages {

  stage('Clone'){
   steps{
    git 'https://github.com/yourusername/placement-devops-project.git'
   }
  }

  stage('Build'){
   steps{
    sh 'mvn -f backend/pom.xml clean install'
   }
  }

  stage('Test'){
   steps{
    sh 'mvn -f backend/pom.xml test'
   }
  }

  stage('Docker Build'){
   steps{
    sh 'docker build -t placement-app .'
   }
  }

  stage('Run Container'){
   steps{
    sh 'docker run -d -p 8080:8080 placement-app'
   }
  }

 }

}
