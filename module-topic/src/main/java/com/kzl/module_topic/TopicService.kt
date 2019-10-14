package com.kzl.module_topic

import android.content.Context
import android.widget.Toast
import com.kzl.krouter.Router
import com.kzl.krouter.TopicService


object TopicServiceImpl : TopicService {
    override fun inject() {
        Router.put<TopicService>(this)
    }

    override fun sayHello(ctx: Context) {
        Toast.makeText(ctx, "hello topic service", Toast.LENGTH_LONG).show()
    }


}