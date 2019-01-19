package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object JavaScript_Template : Template({
    uuid = "5bb928d1-2b37-4510-800e-16237698d6da"
    name = "Template"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComSouthMountainTeaTeamcityCourseCards)
    }

    steps {
        script {
            name = "npm install"
            id = "RUNNER_10"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_11"
            scriptContent = "npm test -- --single-run --browsers %Browser%  --colors false --reporters teamcity"
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = ""
        }
    }
})
