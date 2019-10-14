package com.kzl.module_course

import android.content.Context
import android.widget.Toast
import com.kzl.krouter.CourseService
import com.kzl.krouter.injectService


object CourseServiceImpl : CourseService {
    override fun init() {
        injectService<CourseService>(this)
    }

    override fun sayHello(ctx: Context) {
        Toast.makeText(ctx, "hello course service", Toast.LENGTH_LONG).show()
    }

}