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
                echo 'Testing dsl..'
                step([
                    $class: 'ExecuteDslScripts',
                    targets: '*.groovy',
                    lookupStrategy: 'SEED_JOB'
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

