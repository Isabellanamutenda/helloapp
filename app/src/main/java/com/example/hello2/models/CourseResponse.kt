package com.example.hello2.models

import com.example.hello2.Course

class CourseResponse {
    import com.google.gson.annotations.SerializedName

    data class CoursesResponse(
        @SerializedName("courses") var courses: List<Course>
    )
}