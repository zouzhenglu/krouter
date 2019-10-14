package com.kzl.module_login

import android.app.Application
import android.util.Log


class LoginApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "LoginApp onCreate")
        LoginServiceImpl.init()

    }
}