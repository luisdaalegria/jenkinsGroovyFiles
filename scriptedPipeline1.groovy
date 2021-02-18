node {
     properties([
        parameters([
            string(name: 'STRING_TO_PRINT_ONE', defaultValue: 'TESTING' ),
            string(name: 'STRING_TO_PRINT_TWO', defaultValue: 'TESTING' )
        ])
    ])    

    stage('Clone repo') {
        git url: 'https://github.com/luisdaalegria/jenkinsIntegrationDemo.git',
        branch: 'master'
    }
    stage('Run script') {
        sh 'python helloWorld.py'
    }

    stage('String to print 1') {
        println "String to print 1 is: $STRING_TO_PRINT_ONE"
    }

    stage('String to print 2') {
        println "String to print 2 is: $STRING_TO_PRINT_TWO"
    }
    
}