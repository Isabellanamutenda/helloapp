package layout

import android.telecom.Call

interface `API interface` {

}
interface ApiInterface {
    @POST("register")
    fun registerStudent(@Body requestBody: RequestBody): Call<Registrationresponse.RegistrationResponse>
}

annotation class POST(val value: String)

annotation class Body

class RequestBody {

}
