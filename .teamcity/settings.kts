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