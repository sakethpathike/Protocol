package com.pixelbuilds.protocol.projects.webProjects

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

class WebdevelopmentProjectsPage : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_webdevelopment_projects_page, container, false)
val towebBeginner=view.findViewById<NeumorphCardView>(R.id.web_Beginner_Projects)
        towebBeginner.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_webBeginnerProjectIdeas)
        }
        val towebAdvanced=view.findViewById<NeumorphCardView>(R.id.web_Advanced_Projects)
        towebAdvanced.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_webAdvancedProject)
        }
        val beginnerImage=view.findViewById<ImageView>(R.id.web_BeginnerProjects_Image)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://i.gifer.com/848m.gif"))
                .disallowHardwareConfig()
                .into(beginnerImage)
        }
        val advancedImage=view.findViewById<ImageView>(R.id.web_AdvancedProjectImage)
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