package com.mauriciotogneri.tensiontunnel2.backend.api.test

import com.expressjs.Request
import com.expressjs.Response
import com.mauriciotogneri.tensiontunnel2.backend.api.EndPoint

class HelloEndPoint : EndPoint
{
    override fun handle(request: Request, response: Response)
    {
        response.send("Hello World 21")
    }
}