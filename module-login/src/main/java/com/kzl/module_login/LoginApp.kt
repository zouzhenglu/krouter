package com.kzl.module_login

import android.app.Application
import android.util.Log
import com.kzl.krouter.CourseService
import com.kzl.krouter.LoginService
import com.kzl.krouter.injectService


class LoginApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e("APP", "LoginApp onCreate")
        injectService<LoginService>(LoginServiceImpl)

    }
}