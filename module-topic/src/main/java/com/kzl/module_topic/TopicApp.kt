package com.kzl.module_topic

import android.app.Application
import android.util.Log


class TopicApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "TopicApp onCreate")
        TopicServiceImpl.init()
    }
}