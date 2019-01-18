package com.mauriciotogneri.tensiontunnel2.backend

import com.firebase.firestore.DocumentData

data class Task(val id: String? = undefined,
                val label: String,
                val time: Int,
                val description: String) : DocumentData