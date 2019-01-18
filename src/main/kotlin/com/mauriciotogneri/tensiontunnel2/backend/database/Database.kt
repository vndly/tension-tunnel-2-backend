package com.mauriciotogneri.tensiontunnel2.backend.database

import com.firebase.firestore.Firestore

class Database
{
    companion object
    {
        lateinit var firestore: Firestore

        fun initialize(fs: Firestore)
        {
            firestore = fs
        }
    }
}