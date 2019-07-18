import jetbrains.buildServer.configs.kotlin.v2018_2.*

package _Self.buildTypes

object Build : BuildType({
    name = "BuildMain"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        script {
            name = "command-line-main"
            scriptContent = "echo command-line-main-step"
        }
    }

    triggers {
        vcs {
        }
    }
})
