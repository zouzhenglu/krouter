package com.kzl.krouter

import android.content.Context

interface Service {
    fun inject()

    fun sayHello(ctx: Context)


}

interface HomeService : Service {
    fun toHomeActivity(ctx: Context)
}

interface LoginService : Service {
}

interface TopicService : Service {

}

interface CourseService : Service {
}