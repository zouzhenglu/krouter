package com.kzl.module_course

import android.app.Application
import com.kzl.krouter.newInstance


class DebugCourseApp :Application(){

    private val modules = listOf(
        "com.kzl.module_topic.TopicApp".newInstance(),
        "com.kzl.module_course.CourseApp".newInstance()
    )

    override fun onCreate() {
        super.onCreate()
        modules.forEach {
            require(it is Application)
            it.onCreate()
        }
    }
}