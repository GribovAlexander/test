package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'HelloWorld1'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("HelloWorld1")) {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true

    expectSteps {
        script {
            scriptContent = "echo HelloW1"
        }
    }
    steps {
        insert(0) {
            powerShell {
                scriptMode = script {
                    content = "Write-Host 11"
                }
            }
        }
        items.removeAt(1)
    }
}
