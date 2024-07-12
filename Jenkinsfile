pipeline {
    agent any

        environment {
        JAVA_HOME = tool name: 'JDK-17', type: 'jdk'
    }
    

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // Compile Java classes
                    bat "\"${env.JAVA_HOME}\\bin\\javac\" -d target C:\\Users\\CLIENTE\\eclipse-workspace\\inf335Build\\src\\main\\java\\br\\unicamp\\inf335\\*.java"
                }
            }
        }
        
        stage('Test') {
            steps {
                // Inserir aqui os passos para testar o código Java
                // Por exemplo:
                // sh "\"${env.JAVA_HOME}/bin/java\" -cp target br.unicamp.inf335.Main"
                 bat "\"${env.JAVA_HOME}\\bin\\java\" -cp target org.junit.runner.JUnitCore ProdutoBeanTest > target/test-report.xml"
            }
        }
    }
    
    post {
        always {
            // Inserir aqui ações que devem ser realizadas sempre após a execução dos estágios
            // Por exemplo, arquivar resultados ou enviar notificações
                        archiveArtifacts artifacts: 'target/*.class', allowEmptyArchive: true
        }
    }
}

