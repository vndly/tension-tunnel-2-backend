package com.mauriciotogneri.tensiontunnel2.backend.database

import com.firebase.firestore.DocumentReference
import com.mauriciotogneri.tensiontunnel2.backend.Task
import kotlin.js.Promise

class TaskDatabase
{
    fun create(task: Task): Promise<DocumentReference>
    {
        return Database.firestore.collection("tasks").add(JSON.parse(JSON.stringify(task)))
    }
}