package patches.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a vcsRoot with id = 'HttpsGithubComGribovAlexanderTestSlaveGitRefsHeadsMaste'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, GitVcsRoot({
    id("HttpsGithubComGribovAlexanderTestSlaveGitRefsHeadsMaste")
    name = "https://github.com/GribovAlexander/test-slave.git#refs/heads/master"
    url = "https://github.com/GribovAlexander/test-slave.git"
    authMethod = password {
        userName = "GribovAlexander"
        password = "credentialsJSON:9fe5000e-f6ce-4c30-8a3e-b95501181cec"
    }
}))

