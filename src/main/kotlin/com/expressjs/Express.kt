package com.expressjs

@JsModule("express")
external class Express
{
    fun get(route: String, callback: (req: Request, res: Response) -> Unit)
    fun post(route: String, callback: (req: Request, res: Response) -> Unit)
    fun put(route: String, callback: (req: Request, res: Response) -> Unit)
    fun delete(route: String, callback: (req: Request, res: Response) -> Unit)

    fun param(name: String, handler: (req: Request, res: Response, next: NextResponse, value: Any, name: String) -> Any): Express
    fun param(name: Array<String>, handler: (req: Request, res: Response, next: NextResponse, value: Any, name: String) -> Any): Express

    fun use(path: String = definedExternally, router: Express)
}

typealias NextResponse = (Error?) -> Unit