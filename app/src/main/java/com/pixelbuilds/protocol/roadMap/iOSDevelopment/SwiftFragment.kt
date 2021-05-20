package com.pixelbuilds.protocol.roadMap.iOSDevelopment

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

class SwiftFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_swift_, container, false)
        val swiftIMage = view.findViewById<ImageView>(R.id.swiftGIF)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .load(Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6KTxLOJzo0y8YdMebToltxSXDtmf6GBMr2g&usqp=CAU"))
                .centerCrop()
                .disallowHardwareConfig()
                .into(swiftIMage)
        }
        val ytView1 = view.findViewById<YouTubePlayerView>(R.id.ytView)
        val ytView2 = view.findViewById<YouTubePlayerView>(R.id.ytView1)
        lifecycle.addObserver(ytView1)
        lifecycle.addObserver(ytView2)
        return view
    }

}