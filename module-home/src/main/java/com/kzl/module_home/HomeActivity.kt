package com.kzl.module_home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<View>(R.id.button).setOnClickListener {
            startActivity(
                Intent.parseUri(
                    "http://www.zhiyecn.com/details/222222",
                    Intent.URI_ANDROID_APP_SCHEME
                )
            )
            topicService.sayHello(this)
        }
        supportFragmentManager.commit {
            replace(R.id.home_fragment_container, topicService.topicFragment())
        }

    }
}
