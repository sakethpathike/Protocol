package com.pixelbuilds.protocol.roadMap.androidDevelopment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.Navigation
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.pixelbuilds.protocol.R


class AndroidDevelopment :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_androiddevelopment, container, false)
        val ytView=view.findViewById<YouTubePlayerView>(R.id.youtubePlayerView)
        lifecycle.addObserver(ytView)
        val toKotlin=view.findViewById<ImageButton>(R.id.kotlin_knowmore)
        toKotlin.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_kotlinDetails)
        }
        val toJava=view.findViewById<ImageButton>(R.id.java_knowmore)
        toJava.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_javaFragemntDetails)
        }
        val toFlutter=view.findViewById<ImageButton>(R.id.flutter_knowmore)
        toFlutter.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_flutterDetailsFragment)
        }
        val toReactNative=view.findViewById<ImageButton>(R.id.reactnative_knowmore)
        toReactNative.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_reactNativeFragment)
        }
        val toAndroidStudio=view.findViewById<ImageButton>(R.id.androidstudio_knowmore)
        toAndroidStudio.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_androidStudioFragment)
        }
        return view
    }
}
