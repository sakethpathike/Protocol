package com.pixelbuilds.protocol.projects

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

class ProjectsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_projects, container, false)
        val androidImageview = view.findViewById<ImageView>(R.id.android_Projects_Image)
        val webImageview = view.findViewById<ImageView>(R.id.web_Projects_Image)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://cdn.dribbble.com/users/2475489/screenshots/10958341/media/1a42f156117294570ccd94f0b79a7395.gif"))
                .disallowHardwareConfig()
                .into(androidImageview)
        }
        context?.let {
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://camo.githubusercontent.com/e4a569755580f96dce0e6d65bc761e0d9aef0fecae524ec73a1b0be60fc934fa/68747470733a2f2f7777772e6d79676f2e67652f75706c6f6164732f626c6f672f313538343032333739352e6a7067"))
                .disallowHardwareConfig()
                .into(webImageview)
        }
        val toAndroidProjects = view.findViewById<NeumorphCardView>(R.id.android_Projects)
        toAndroidProjects.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_androidProjects)
        }
        val toWebProjects = view.findViewById<NeumorphCardView>(R.id.web_Projects)
        toWebProjects.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_webdevelopmentProjectsPage)
        }
        return view
    }
}