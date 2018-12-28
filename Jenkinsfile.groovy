Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any 

    stages {
        stage('Build') { 
            steps { 
                echo '构建'
            }
        }
        stage('Test'){
            steps {
                sh 'make check'
                echo '测试'
            }
        }
        stage('Deploy') {
            steps {
               echo '发布'
            }
        }
    }
}
