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

class ObjectiveCFragment : Fragment() {
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_objective_c, container, false)
       val objCLogo=view.findViewById<ImageView>(R.id.objCGIF)
       context?.let {
           Glide.with(this)
               .asDrawable()
               .load(Uri.parse("https://seeklogo.com/images/O/objective-c-logo-81746870EF-seeklogo.com.png"))
               .centerCrop()
               .disallowHardwareConfig()
               .into(objCLogo)
       }
       val ytView=view.findViewById<YouTubePlayerView>(R.id.ytView)
       lifecycle.addObserver(ytView)
       return view
    }
}