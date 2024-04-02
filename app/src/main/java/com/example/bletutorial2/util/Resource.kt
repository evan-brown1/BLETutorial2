package com.example.bletutorial2.util

import com.example.bletutorial2.data.Result

sealed class Resource<out T:Any>{
    data class Success<out T:Any> (val data:Result): Resource<T>()
    data class Error(val errorMessage:String): Resource<Nothing>()
    data class Loading<out T:Any>(val data:T? = null, val message:String? = null): Resource<T>()
}
