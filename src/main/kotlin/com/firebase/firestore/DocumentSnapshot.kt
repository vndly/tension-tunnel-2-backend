package com.firebase.firestore

external interface DocumentSnapshot
{
    val exists: Boolean
    val id: String
    val ref: DocumentReference
    val metadata: SnapshotMetadata

    fun data(options: SnapshotOptions? = definedExternally): dynamic
    fun get(fieldPath: String, options: SnapshotOptions? = definedExternally): Any?
    fun isEqual(other: DocumentSnapshot): Boolean
}