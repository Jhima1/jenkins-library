pipelineJob('EasyClaimBackend') {
    description('EasyClaimBackend')
    triggers {
        scm('* * * * *')
    }
    
    definition {
        cpsScm {
            lightweight(true)
            git {
                branch('master')
                remote{
                    url('https://github.com/vigneshsweekaran/jenkins-library.git')   
                }
                extensions {
                    wipeOutWorkspace()
                }
            }
            scriptPath('pipeline/backend-jenkinsfile')
        }
    }
}
