package com.ort.class_navigation.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.ort.class_navigation.R

class Screen2Fragment : Fragment() {

    lateinit var v : View
    lateinit var label : TextView
    lateinit var btnBack : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_screen2, container, false)
        label = v.findViewById(R.id.txtLabel)
        return v
    }

    override fun onStart() {
        super.onStart()
        btnBack.setOnClickListener {

        }
    }



}