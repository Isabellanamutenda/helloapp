package com.example.hello2

import android.os.Parcel
import android.os.Parcelable

class Course {
    data class Course(
        var courseId: String, @student.SerializedName("course_id") var courseId: String,
        var courseName: String, @student.SerializedName("course_name") var courseName: String,
        var courseCode: String, @student.SerializedName("course_code") var courseCode: String,
        var instructor: String, @student.SerializedName("instructor") var instructor: String,
        var description: String,  @student}SerializedName("description") lateinit var description: String
    ) 	)
}