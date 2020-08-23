package com.example.hello2

class CourseActivity {
    class CoursesActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {	    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)	        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_courses)	        setContentView(R.layout.activity_courses)
            var courseList = listOf<Course>(
                Course("1", "Python", "PY 101", "James Neumann", "Python Intro"),	        fetchCourses()
                        Course("2", "Android", "AND 201", "Anne Elson", "Android development training"),	    }
            Course("3", "Database", "DB 304", "Kamwe Wema", "Database administration and development"),
            Course("4", "Network", "DIS 202", "Betty Crocker", "Netwok Config for modern apps")	    fun fetchCourses() {
                )	        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
                rvCourses.layoutManager = LinearLayoutManager(baseContext)	        val accessToken = sharedPreferences.getString("ACCESS_TOKEN_KEY", "")
                rvCourses.adapter = CoursesAdapter(courseList)
                val apiClient = ApiClient.buildService(ApiInterface::class.java)
                val coursesCall = apiClient.getCourses("Bearer " + accessToken)
                coursesCall.enqueue(object : Callback<CoursesResponse> {
                    override fun onFailure(call: Call<CoursesResponse>, t: Throwable) {
                        Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(
                        call: Call<CoursesResponse>,
                        response: Response<CoursesResponse>
                    ) {
                        if (response.isSuccessful) {
                            var courseList = response.body()?.courses as List<Course>
                            var coursesAdapter = CoursesAdapter(courseList)
                            rvCourses.layoutManager = LinearLayoutManager(baseContext)
                            rvCourses.adapter = coursesAdapter
                        } else {
                            Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                                .show()
                        }
                    }
                })
            }	    }
    } 	}
}