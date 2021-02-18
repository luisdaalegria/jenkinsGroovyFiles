pipeline {
    agent any
    stages {
        stage('Clone repo') {
            steps {
                dir('repo1') 
                {
                    git url: 'https://github.com/luisdaalegria/jenkinsIntegrationDemo.git',
                    branch: 'master'
                }
            }
        }
        stage('Run script') {
            steps {
                dir('repo1') 
                {
                    sh 'python helloWorld.py'
                }
            }
        }
    }
}