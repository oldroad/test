
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
