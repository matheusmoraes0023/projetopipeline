pipeline {
    agent any

    stages {
        stage('Declarative: Checkout SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Defina o caminho completo para o javac considerando o JDK 17 instalado
              script {
                    def javaHome = tool name: 'JDK-17', type: 'jdk'
                    bat label: 'Compile Java sources', script: "${javaHome}/bin/javac -d target src/*.java"
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
}
