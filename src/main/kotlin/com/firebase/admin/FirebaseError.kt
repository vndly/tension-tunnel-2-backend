package com.firebase.admin

external interface FirebaseError {
    val code: String
    val message: String
    val name: String
    val stack: String?
}