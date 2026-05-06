package com.example.rnsdklibrary

import android.app.Activity
import android.content.Context
import android.content.Intent

object ChatSdk {

    fun open(context: Context) {
        val intent = Intent(context, ChatActivity::class.java)
        if (context !is Activity) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
}
