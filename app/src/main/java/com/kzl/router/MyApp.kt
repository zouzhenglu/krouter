package com.kzl.router

import android.app.Application
import com.kzl.krouter.newInstance


class MyApp : Application() {

    private val modules = listOf(
        "com.kzl.module_home.HomeApp".newInstance(),
        "com.kzl.module_topic.TopicApp".newInstance(),
        "com.kzl.module_login.LoginApp".newInstance(),
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