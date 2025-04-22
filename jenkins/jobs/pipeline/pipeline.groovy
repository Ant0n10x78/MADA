pipelineJob('pipeline') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('http://gitlab:8929/root/test.git')
                    }
                    branch('main')
                }
                scriptPath('Jenkinsfile')
            }
        }
    }
}