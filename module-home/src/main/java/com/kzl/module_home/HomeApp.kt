package com.kzl.module_home

import android.app.Application
import com.kzl.krouter.HomeService
import com.kzl.krouter.injectService


class HomeApp : Application() {
    override fun onCreate() {
        super.onCreate()
        injectService<HomeService>(HomeServiceImpl)
    }
}
