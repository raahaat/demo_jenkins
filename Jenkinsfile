pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build the World'
            }
        }
            
            stage('Test') {
            steps {
                echo 'Test the World'
            }
            }
            
            stage('Deploy') {
            steps {
                echo 'Deploy the World'
            }
            }
        }
        post{
            always{
                emailext body: '''Hey!
                                your code is unable to build!''', subject: 'failure', to: 'rahat_ahmed@ymail.com'
            }
        }
    }
