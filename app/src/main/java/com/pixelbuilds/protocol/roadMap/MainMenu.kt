package com.pixelbuilds.protocol.roadMap

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

open class MainMenu : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_menu, container, false)
        val androidImageview = view.findViewById<ImageView>(R.id.android_image)
        val iosImageview = view.findViewById<ImageView>(R.id.iOS_image)
        val webImageview = view.findViewById<ImageView>(R.id.web_image)
        val androidCard=view.findViewById<NeumorphCardView>(R.id.android_developer)
        androidCard.setOnClickListener {
        Navigation.findNavController(view).navigate(R.id.toAndroidDevelopment)
        }
        val iOSCard=view.findViewById<NeumorphCardView>(R.id.iOS_developer)
        iOSCard.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_iOSDevelopment)
        }
        val webCard=view.findViewById<NeumorphCardView>(R.id.web_developer)
        webCard.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.to_webDevelopmentFragment)
        }
        context?.let {
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://cdn.dribbble.com/users/2475489/screenshots/10958341/media/1a42f156117294570ccd94f0b79a7395.gif"))
                .disallowHardwareConfig()
                .into(androidImageview)
        }
        context?.let{
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://cdn.dribbble.com/users/1161517/screenshots/7896076/media/24ae74ddb6c9eb7789ae3a189a6b30ae.gif"))
                .disallowHardwareConfig()
                .into(iosImageview)
        }

        context?.let{
            Glide.with(this)
                .asDrawable()
                .centerCrop()
                .load(Uri.parse("https://camo.githubusercontent.com/e4a569755580f96dce0e6d65bc761e0d9aef0fecae524ec73a1b0be60fc934fa/68747470733a2f2f7777772e6d79676f2e67652f75706c6f6164732f626c6f672f313538343032333739352e6a7067"))
                .disallowHardwareConfig()
                .into(webImageview)
        }
                return view
    }
}
