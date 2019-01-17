package com.firebase.admin

import com.firebase.admin.firestore.Firestore

@JsModule("firebase-admin")
external object Admin
{
    val credential: dynamic
    fun initializeApp(config: FirebaseAppOptions)
    fun firestore(): Firestore
}