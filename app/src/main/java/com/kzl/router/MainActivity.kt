package com.kzl.router

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kzl.krouter.*
import kotlin.LazyThreadSafetyMode.NONE

internal val homeService by lazy(NONE) { getService<HomeService>() }
internal val loginService by lazy(NONE) { getService<LoginService>() }
internal val courseService by lazy(NONE) { getService<CourseService>() }
internal val topicService by lazy(NONE) { getService<TopicService>() }

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.home).setOnClickListener {
            homeService.let {
                it.sayHello(this)
                it.toHomeActivity(this)
            }
        }

        findViewById<View>(R.id.login).setOnClickListener {
            loginService.sayHello(this)
        }

        findViewById<View>(R.id.course).setOnClickListener {
            courseService.sayHello(this)
        }

        findViewById<View>(R.id.topic).setOnClickListener {
            topicService.sayHello(this)
        }
    }

}
