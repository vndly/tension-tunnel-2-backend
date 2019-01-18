package com.firebase.firestore

import kotlin.js.Json
import kotlin.js.Promise

external interface Transaction
{
    fun create(documentReference: DocumentReference, data: dynamic): Transaction

    fun delete(documentReference: DocumentReference): Transaction

    fun get(documentReference: DocumentReference): Promise<DocumentSnapshot>

    fun set(documentReference: DocumentReference, data: dynamic): Transaction

    fun update(documentReference: DocumentReference, value: Json): Transaction
}