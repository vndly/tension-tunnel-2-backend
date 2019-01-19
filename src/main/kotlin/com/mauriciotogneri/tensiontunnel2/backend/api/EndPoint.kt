package com.mauriciotogneri.tensiontunnel2.backend.api

import com.expressjs.Request
import com.expressjs.Response

interface EndPoint
{
    //https://firebase.google.com/docs/firestore/manage-data/transactions

    //https://www.youtube.com/watch?v=o7d5Zeic63s
    //https://www.youtube.com/watch?v=haMOUb3KVSo
    //https://www.youtube.com/watch?v=eW5MdE3ZcAw

    fun handle(request: Request, response: Response)

    fun checkNotEmpty(vararg list: String)
    {
        for (element in list)
        {
            if (element.isEmpty())
            {
                //throw BadRequestException()
            }
        }
    }
}