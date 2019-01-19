package com.mauriciotogneri.tensiontunnel2.backend.database

import com.firebase.firestore.DocumentReference
import com.firebase.firestore.create
import com.mauriciotogneri.tensiontunnel2.backend.Task
import kotlin.js.Promise

class TaskDatabase
{
    private val NAME = "tasks"

    fun create(task: Task): Promise<DocumentReference>
    {
        return Database.firestore.collection(NAME).create(task)
    }
}