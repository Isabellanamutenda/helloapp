package com.example.hello2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import androidx.appcompat.view.ActionMode
import layout.ApiInterface
import layout.RequestBody
import android.widget.Toast.makeText as toastMakeText
import com.example.hello2.RegistrationResponse as Hello2RegistrationResponse

private val Nothing?.text: Any
    get() {
        TODO("Not yet implemented")
    }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val i = -17,7 +23,42 @@ class RegistrationActivity : AppCompatActivity() run run {
            val etPhoneNumber = null
            val phoneNumber = etPhoneNumber.text.toString()
            val etPassword = null
            val password = etPassword.text.toString()
            val etConfirmPassword = null
            val passwordConfirmation = etConfirmPassword.text.toString()

            var requestBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("first_name", firstName)
                .addFormDataPart("last_name", lastName)
                .addFormDataPart("email", email)
                .addFormDataPart("phone_number", phoneNumber)
                .addFormDataPart("password", password)
                .build()

            registerUser(requestBody)
            val show = toastMakeText(baseContext, lastName, Toast.LENGTH_SHORT).show()
            show
        }
    }


    fun registerUser(requestBody: RequestBody) {
        var apiClient = ApiClient.buildService(ApiInterface::class.java)
        var registrationCall = apiClient.registerStudent(requestBody)
        val enqueue: Any = registrationCall.enqueue(object :
            ActionMode.Callback<Hello2RegistrationResponse> {
            fun onFailure(call: Call<Hello2RegistrationResponse>, t: Throwable) {
                toastMakeText(baseContext, t.message, Toast.LENGTH_LONG).show()
            }

            fun onResponse(
                call: Call<Hello2RegistrationResponse>,
                response: Response<Hello2RegistrationResponse>
            ): Unit = if (response.isSuccessful) {
                val show: Any =
                    toastMakeText(baseContext, response.body()?.javaClass, Toast.LENGTH_LONG)
                        .show()
                startActivity(Intent(baseContext, MainActivity::class.java))
            } else {
                toastMakeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                    .show()
            }
        })
    }

    private fun toastMakeText(baseContext: Context?, javaClass: lastName, lengthLong: Int): Any {
        TODO("Not yet implemented")
    }
}

private fun Any.show(): Any {
    TODO("Not yet implemented")
}

private fun Any.addFormDataPart(s: String, email: email): Any {
    TODO("Not yet implemented")
}

private fun Any.addFormDataPart(s: String, firstName: firstName): Any {
    TODO("Not yet implemented")
}

private fun Any.addFormDataPart(s: String, firstName: lastName): Any {
    TODO("Not yet implemented")
}
