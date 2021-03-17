
pipeline {
    agent any
    tools {
        // Install the Maven version configured as "Maven" and add it to the path.
        maven "Maven"
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
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
