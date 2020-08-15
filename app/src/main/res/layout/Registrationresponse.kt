package layout

class Registrationresponse {
    data class RegistrationResponse(
        @SerializedName("message") var message: String,
        @SerializedName("student") var student: Students.Student
    )
}