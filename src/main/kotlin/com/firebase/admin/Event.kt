package com.firebase.admin

import com.firebase.admin.database.DeltaSnapshot

external interface Event<T> {
    val data: DeltaSnapshot<T>
    val params: dynamic
}