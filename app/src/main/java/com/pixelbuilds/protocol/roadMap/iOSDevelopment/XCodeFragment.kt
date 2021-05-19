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

class XCodeFragment : Fragment() {
       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_x_code, container, false)
           val xCodeLogo=view.findViewById<ImageView>(R.id.XCodeGIF)
           context?.let {
               Glide.with(this)
                   .asDrawable()
                   .load(Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_FjUJdaBgkEuOZsj2x1q7OncZHKbjIBOGbA&usqp=CAU"))
                   .centerCrop()
                   .disallowHardwareConfig()
                   .into(xCodeLogo)
           }
           val ytView=view.findViewById<YouTubePlayerView>(R.id.ytView)
           lifecycle.addObserver(ytView)
           return view
       }

}