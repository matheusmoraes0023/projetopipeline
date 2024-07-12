pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Comandos para compilar o projeto no Windows
                bat "C:\Program Files\Java\jdk-17\bin\javac" -d target src/**/*.java
            }
        }
        stage('Test') {
            steps {
                // Comandos para rodar os testes JUnit no Windows
                bat 'java -cp target;lib\\junit-4.12.jar org.junit.runner.JUnitCore [ProdutoBeanTest]'
            }
        }
    }
}
