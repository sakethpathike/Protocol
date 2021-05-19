package com.pixelbuilds.protocol

import android.content.Context
import android.content.DialogInterface
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class OtherStuffFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_other_stuff, container, false)
        val connectivityManager=context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo:NetworkInfo?=connectivityManager.activeNetworkInfo
        val isConnected:Boolean=networkInfo?.isConnectedOrConnecting == true
        if (!isConnected){
            val alertDialogBuilder = MaterialAlertDialogBuilder(requireContext())
            alertDialogBuilder.setTitle("Network Error")
            alertDialogBuilder.setMessage("You Cannot Access This Section As Network Was Not Detected,Try To Connect To Your Internet.")
            alertDialogBuilder.setPositiveButton(
                "Ok",
                DialogInterface.OnClickListener { dialog, which ->
                    Navigation.findNavController(view).navigate(R.id.otherStuffFragment_to_mainMenu)
                })
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.show()
        }
        return view
    }
}