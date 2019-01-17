package com.firebase.firestore

external interface Firestore
{
    fun collection(collectionPath: String): CollectionReference
}