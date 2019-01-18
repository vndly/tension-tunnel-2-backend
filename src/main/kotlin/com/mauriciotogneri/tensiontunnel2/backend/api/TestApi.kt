package com.mauriciotogneri.tensiontunnel2.backend.api

import com.expressjs.*
import com.mauriciotogneri.tensiontunnel2.backend.Task
import com.mauriciotogneri.tensiontunnel2.backend.database.TaskDatabase

class TestApi : BaseApi()
{
    fun hello(request: Request, response: Response)
    {
        response.send("Hello World 15")

        /*process(response) { database ->

            val sessionToken = request.headerParam(Api.SESSION_TOKEN)

            checkNotEmpty(sessionToken)

            val documentAccount = database.account.bySessionToken(sessionToken)

            response
                    .status(OK)
                    .json(documentAccount.toJson())
        }*/
    }

    fun createTask(request: Request, response: Response)
    {
        val pathParam = request.pathParam("id")
        print(pathParam)

        val queryParam = request.queryParam("foo")
        print(queryParam)

        val headerParam = request.headerParam("test").toInt()
        print(headerParam)

        val bodyParam = request.bodyParam()
        print(bodyParam)

        val task = Task(
                label = queryParam,
                time = headerParam,
                description = bodyParam)

        val database = TaskDatabase()
        database.create(task).then {
            response.status(200).send("it works! $pathParam $queryParam $headerParam $bodyParam")
        }.catch { error ->
            response.status(500).json(error)
        }
    }
}