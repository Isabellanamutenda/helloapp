package com.example.hello2.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hello2.R

class cource_recycler_viewadapter {
    import android.support.v7.widget.RecyclerView
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import com.example.hello.R

    class CoursesRecyclerViewAdapter(private val CoursesList: List<String>) :
        RecyclerView.Adapter<CoursesRecyclerViewAdapter.NamesViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
            var itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_courses_item, parent, false)
            return NamesViewHolder(
                itemView
            )
        }
        override fun getItemCount(): Int {
            return CoursesList.size
        }
        override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
            holder.rowView.tvcourse.text = CoursesList[position]
        }
        class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
    }
}