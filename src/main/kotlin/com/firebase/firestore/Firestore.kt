package com.firebase.firestore

external interface Firestore
{
    fun collection(collectionPath: String): CollectionReference

    fun runTransaction(function: (transaction: Transaction) -> Unit)
}