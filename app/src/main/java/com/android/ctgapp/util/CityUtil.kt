package com.android.ctgapp.util

import android.content.Context
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun Context.getParentMenuCode(): String {
    val sb = StringBuilder()
    val inputStream = assets.open("cityJson3.json")
    BufferedReader(InputStreamReader(inputStream)).use {
        var line = ""
        while (true) {
            line = it.readLine() ?: break
            sb.append(line)
        }
    }
    return sb.toString()
}