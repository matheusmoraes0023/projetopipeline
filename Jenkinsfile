pipeline {
 agent any
    
    environment {
        JAVA_HOME = tool name: 'JDK-17', type: 'jdk'
    }
    
    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }
        
        stage('Build') {
            steps {
                script {
                    bat script: "\"${env.JAVA_HOME}\\bin\\javac\" -d target src/**/*.java", 
                        label: 'Compile Java classes'
                }
            }
        }
        stage('Test') {
            steps {
                // Comandos para rodar os testes JUnit no Windows
                bat 'java -cp target;lib\\junit-4.12.jar org.junit.runner.JUnitCore [ProdutoBeanTest]'
            }
        }
    }

      post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
