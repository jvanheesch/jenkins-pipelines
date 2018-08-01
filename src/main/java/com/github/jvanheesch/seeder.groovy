package com.github.jvanheesch

pipelineJob('Generated') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/site-jenkins.git')
            }
            scriptPath("src/com/github/jvanheesch/build/Jenkinsfile")
        }
    }
}
