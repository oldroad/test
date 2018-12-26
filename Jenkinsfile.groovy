
Jenkinsfile (Declarative Pipeline)
pipeline {
    agent { docker 'python:3.5.1' }
    stages {
        echo '这是一个测试的流水号'
    }
}
