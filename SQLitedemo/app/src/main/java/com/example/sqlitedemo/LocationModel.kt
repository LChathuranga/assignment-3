package com.example.sqlitedemo

//import kotlin.random.Random
import java.util.*

data class LocationModel (
    var id: Int = getAutoId(),
    var loc:String = "",
    var longitude:String = "",
    var latitude:String = ""

){

    companion object
    {
        fun getAutoId():Int{
            val random = Random()
            return random.nextInt(100)
        }

    }

}