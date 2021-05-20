package com.pixelbuilds.protocol

import android.content.Context
import android.content.DialogInterface
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationBar = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmentContainerView2)
        bottomNavigationBar.setupWithNavController(navController)
        val connectivityManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true
        if (!isConnected) {
            val alertDialogBuilder = MaterialAlertDialogBuilder(this)
            alertDialogBuilder.setTitle("Network Error")
            alertDialogBuilder.setMessage("Connect To The Network For Accessing Fully-Fledged Features")
            alertDialogBuilder.setPositiveButton(
                "Skip For Now",
                DialogInterface.OnClickListener { dialog, which -> })
            alertDialogBuilder.setCancelable(false)
            alertDialogBuilder.show()
        } else {
            Toast.makeText(this, "Connected To The Network", Toast.LENGTH_SHORT).show()
        }

    }
}