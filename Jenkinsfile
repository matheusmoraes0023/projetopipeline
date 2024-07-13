pipeline {
    agent any

        environment {
        JAVA_HOME = tool name: 'JDK-17', type: 'jdk'
        GITHUB_APP_ID = credentials('944144')
        GITHUB_APP_KEY = credentials(' ff16150b40458883b7f10b527a62d2a0eca9522e ')
    }
    

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/matheusmoraes0023/projetopipeline', 
                    credentialsId: '944144',
                    branch: 'main'
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // Compile Java classes
                    bat "\"${env.JAVA_HOME}\\bin\\javac\" -cp \"lib/*\" -d target C:\\Users\\CLIENTE\\eclipse-workspace\\inf335Build\\src\\main\\java\\br\\unicamp\\inf335\\*.java"
                }
            }
        }
        
        stage('Test') {
            steps {
                // Inserir aqui os passos para testar o código Java
                // Por exemplo:
                // sh "\"${env.JAVA_HOME}/bin/java\" -cp target br.unicamp.inf335.Main"
                    bat "\"${env.JAVA_HOME}\\bin\\java\" -cp \"target;lib/*\" org.junit.runner.JUnitCore br.unicamp.inf335.ProdutoBeanTest > target/test-report.xml"
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

