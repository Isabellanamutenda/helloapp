package com.example.hello2.models

import com.example.hello2.Course
import com.example.hello2.student

class Course_response {
    import com.google.gson.annotations.SerializedName

    data class CoursesResponse(
        @student.SerializedName("courses") var courses: List<Course>
    )
}