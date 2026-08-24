pipeline {
    agent any

    tools { 
        maven 'Lab Maven'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build Jar') {
            steps {
                sh 'mvn -B clean package'
            }
        }
        stage('Build Image') {
            steps {
                sh 'docker build -t team-skeleton .'
            }
        }
        stage('Smoke Test') {
            steps {
                sh 'docker run --rm team-skeleton'
            }
        }
    }
}
