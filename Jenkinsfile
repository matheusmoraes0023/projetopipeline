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
                    // Compile Java classes
                    bat "\"${env.JAVA_HOME}\\bin\\javac\" -d target src/*.java"
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    // Run tests and generate reports
                    bat "\"${env.JAVA_HOME}\\bin\\java\" -cp target org.junit.runner.JUnitCore ProdutoBeanTest > target/test-report.xml"
                }
            }
            
            post {
                always {
                    // Archive JUnit test results
                    junit 'target/test-report.xml'
                }
            }
        }
    }
    
    post {
        always {
            // Additional post-build actions if needed
        }
    }
}
