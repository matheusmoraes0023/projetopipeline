pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Comandos para compilar o projeto
                sh 'javac -d target src/**/*.java'
            }
        }
        stage('Test') {
            steps {
                // Comandos para rodar os testes JUnit
                sh 'java -cp target:lib/junit-4.12.jar org.junit.runner.JUnitCore [ProdutoBeanTest]'
            }
        }
    }
}
