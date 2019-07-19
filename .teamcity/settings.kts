import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.*

version = "2018.2"
project{
    buildType(HelloWorld)
}
object HelloWorld : BuildType({
    name = "Hellow world"
    steps {
        script {
            scriptContent = "echo 'Hello world!'"
        }
    }
})

object HelloWorld2 : BuildType({
    name = "Hellow world 2"
    steps {
        script {
            scriptContent = "echo 'Hello world! 2'"
        }
    }
})
