
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
    
    post {
        echo '发送邮件'
        always {
        mail to: 'old_road@qq.com',
             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Something is wrong with ${env.BUILD_URL}"
            }
        }
}
