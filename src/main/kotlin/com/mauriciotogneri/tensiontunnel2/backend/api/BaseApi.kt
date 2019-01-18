package com.mauriciotogneri.tensiontunnel2.backend.api

import com.expressjs.Response
import com.mauriciotogneri.tensiontunnel2.backend.database.Database

open class BaseApi
{
    protected val OK = 200
    protected val CREATED = 201
    protected val NO_CONTENT = 204

    //https://firebase.google.com/docs/firestore/manage-data/transactions

    //https://www.youtube.com/watch?v=o7d5Zeic63s
    //https://www.youtube.com/watch?v=haMOUb3KVSo
    //https://www.youtube.com/watch?v=eW5MdE3ZcAw

    protected fun process(
            response: Response,
            function: suspend (database: Database) -> Unit)
    {
        Database.firestore.runTransaction { transaction ->

            /*launch {
                try
                {
                    function.invoke(Database(transaction))
                }
                catch (exception: Throwable)
                {
                    HttpException.process(exception, response)
                }
            }*/
        }
    }

    /*protected fun checkNotEmpty(vararg list: String)
    {
        for (element in list)
        {
            if (element.isEmpty())
            {
                throw BadRequestException()
            }
        }
    }*/

    /*suspend fun <T> Promise<T>.await(): T =
            suspendCoroutine { cont ->
                then({ cont.resume(it) }, { cont.resumeWithException(it) })
            }*/

    /*fun launch(block: suspend () -> Unit)
    {
        block.startCoroutine(object : Continuation<Unit>
        {
            override val context: CoroutineContext get() = EmptyCoroutineContext

            override fun context(value: Unit)
            {
            }

            override fun resumeWith(exception: Throwable)
            {
                throw exception
            }
        })
    }*/
}