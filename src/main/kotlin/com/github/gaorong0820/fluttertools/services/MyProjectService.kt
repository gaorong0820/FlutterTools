package com.github.gaorong0820.fluttertools.services

import com.github.gaorong0820.fluttertools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
