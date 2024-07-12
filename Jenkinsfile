pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Comandos para compilar o projeto no Windows
                bat 'javac -d target src/**/*.java'
            }
        }
        stage('Test') {
            steps {
                // Comandos para rodar os testes JUnit no Windows
                bat 'java -cp target;lib\\junit-4.12.jar org.junit.runner.JUnitCore [NomeDaClasseDeTeste]'
            }
        }
    }
}
