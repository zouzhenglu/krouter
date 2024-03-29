package com.kzl.module_topic

import android.content.Context
import android.widget.Toast
import com.kzl.krouter.TopicService
import com.kzl.module_topic.page.TopicFragment


internal object TopicServiceImpl : TopicService {

    override fun sayHello(ctx: Context) {
        Toast.makeText(ctx, "hello topic service", Toast.LENGTH_LONG).show()
    }

    override fun topicFragment() = TopicFragment.newInstance()
}