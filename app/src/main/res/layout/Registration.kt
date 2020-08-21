package layout

import android.content.Intent
import android.os.Bundle
import android.telecom.Call
import android.view.ActionMode
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hello2.MainActivity
import com.example.hello2.R

class Registration {
}

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

}
var requestBody = MultipartBody.Builder()
    .setType(MultipartBody.FORM)
    .addFormDataPart("first_name", firstName)
    .addFormDataPart("last_name", lastName)
    .addFormDataPart("email", email)
    .addFormDataPart("phone_number", phoneNumber)
    .addFormDataPart("password", password)
    .build()

object password {

}

object phoneNumber {

}

object email {

}

object lastName {

}

object firstName {

}

class MultipartBody {
    object FORM {

    }

    class Builder {
        fun setType(form: FORM): Any {


        }

    }

}

registerUser(requestBody)
Toast.makeText(baseContext, lastName, Toast.LENGTH_SHORT).show()
}
}


fun registerUser(requestBody: RequestBody) {
    var apiClient = ApiClient.buildService(ApiInterface::class.java)
    var registrationCall = apiClient.registerStudent(requestBody)
    val enqueue: Any = registrationCall.enqueue(object : ActionMode.Callback<RegistrationResponse> {
        override fun onFailure(
            call: Call<Registrationresponse.RegistrationResponse>,
            t: Throwable
        ) {
            val baseContext = null
            Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
        }

        fun onResponse(
            call: Call<Registrationresponse.RegistrationResponse>,
            response: Response<Registrationresponse.RegistrationResponse>
        ) = if (response.isSuccessful) {
            val baseContext = null
            val show: Any =
                makeText1(baseContext, response.body()?.javaClass, Toast.LENGTH_LONG).show()
            startActivity(Intent(baseContext, MainActivity::class.java))
        } else {
            val baseContext = null
            Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                .show()
        }

        private fun startActivity(intent: Intent) {
            TODO("Not yet implemented")
        }
    })
}

class RegistrationResponse {

}

class ApiClient {

}

class Response<T> {
    fun body(): Any {


    }

    fun errorBody(): Any {

    }

    val isSuccessful: Boolean
        get() {
            TODO()
        }
}
}