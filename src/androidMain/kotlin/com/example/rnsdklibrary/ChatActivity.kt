package com.example.rnsdklibrary

import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultReactActivityDelegate

class ChatActivity : ReactActivity() {

    override fun getMainComponentName(): String = "ChatScreen"

    override fun createReactActivityDelegate(): ReactActivityDelegate =
        DefaultReactActivityDelegate(this, mainComponentName, fabricEnabled = true)
}
