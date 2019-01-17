package com.firebase.admin.firestore

external interface Firestore {
    fun collection(collectionPath: String): CollectionReference
}