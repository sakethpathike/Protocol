package com.pixelbuilds.protocol.projects.androidProjects

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.pixelbuilds.protocol.R
import soup.neumorphism.NeumorphCardView

class AndroidProjects : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_android_projects, container, false)
        val toAndroidBeginnerProjects=view.findViewById<NeumorphCardView>(R.id.android_Beginner_Projects)
        toAndroidBeginnerProjects.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_androidBeginnerProjects)
        }
        val toAndroidAdvancedProjects=view.findViewById<NeumorphCardView>(R.id.android_Advanced_Projects)
        toAndroidAdvancedProjects.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_androidAdvancedProjects)
        }
        val beginnerImage=view.findViewById<ImageView>(R.id.android_BeginnerProjects_Image)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://i.gifer.com/848m.gif"))
                .disallowHardwareConfig()
                .into(beginnerImage)
        }
        val advancedImage=view.findViewById<ImageView>(R.id.android_AdvancedProjectImage)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://i.gifer.com/HMhI.gif"))
                .disallowHardwareConfig()
                .into(advancedImage)
        }
        return view
    }
}