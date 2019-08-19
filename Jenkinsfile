pipeline {
agent any
stages {  	  
  stage ('Compile') {
      steps {
                withMaven(maven : 'maven_3_6_1') {
                    bat 'mvn clean compile'
                }
            }
        }
     stage ('Testing Stage') {
            steps {
                withMaven(maven : 'maven_3_6_1') {
                    bat 'mvn test'
                }
            }
        }
  }
}