package com.kzl.router

import android.app.Application
import android.util.Log
import com.kzl.module_course.CourseApp
import com.kzl.module_home.HomeApp
import com.kzl.module_login.LoginApp
import com.kzl.module_topic.TopicApp


class MyApp : Application() {
    private val modules = listOf(HomeApp(), LoginApp(), CourseApp(), TopicApp())
    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "MyAPp onCreate")

        modules.forEach { it.onCreate() }
    }
}