import jetbrains.buildServer.configs.kotlin.v2018_2.*

version = "2018.1"
project{
    buildType(HelloWorld)
}
object HelloWorld : BuildType({
    name = "Hellow world"
    steps {
        scriptContent = "echo 'Hello world!'"
    }
})
