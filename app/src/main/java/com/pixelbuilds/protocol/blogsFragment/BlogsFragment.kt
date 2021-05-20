package com.pixelbuilds.protocol.blogsFragment

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.pixelbuilds.protocol.R

class BlogsFragment : Fragment() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blogs, container, false)
        val connectivityManager =
            context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
        val isConnected: Boolean = networkInfo?.isConnectedOrConnecting == true
        if (!isConnected) {
            val alertDialogBuilder = MaterialAlertDialogBuilder(requireContext())
            alertDialogBuilder.setTitle("Network Error")
            alertDialogBuilder.setMessage("You Cannot View Blogs Section As Network Was Not Detected, Try To Connect To Your Internet.")
            alertDialogBuilder.setPositiveButton(
                "Ok"
            ) { dialog, which ->
                Navigation.findNavController(view).navigate(R.id.blogsFragment_to_mainMenu)
            }
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.show()
        }
        val webView = view.findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                view?.loadUrl(url!!)
                return false
            }
        }
        webView.loadUrl("https://saketh001.hashnode.dev")
        return view
    }
}