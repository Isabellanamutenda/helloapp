package layout

class APIclient {


    object APIclients {
    }
    fun <T> buildService(service: Class<T>): T {
        var retrofit: Nothing? = null
        return retrofit.create(service)
    }
}
}

