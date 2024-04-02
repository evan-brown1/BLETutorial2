package com.example.bletutorial2.data

sealed interface ConnectionState{
    object Connected: ConnectionState
    object Disconnected: ConnectionState
    object Uninitialized: ConnectionState
    object CurrentlyInitializing: ConnectionState
}