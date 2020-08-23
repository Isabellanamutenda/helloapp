package com.example.hello2

import android.telecom.Call

interface APIinterface {
    import android.telecom.Call

    interface `APIinterface` {

    }
    interface ApiInterface {
        @POST("register")
        fun registerStudent(@Body requestBody: RequestBody): Call<RegistrationResponse.RegistrationResponse>
    }

    annotation class POST(val value: String)

    annotation class Body

    class RequestBody {

    }
}