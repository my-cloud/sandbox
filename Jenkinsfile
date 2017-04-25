pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Tests...'
                checkout scm
                step([
                    $class: 'ExecuteDslScripts',
                    targets: '*.groovy'
                ])
             }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

