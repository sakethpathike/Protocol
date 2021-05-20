package com.pixelbuilds.protocol.roadMap.webDevelopment

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.pixelbuilds.protocol.R

class WebDevelopmentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web_development, container, false)
        val php = view.findViewById<TextView>(R.id.materialTextView31)
        php.movementMethod = LinkMovementMethod.getInstance()
        val cplusplus = view.findViewById<TextView>(R.id.materialTextView32)
        cplusplus.movementMethod = LinkMovementMethod.getInstance()
        val java = view.findViewById<TextView>(R.id.materialTextView33)
        java.movementMethod = LinkMovementMethod.getInstance()
        val python = view.findViewById<TextView>(R.id.materialTextView34)
        python.movementMethod = LinkMovementMethod.getInstance()
        val javascr = view.findViewById<TextView>(R.id.materialTextView35)
        javascr.movementMethod = LinkMovementMethod.getInstance()
        val nodejs = view.findViewById<TextView>(R.id.materialTextView36)
        nodejs.movementMethod = LinkMovementMethod.getInstance()
        return view
    }
}