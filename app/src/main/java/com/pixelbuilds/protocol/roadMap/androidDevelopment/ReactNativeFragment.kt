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

class ReactNativeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_react_native, container, false)
        val reactNativeGIF = view.findViewById<ImageView>(R.id.reactNativeGIF)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .load(Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV3fB1uAapfR_8IRBb4sA9ZQ_-WfSzR2r6OA&usqp=CAU"))
                .centerCrop()
                .disallowHardwareConfig()
                .into(reactNativeGIF)
        }
        val ytView = view.findViewById<YouTubePlayerView>(R.id.ytView)
        lifecycle.addObserver(ytView)
        return view
    }
}