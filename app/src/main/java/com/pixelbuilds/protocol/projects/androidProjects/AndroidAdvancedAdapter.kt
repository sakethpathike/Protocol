package com.pixelbuilds.protocol.projects.androidProjects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textview.MaterialTextView
import com.pixelbuilds.protocol.R

class AndroidAdvancedAdapter(private var title:List<String>, private var description:List<String>):RecyclerView.Adapter<AndroidAdvancedAdapter.ViewHolder>() {
 inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
     var itemTitle: MaterialTextView =itemView.findViewById(R.id.materialTextView81)
  var itemDescription: MaterialTextView =itemView.findViewById(R.id.materialTextView91)
 }

 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
  val view=LayoutInflater.from(parent.context).inflate(R.layout.androidadvanced_list,parent,false)
  return ViewHolder(view)
 }

 override fun onBindViewHolder(holder: ViewHolder, position: Int) {
  holder.itemTitle.text=title[position]
  holder.itemDescription.text=description[position]
 }

 override fun getItemCount(): Int {
  return title.size
 }

}