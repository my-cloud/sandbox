pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
                step([
                    $class: 'ExecuteDslScripts',
                    targets: '*.groovy'
                ])
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

