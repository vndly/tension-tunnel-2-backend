package com.firebase.admin

import com.firebase.admin.database.Database
import com.firebase.admin.firestore.Firestore
import com.firebase.admin.storage.Storage

@JsModule("firebase-admin")
external object Admin {
    val credential: dynamic

    fun initializeApp(config: FirebaseAppOptions)
    fun database(): Database
    fun firestore(): Firestore
    fun storage(): Storage
}