package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import JavaScript.vcsRoots.JavaScript_HttpsGithubComSouthMountainTeaJavascriptSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "4331775d-5d20-4554-8b43-695c54d92a81"
    id("JavaScript")
    parentId("_Root")
    name = "JavaScript"
    description = "My JS Project"

    vcsRoot(JavaScript_HttpsGithubComSouthMountainTeaTeamcityCourseCards)
    vcsRoot(JavaScript_HttpsGithubComSouthMountainTeaJavascriptSettings)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_02Forefox)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_01FastTests)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_4"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${JavaScript_HttpsGithubComSouthMountainTeaJavascriptSettings.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
