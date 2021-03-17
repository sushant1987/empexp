
pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                withMaven(maven: 'Maven') {
                    sh "mvn -Dmaven.test.failure.ignore=true clean package"
                }
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
