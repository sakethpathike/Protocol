package com.pixelbuilds.protocol.projects.androidProjects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import com.pixelbuilds.protocol.R

class AndroidBeginnerProjectsRecylerView(
    private var title: List<String>,
    private var description: List<String>
) :
    RecyclerView.Adapter<AndroidBeginnerProjectsRecylerView.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: MaterialTextView = itemView.findViewById(R.id.materialTextView8)
        val itemDescription: MaterialTextView = itemView.findViewById(R.id.materialTextView9)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.androidbeginnerprojects_item, parent, false)
        return ViewHolder(viewHolder)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.itemTitle.text = title[position]
        holder.itemDescription.text = description[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }
}