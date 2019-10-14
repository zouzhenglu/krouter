package com.kzl.module_topic

import android.app.Application
import android.util.Log
import com.kzl.krouter.CourseService
import com.kzl.krouter.TopicService
import com.kzl.krouter.injectService


class TopicApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "TopicApp onCreate")
        injectService<TopicService>(TopicServiceImpl)
    }
}