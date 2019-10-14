package com.kzl.krouter


/**
 * 注入service到router，以暴露service给其他module
 *
 *  injectService<HomeService>(HomeServiceImpl())
 */
inline fun <reified T : Service> injectService(service: T) {
    require(T::class.java.simpleName != service.javaClass.simpleName) {
        "面向接口开发，不能直接用实现类来作为key注入到router，" +
                "否则其他module无法获取key，" +
                "因为module之间没有直接引用，获取不到具体的实现类，也不推荐写死字符串的方式"
    }
    Router.put(service)
}

inline fun <reified T : Service> getService(): T {
    return Router.get<T>() ?: throw NullPointerException("${T::class.java.name} is null")
}


object Router {

    val map = mutableMapOf<String, Any>()

    inline fun <reified T : Service> put(service: T) {
        map[T::class.java.name] = service
    }

    inline fun <reified T> get(): T? {
        return when (val value = map[T::class.java.name]) {
            is T -> value
            else -> null
        }
    }
}