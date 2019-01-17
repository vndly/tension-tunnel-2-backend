package com.firebase.functions

@JsModule("firebase-functions")
external object Functions
{
    fun config(): dynamic

    val https: Https
}