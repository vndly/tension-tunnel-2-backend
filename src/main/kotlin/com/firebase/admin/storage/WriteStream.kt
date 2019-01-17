package com.firebase.admin.storage

external interface WriteStream {

    fun on(action: String, callback: (data: dynamic) -> Unit)

    fun end(buffer: dynamic)
}