pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        echo 'hhhh'
      }
    }
    post {
    always {
        mail to: 'old_road@qq.com',
             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Something is wrong with ${env.BUILD_URL}"
    }
  }
  }
}
