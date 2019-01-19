package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*

object JavaScript_01FastTests : BuildType({
    templates(JavaScript_Template)
    uuid = "ac940b56-82c8-4ca7-9654-97be1dcc84e0"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
