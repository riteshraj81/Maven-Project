job('my-dsl-job-1') {
    logRotator(5, 10)
    jdk('Java 8')
    scm {
        git('https://github.com/riteshraj81/Maven-Project.git', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        maven ('clean test package')
    }
}
