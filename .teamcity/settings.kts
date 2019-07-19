import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.*

version = "2018.2"
project{
    buildType {
        id ("HelloWorld")
        name="HelloW"
        steps {
            script {
                scriptContent="echo HelloW"
            }
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

