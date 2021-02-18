node {

    stage('Clone repo') {
        git url: 'https://github.com/luisdaalegria/jenkinsIntegrationDemo.git',
        branch: 'master'
    }
    stage('Run script') {
        sh 'python helloWorld.py'
    }
    
}