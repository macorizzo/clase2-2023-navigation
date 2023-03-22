package com.ort.class_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ort.class_navigation.entities.User

class MainActivity : AppCompatActivity() {

    private val user :
        User(id:1, name: "Martin", lastName: "Corizzo", email: "@gmail.com", password:"1234")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //println(user.saludar())
    log.d(tag: "TEST", user.saludar())
}