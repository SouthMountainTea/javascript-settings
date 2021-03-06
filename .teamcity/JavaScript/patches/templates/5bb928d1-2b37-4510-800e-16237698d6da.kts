package JavaScript.patches.templates

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the template with uuid = '5bb928d1-2b37-4510-800e-16237698d6da' (id = 'JavaScript_Template')
accordingly, and delete the patch script.
*/
changeTemplate(uuid("5bb928d1-2b37-4510-800e-16237698d6da")) {
    triggers {
        remove {
            vcs {
                id = "vcsTrigger"
                branchFilter = ""
            }
        }
    }
}
