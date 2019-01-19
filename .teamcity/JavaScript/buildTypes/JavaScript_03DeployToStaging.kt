package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object JavaScript_03DeployToStaging : BuildType({
    uuid = "2fed58cc-4361-4e23-8e4b-140587c1bead"
    name = "03. Deploy To Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComSouthMountainTeaTeamcityCourseCards)
    }

    triggers {
        vcs {
            branchFilter = ""
        }
    }

    dependencies {
        snapshot(JavaScript_02Chrome) {
        }
        snapshot(JavaScript_02Forefox) {
        }
    }
})
