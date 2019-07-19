import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.*

version = "2018.2"
project{
    vcsRoot {
        GetVcsRoot({
            id("KotlinTestVcs")
            name = "kotlin_test_vcs"
            url = "https://github.com/GribovAlexander/test-slave.git"
            branchSpec = "+:refs/heads/*"
            authMethod = password {
                userName = "GribovAlexander"
                password = "credentialsJSON:9fe5000e-f6ce-4c30-8a3e-b95501181cec"
            }
        })
    }
    buildType {
        id ("HelloWorld")
        name="HelloW"
        steps {
            script {
                scriptContent="echo HelloW"
            }
        }
        vcs {
            add(RelativeId("KotlinTestVcs"))
        }
    }
    buildType {
        id ("HelloWorld1")
        name="HelloW1"
        steps {
            script {
                scriptContent="echo HelloW1"
            }
        }
    }
}

