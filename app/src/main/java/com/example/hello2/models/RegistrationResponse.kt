package com.example.hello2.models

class RegistrationResponse {
    data class RegistrationResponse(
        @SerializedName("message") var message: String,
        @SerializedName("student") var student: Students.Student
    )
}