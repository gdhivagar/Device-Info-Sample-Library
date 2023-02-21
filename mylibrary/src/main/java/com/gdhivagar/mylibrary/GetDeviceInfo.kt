package com.gdhivagar.mylibrary

import android.content.ContentResolver
import android.os.Build
import android.provider.Settings
import java.util.*

object GetDeviceInfo {

    fun getDeviceBrand(): String {
        return Build.BRAND
    }

    fun getDeviceId(contentResolver: ContentResolver?): String {
        return Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
    }

    fun getUUID(): String {
        return UUID.randomUUID().toString()
    }

}