package com.kzl.module_home

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<View>(R.id.button).setOnClickListener {
            topicService.sayHello(this)
        }
        supportFragmentManager.commit {
            replace(R.id.home_fragment_container, topicService.topicFragment())
        }

    }
}
