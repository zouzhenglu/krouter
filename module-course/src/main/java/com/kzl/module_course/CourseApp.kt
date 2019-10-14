package com.kzl.module_course

import android.app.Application
import android.util.Log
import com.kzl.krouter.CourseService
import com.kzl.krouter.injectService


class CourseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "CourseApp onCreate")
        injectService<CourseService>(CourseServiceImpl)
    }
}