package com.expressjs

@JsModule("express")
external class Express
{
    fun get(route: String, callback: (req: Request, res: Response) -> Unit)
    fun post(route: String, callback: (req: Request, res: Response) -> Unit)
    fun put(route: String, callback: (req: Request, res: Response) -> Unit)
    fun delete(route: String, callback: (req: Request, res: Response) -> Unit)

    fun use(path: String = definedExternally, router: Express)
}