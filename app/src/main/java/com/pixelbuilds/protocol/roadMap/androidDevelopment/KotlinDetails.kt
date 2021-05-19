package com.pixelbuilds.protocol.roadMap.androidDevelopment

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.pixelbuilds.protocol.R

class KotlinDetails : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_kotlin_details, container, false)
        val kotlinImage=view.findViewById<ImageView>(R.id.kotlinGIF)
        val ytView=view.findViewById<YouTubePlayerView>(R.id.ytView)
        lifecycle.addObserver(ytView)
        val ytView2=view.findViewById<YouTubePlayerView>(R.id.ytView2)
        lifecycle.addObserver(ytView2)
        val ytView3=view.findViewById<YouTubePlayerView>(R.id.ytView3)
        lifecycle.addObserver(ytView3)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://camo.githubusercontent.com/ed136aab3d149d8b3bd89cf68ae60abfc07d194ad6a652c9fbb45366d7227a21/68747470733a2f2f63646e2d696d616765732d312e6d656469756d2e636f6d2f6d61782f313630302f312a337831514533567a47354d576935516b36432d484c512e676966"))
                .disallowHardwareConfig()
                .into(kotlinImage)
        }
        return view
    }

}