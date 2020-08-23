package com.example.hello2

class `API client` {
    object APIclients {
    }
    fun <T> buildService(service: Class<T>): T {
        var retrofit: Nothing? = null
        return retrofit.create(service)
    }

}