package com.firebase.admin

import com.firebase.firestore.Firestore

@JsModule("firebase-admin")
external object Admin
{
    fun initializeApp(config: FirebaseAppOptions)
    fun firestore(): Firestore
}