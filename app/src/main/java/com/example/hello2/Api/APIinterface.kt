package com.example.hello2.Api

import android.telecom.Call
import com.example.hello2.models.RegistrationResponse

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