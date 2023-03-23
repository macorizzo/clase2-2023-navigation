package com.ort.class_navigation.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.ort.class_navigation.R
import com.ort.class_navigation.entities.User

class Screen1Fragment : Fragment() {

    lateinit var v : View
    lateinit var label : TextView
    lateinit var btnNavigate : Button
    lateinit var input : EditText

    var inputText : String = ""
    var userList : MutableList<User> = mutableListOf()
    var text : String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_screen1, container, false)
        label = v.findViewById(R.id.txtLabel)
        return v
    }

    override fun onStart() {
        super.onStart()
        btnNavigate.setOnClickListener {
            val action = Screen1FragmentDirections.actionScreen1FragmentToScreen2Fragment()
            findNavController().navigate(action)

            inputText = input.text.toString()
            label.text = "El texto ingresado fue $inputText"

            Snackbar.make(v ,"Hola soy un snackbar", Snackbar.LENGTH_LONG)
        }
    }




}