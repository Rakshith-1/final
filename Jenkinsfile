pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build your Java application
                sh 'mvn package'
            }
        }

        stage('Docker Build') {
            steps {
                // Build a Docker image
                script {
                    docker.build("rakshith1/myapp:${env.BUILD_NUMBER}")
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                // Push the Docker image to Docker Hub
                script {
                    docker.withRegistry('https://registry.hub.docker.com', '73c99301-f497-4e7a-aa93-170753de3439') {
                        docker.image("rakshith1/myapp:${env.BUILD_NUMBER}").push()
                    }
                }
            }
        }
    }
}
