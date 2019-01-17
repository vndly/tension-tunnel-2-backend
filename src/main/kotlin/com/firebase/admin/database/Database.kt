package com.firebase.admin.database

external interface Database {
    fun ref(path: String): Reference
}