package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*

object JavaScript_02Chrome : BuildType({
    templates(JavaScript_Template)
    uuid = "6746f15f-066d-4157-97ad-24e2d85273cd"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        snapshot(JavaScript_01FastTests) {
        }
    }
})
