package com.github.jvanheesch

pipelineJob('Test branches') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/branchestest/Jenkinsfile")
        }
    }
}

pipelineJob('Temp-maven-testing') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/temp/Jenkinsfile")
        }
    }
}

pipelineJob('Temp-maven-testing2') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/siteparentpom/deploy/Jenkinsfile")
        }
    }
}

pipelineJob('Deploy-Site-Parent-Pom') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/siteparentpom/deploy/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Build') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/build/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Build-Child') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/sitechildpom/build/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/site/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site-Shit') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/sitedeploy/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site-Multimodule') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/sitemultimodule/Jenkinsfile")
        }
    }
}

pipelineJob('Generated-Site-Child') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jvanheesch/jenkins-pipelines.git')
            }
            scriptPath("src/main/java/com/github/jvanheesch/sitechildpom/Jenkinsfile")
        }
    }
}
