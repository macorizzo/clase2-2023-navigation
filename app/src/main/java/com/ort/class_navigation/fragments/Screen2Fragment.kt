package com.ort.class_navigation.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ort.class_navigation.R

class Screen2Fragment : Fragment() {

    companion object {
        fun newInstance() = Screen2Fragment()
    }

    private lateinit var viewModel: Screen2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Screen2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}