package com.kzl.module_topic

import android.app.Application
import android.util.Log
import com.kzl.krouter.LoginService
import com.kzl.krouter.Router
import com.kzl.krouter.TopicService


class TopicApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "TopicApp onCreate")
        TopicServiceImpl.init()
    }
}