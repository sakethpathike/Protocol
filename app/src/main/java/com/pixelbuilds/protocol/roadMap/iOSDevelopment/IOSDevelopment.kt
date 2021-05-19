package com.pixelbuilds.protocol.roadMap.iOSDevelopment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.Navigation
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.pixelbuilds.protocol.R

class IOSDevelopment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_i_o_s_development, container, false)
        val toSwift=view.findViewById<ImageButton>(R.id.swift_knowmore)
        toSwift.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_swift_Fragment)
        }
        val toObjC=view.findViewById<ImageButton>(R.id.objc_knowmore)
        toObjC.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_objectiveCFragment)
        }
        val toXCode=view.findViewById<ImageButton>(R.id.xcode_knowmore)
        toXCode.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_xCodeFragment)
        }
        val ytView1=view.findViewById<YouTubePlayerView>(R.id.youtubePlayerView)
        lifecycle.addObserver(ytView1)
        return view
    }
}