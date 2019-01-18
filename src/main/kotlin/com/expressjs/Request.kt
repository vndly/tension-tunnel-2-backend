@file:Suppress("unused")

package com.expressjs

external interface Request
{
    val protocol: String
    val secure: Boolean
    val ip: String
    val ips: Array<String>
    val subdomains: Array<String>
    val path: String
    val hostname: String
    val host: String
    val fresh: Boolean
    val stale: Boolean
    val xhr: Boolean
    val body: Any
    val cookies: Any
    val method: String
    val params: Any
    val query: dynamic
    val route: Any
    val signedCookies: Any
    val originalUrl: String
    val url: String
    val baseUrl: String

    fun get(name: String): Array<String>?
    fun header(name: String): Array<String>?
    fun param(name: String): String
    fun clearCookie(name: String, options: dynamic): Response
    fun `is`(type: String): String

    fun accepts(): Array<String>
    fun accepts(type: String): String?
    fun accepts(type: Array<String>): String?
    fun accepts(vararg type: Array<String>): String?

    fun acceptsCharsets(): Array<String>
    fun acceptsCharsets(charset: String): String
    fun acceptsCharsets(charset: Array<String>): String
    fun acceptsCharsets(vararg charset: Array<String>): String

    fun acceptsEncodings(): Array<String>
    fun acceptsEncodings(encoding: String): String
    fun acceptsEncodings(encoding: Array<String>): String
    fun acceptsEncodings(vararg encoding: Array<String>): String

    fun acceptsLanguages(): Array<String>
    fun acceptsLanguages(lang: String): String
    fun acceptsLanguages(lang: Array<String>): String
    fun acceptsLanguages(vararg lang: Array<String>): String
}

fun Request.headerParam(name: String): String = cleanString(get(name))

fun Request.queryParam(name: String): String = cleanString(query[name])

fun Request.pathParam(name: String): String = cleanString(param(name))

fun cleanString(value: dynamic): String = if (value == null) "" else "$value"