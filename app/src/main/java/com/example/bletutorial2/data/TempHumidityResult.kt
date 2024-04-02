package com.example.bletutorial2.data

data class TempHumidityResult(
    val temperature:Float,
    val humidity:Float,
    val connectionState: ConnectionState
)

data class Result(
    val myData:String,
    val connectionState: ConnectionState
)
