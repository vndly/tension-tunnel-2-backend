package com.firebase.admin.firestore

external interface SnapshotMetadata {

    val fromCache: Boolean
    val hasPendingWrites: Boolean

    fun isEqual(other: SnapshotMetadata): Boolean
}