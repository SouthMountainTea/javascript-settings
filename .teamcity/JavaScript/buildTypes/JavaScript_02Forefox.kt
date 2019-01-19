package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*

object JavaScript_02Forefox : BuildType({
    templates(JavaScript_Template)
    uuid = "c02b8c43-a8dc-4f02-a30d-916ad97c199c"
    name = "02. Forefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        snapshot(JavaScript_01FastTests) {
        }
    }
})
