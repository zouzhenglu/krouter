package com.kzl.module_home

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.kzl.krouter.HomeService
import com.kzl.krouter.Router
import com.kzl.krouter.TopicService
import kotlin.LazyThreadSafetyMode.NONE

internal val topicService: TopicService by lazy(NONE) {
    Router.get<TopicService>() ?: throw NullPointerException("TopicService is null")
}

object HomeServiceImpl : HomeService {
    override fun inject() {
        Router.put<HomeService>(this)
    }

    override fun sayHello(ctx: Context) {
        Toast.makeText(ctx, "hello home service", Toast.LENGTH_LONG).show()
    }

    override fun toHomeActivity(ctx: Context) {
        ctx.startActivity(Intent(ctx, HomeActivity::class.java))
    }
}