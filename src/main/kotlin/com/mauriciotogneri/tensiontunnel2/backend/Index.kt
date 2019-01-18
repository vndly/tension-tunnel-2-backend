package com.mauriciotogneri.tensiontunnel2.backend

import com.expressjs.*
import com.firebase.admin.Admin
import com.firebase.firestore.DocumentData
import com.firebase.functions.Functions

external val exports: dynamic

// https://github.com/m-maillot/FirebaseFunctionToDo
// https://github.com/theerasan/kotlin-firebase-interface

fun main(args: Array<String>)
{
    Admin.initializeApp(Functions.config().firebase)

    val api = Express()

    val db = Admin.firestore()

    api.get("/v1/hello") { _, res ->
        res.send("Hello World 12!")
    }

    api.post("/v1/tasks/:id") { req, res ->
        val pathParam = req.pathParam("id")
        print(pathParam)

        val queryParam = req.queryParam("foo")
        print(queryParam)

        val headerParam = req.headerParam("test").toInt()
        print(headerParam)

        val bodyParam = req.bodyParam()
        print(bodyParam)

        val task = Task(
                label = queryParam,
                time = headerParam,
                description = bodyParam)

        db.collection("tasks").add(JSON.parse(JSON.stringify(task))).then {
            res.status(200).send("it works! $pathParam $queryParam $headerParam $bodyParam")
        }.catch { error ->
            res.status(500).json(error)
        }
    }

    val app = Express()
    app.use("/api", api)
    exports.api = Functions.https.onRequest(api)
}

data class Task(val id: String? = undefined,
                val label: String,
                val time: Int,
                val description: String) : DocumentData