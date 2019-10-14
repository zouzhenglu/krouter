package com.kzl.module_home

import android.app.Application
import com.kzl.krouter.newInstance


class DebugHomeApp :Application(){

    private val modules = listOf(
        "com.kzl.module_login.LoginApp".newInstance(),
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