package com.kzl.module_course

import android.content.Context
import android.widget.Toast
import com.kzl.krouter.CourseService
import com.kzl.krouter.Router


object CourseServiceImpl : CourseService {
    override fun inject() {
        Router.put<CourseService>(this)
    }

    override fun sayHello(ctx: Context) {
        Toast.makeText(ctx, "hello course service", Toast.LENGTH_LONG).show()
    }

}