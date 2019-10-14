package com.kzl.krouter

import android.content.Context
import androidx.fragment.app.Fragment

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
    fun topicFragment(): Fragment

}

interface CourseService : Service {
}