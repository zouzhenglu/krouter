package com.kzl.module_home

import android.app.Application
import android.util.Log


class HomeApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "HomeApp onCreate")
        HomeServiceImpl.init()
    }
}
