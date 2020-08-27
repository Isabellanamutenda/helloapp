package com.example.hello2

class Course_response {
    import com.google.gson.annotations.SerializedName

    data class CoursesResponse(
        @student.SerializedName("courses") var courses: List<Course>
    )
}