package com.mauriciotogneri.tensiontunnel2.backend

import com.expressjs.Express
import com.firebase.admin.Admin
import com.firebase.functions.Functions
import com.mauriciotogneri.tensiontunnel2.backend.api.test.CreateTask
import com.mauriciotogneri.tensiontunnel2.backend.api.test.HelloEndPoint
import com.mauriciotogneri.tensiontunnel2.backend.database.Database

external val exports: dynamic

// https://github.com/m-maillot/FirebaseFunctionToDo
// https://github.com/theerasan/kotlin-firebase-interface

fun main(args: Array<String>)
{
    Admin.initializeApp(Functions.config().firebase)
    Database.initialize(Admin.firestore())

    val api = Express()

    api.get("/v1/hello", HelloEndPoint()::handle)
    api.post("/v1/tasks/:id", CreateTask()::handle)

    val app = Express()
    app.use("/api", api)
    exports.api = Functions.https.onRequest(api)
}