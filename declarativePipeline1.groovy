pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                dir('repo1') 
                {
                    git url: 'https://github.com/luisdaalegria/jenkinsIntegrationDemo.git',
                    branch: 'master'
                }
            }
        }
    }
}