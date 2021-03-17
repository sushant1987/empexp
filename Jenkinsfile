
pipeline {
    agent any
    environment {
        MAVEN_HOME = "C:\dev\bin\maven"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }

    }
}
