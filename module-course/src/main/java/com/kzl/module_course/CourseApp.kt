package com.kzl.module_course

import android.app.Application
import android.util.Log


class CourseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "CourseApp onCreate")
        CourseServiceImpl.inject()
    }
}