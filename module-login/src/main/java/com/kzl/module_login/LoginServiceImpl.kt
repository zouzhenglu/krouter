package com.kzl.module_login

import android.content.Context
import android.widget.Toast
import com.kzl.krouter.LoginService
import com.kzl.krouter.injectService


object LoginServiceImpl : LoginService {


    override fun sayHello(ctx: Context) {
        Toast.makeText(ctx, "hello login service", Toast.LENGTH_LONG).show()
    }

    override fun init() {
        injectService<LoginService>(this)
    }
}