@file:Suppress("LocalVariableName")

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

class JavaFragemntDetails : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_java_fragemnt_details, container, false)
        val javaImage=view.findViewById<ImageView>(R.id.javaGIF)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .load(Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPPNeg6PO73fPjFLWMfTtlEdwmAzHN5xjKHg&usqp=CAU"))
                .disallowHardwareConfig()
                .into(javaImage)
        }
        val ytView1=view.findViewById<YouTubePlayerView>(R.id.ytView)
        lifecycle.addObserver(ytView1)
        val ytView2=view.findViewById<YouTubePlayerView>(R.id.ytView2)
        lifecycle.addObserver(ytView2)

        return view
    }
}