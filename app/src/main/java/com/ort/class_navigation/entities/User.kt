package com.ort.class_navigation.entities

data class User(
    var id: Int,
    var name: String,
    var lastName: String,
    var email: String,
    var password: String,
){
    fun saludar(): String {
        return "Hola, soy $name $lastName"
    }

}


