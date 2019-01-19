package JavaScript.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object JavaScript_HttpsGithubComSouthMountainTeaJavascriptSettings : GitVcsRoot({
    uuid = "781a7b56-dbc0-49b2-95f6-cebe005bffa5"
    name = "https://github.com/SouthMountainTea/javascript-settings"
    url = "https://github.com/SouthMountainTea/javascript-settings"
    authMethod = password {
        userName = "SouthMountainTea"
        password = "credentialsJSON:ae94a66c-f69c-4b47-8485-31385b0c9a69"
    }
})
