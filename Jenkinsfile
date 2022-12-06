pipeline {

    agent any
    stages {
        stage('Checkout Codebase'){
            steps {
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: 
                [[credentialsId: 'github-ssh-key', url: 'git@github.com:jpbraganca/JavaProjectTenis.git']]]
            }
        }

        stage('Build') {
            steps{
                sh 'cd src ; javac -cp "../lib/junit-4.12.jar" ./control/Programa.java ./test/ProgramaTest.java'
            }
        }

        stage('Test') {
            steps{
                sh 'cd src/ ; java -cp ../lib/junit-4.12.jar:../lib/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore test.ProgramaTest'
            }
        }

        stage('Deploy') {
            steps{
                sh 'cd src/control ; java -cp control Programa'
            }
        }
    }

}