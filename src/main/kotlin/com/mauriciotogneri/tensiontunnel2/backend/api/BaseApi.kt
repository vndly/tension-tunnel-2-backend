package com.mauriciotogneri.tensiontunnel2.backend.api

open class BaseApi
{
    protected val OK = 200
    protected val CREATED = 201
    protected val NO_CONTENT = 204

    /*protected fun process(
            response: Response,
            function: suspend (database: Database) -> Unit)
    {
        Database.firestore.runTransaction { transaction ->

            launch {
                try
                {
                    function.invoke(Database(transaction))
                }
                catch (exception: Throwable)
                {
                    HttpException.process(exception, response)
                }
            }
        }
    }

    protected fun checkNotEmpty(vararg list: String)
    {
        for (element in list)
        {
            if (element.isEmpty())
            {
                throw BadRequestException()
            }
        }
    }*/
}