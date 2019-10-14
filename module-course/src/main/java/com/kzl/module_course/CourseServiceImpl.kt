package com.kzl.module_course

import android.content.Context
import android.widget.Toast
import com.kzl.krouter.CourseService
import com.kzl.krouter.TopicService
import com.kzl.krouter.getService
import kotlin.LazyThreadSafetyMode.NONE

val topicService by lazy(NONE) { getService<TopicService>() }

internal object CourseServiceImpl : CourseService {

    override fun sayHello(ctx: Context) {
        Toast.makeText(ctx, "hello course service", Toast.LENGTH_LONG).show()
    }

}