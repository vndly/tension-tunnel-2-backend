package com.mauriciotogneri.tensiontunnel2.backend.api.test

import com.expressjs.*
import com.mauriciotogneri.tensiontunnel2.backend.Task
import com.mauriciotogneri.tensiontunnel2.backend.api.EndPoint
import com.mauriciotogneri.tensiontunnel2.backend.database.TaskDatabase

class CreateTask : EndPoint
{
    override fun handle(request: Request, response: Response)
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