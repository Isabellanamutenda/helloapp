package com.example.hello2

class Course {
    data class Course(
        var courseId: String,	    @SerializedName("course_id") var courseId: String,
        var courseName: String,	    @SerializedName("course_name") var courseName: String,
        var courseCode: String,	    @SerializedName("course_code") var courseCode: String,
        var instructor: String,	    @SerializedName("instructor") var instructor: String,
        var description: String	    @SerializedName("description") var description: String
    ) 	)
}