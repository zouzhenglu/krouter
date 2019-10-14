package com.kzl.router

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kzl.krouter.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.home).setOnClickListener {
            Router.get<HomeService>()?.let {
                it.sayHello(this)
                it.toHomeActivity(this)
            }
        }

        findViewById<View>(R.id.login).setOnClickListener {
            Router.get<LoginService>()?.sayHello(this)
        }

        findViewById<View>(R.id.course).setOnClickListener {
            Router.get<CourseService>()?.sayHello(this)
        }

        findViewById<View>(R.id.topic).setOnClickListener {
            Router.get<TopicService>()?.sayHello(this)
        }
    }

}
