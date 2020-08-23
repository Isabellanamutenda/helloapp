package com.example.hello2

class courseactivity2 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course2)
    }
}
data class Coursesactivity(val courses_id:Int, val courses_name:String, val course_code:Int, val instructor:String, val Description:String)
class coursesactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursesactivity)
        rvCourses.layoutManager = LinearLayoutManager(baseContext)

        val CoursesactivityAdapter = CoursesActivityRecyclerViewAdapter(
            coursesactivity = listOf(
                Coursesactivity(1001, "Faith", 2001, "Mwajuma", "Java project1"),
                Coursesactivity(1002, "Lovine", 2002, "Wafu", "JavaScript project1"),
                Coursesactivity(1003, "yvonne", 2003, "Mukanzi", "HTML project1"),
                Coursesactivity(1004, "Mish", 2004, "Noel", "CSS project1"),
                Coursesactivity(1005, "Vivian", 2005, "Purity", "Python project1"),
                Coursesactivity(1006, "Ashley", 2006, "Tashley", "Kotlin project1"),
                Coursesactivity(1007, "Jack", 2007, "Mwangi", "IT project1"),
                Coursesactivity(1008, "John", 2008, "Nelson", "Computer project1"),
                Coursesactivity(1009, "James", 2009, "Jude", "PHY project1"),
                Coursesactivity(1010, "Whitney", 2010, "Josh", "Maths project1")

            )
        )



        val rvCoursesActivity = null
        val coursesAdapter = null
        val value: Any = rvCoursesActivity.= coursesAdapter




    }

    private fun CoursesActivityRecyclerViewAdapter(
        listOf: List<Any>,
        coursesactivity: List<Coursesactivity>
    ) {

    }

}
}