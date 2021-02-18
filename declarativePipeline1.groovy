

pipeline {
    agent any
    parameters {
        string(name: 'STRING_TO_PRINT_ONE', defaultValue: 'TESTING' )
        string(name: 'STRING_TO_PRINT_TWO', defaultValue: 'TESTING' )
    }

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

        stage('String to print 1') {
            steps {
                dir('repo1') 
                {
                    println "String to print 1 is: $STRING_TO_PRINT"
                }
            }
        }

        stage('String to print 2') {
            steps {
                dir('repo1') 
                {
                    println "String to print 2 is: $STRING_TO_PRINT"
                }
            }
        }
    }
}