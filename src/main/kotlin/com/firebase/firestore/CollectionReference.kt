package com.firebase.firestore

import kotlin.js.Promise

external interface CollectionReference
{
    val id: String
    val parent: DocumentReference?
    val path: String

    fun get(): Promise<QuerySnapshot>
    fun doc(documentPath: String): DocumentReference
    fun add(data: dynamic): Promise<DocumentReference>
}

fun CollectionReference.create(data: Any) = add(JSON.parse(JSON.stringify(data)))