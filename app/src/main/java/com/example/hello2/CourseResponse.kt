package com.example.hello2

class CourseResponse {
    import com.google.gson.annotations.SerializedName

    data class CoursesResponse(
        @SerializedName("courses") var courses: List<Course>
    )
}