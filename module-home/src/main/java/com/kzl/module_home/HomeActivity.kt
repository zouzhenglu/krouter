package com.kzl.module_home

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.kzl.krouter.Router
import com.kzl.krouter.TopicService

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<View>(R.id.button).setOnClickListener {
            Router.get<TopicService>()?.sayHello(this)
        }
        supportFragmentManager.commit {
            replace(R.id.home_fragment_container, topicService.topicFragment())

        }

    }
}
