@file:Suppress("unused")

package com.expressjs

external interface Response
{
    val app: Express
    val headersSent: Boolean
    val locals: Any
    val charset: String

    fun status(code: Int): Response
    fun sendStatus(code: Int): Response

    fun send(data: String)
    fun send(code: Int, data: String)

    fun json(data: Any)
    fun json(code: Int, data: Any)

    fun jsonp(data: Any)
    fun jsonp(code: Int, data: Any)

    fun sendFile(path: String)
    fun sendFile(path: String, options: Any)
    fun sendFile(path: String, fn: (Error) -> Unit)
    fun sendFile(path: String, options: Any, fn: (Error) -> Unit)

    fun download(path: String)
    fun download(path: String, filename: String)
    fun download(path: String, fn: (Error) -> Unit)
    fun download(path: String, filename: String, fn: (Error) -> Unit)

    fun contentType(type: String): Response
    fun type(type: String): Response

    fun format(obj: Any): Response
    fun links(links: Any): Response
    fun attachment(filename: String?): Response

    fun set(field: Any): Response
    fun set(field: String, value: String?): Response

    fun header(field: Any): Response
    fun header(field: String, value: String?): Response

    fun get(field: String): String

    fun cookie(name: String, `val`: Any): Response
    fun clearCookie(name: String, options: Any?): Response

    fun location(url: String): Response

    fun redirect(url: String)
    fun redirect(status: Int, url: String)
    fun redirect(url: String, status: Int)

    fun render(view: String, options: Any?, callback: (err: Error, html: String) -> Unit)
    fun render(view: String, callback: (err: Error, html: String) -> Unit)

    fun vary(field: String): Response
    fun append(field: String, value: Array<String>?): Response
}