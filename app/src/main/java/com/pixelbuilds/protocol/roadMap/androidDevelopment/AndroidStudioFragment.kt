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

class AndroidStudioFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_android_studio, container, false)
        val androidStudioLogo = view.findViewById<ImageView>(R.id.androidStudioGIF)
        val ytView = view.findViewById<YouTubePlayerView>(R.id.ytView)
        lifecycle.addObserver(ytView)
        context?.let {
            Glide.with(this)
                .asDrawable()
                .load(Uri.parse("https://1.bp.blogspot.com/-LgTa-xDiknI/X4EflN56boI/AAAAAAAAPuk/24YyKnqiGkwRS9-_9suPKkfsAwO4wHYEgCLcBGAsYHQ/s0/image9.png"))
                .centerCrop()
                .disallowHardwareConfig()
                .into(androidStudioLogo)
        }
        return view
    }

}