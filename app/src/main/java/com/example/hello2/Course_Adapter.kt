package com.example.hello2

import androidx.recyclerview.widget.RecyclerView

class Course_Adapter {
    class CoursesAdapter(var courseList: List<Course>) :
        RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
            var itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.row_course_item, parent, false)
            return CoursesViewHolder(itemView)
        }

        override fun getItemCount(): Int {
            return courseList.size
        }

        override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
            holder.rowView.tvCourseCode.text = courseList[position].courseCode
            holder.rowView.tvCourseName.text = courseList[position].courseName
            holder.rowView.tvDescription.text = courseList[position].description
            holder.rowView.tvInstructor.text = courseList[position].instructor
        }

        class CoursesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
    }

}