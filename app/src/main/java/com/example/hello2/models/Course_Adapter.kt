package com.example.hello2.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hello2.Course
import com.example.hello2.R

class Course_Adapter {
    class CoursesAdapter(var courseList: List<Course>) :
        RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder>() {

        fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
            var itemView =
                LayoutInflater.from(parent.context).inflate(R.layout.row_course_item, parent, false)
            return CoursesViewHolder(
                itemView
            )
        }

        fun getItemCount(): Int {
            return courseList.size
        }

        fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
            holder.rowView.tvCourseCode.text = courseList[position].courseCode
            holder.rowView.tvCourseName.text = courseList[position].courseName
            holder.rowView.tvDescription.text = courseList[position].description
            holder.rowView.tvInstructor.text = courseList[position].instructor
        }

        class CoursesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
    }

}
class CoursesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)