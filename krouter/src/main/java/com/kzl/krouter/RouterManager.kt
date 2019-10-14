package com.kzl.krouter


object Router {

    val map = mutableMapOf<String, Any>()

    inline fun <reified T : Service> put(service: T) {
        map[key<T>()] = service
    }

    inline fun <reified T> key() = T::class.java.name

    inline fun <reified T> get(): T? {
        return when (val value = map[key<T>()]) {
            is T -> value
            else -> null
        }
    }

}