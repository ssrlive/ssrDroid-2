package com.proxy.shadowsocksr

import android.annotation.SuppressLint

object Consts {
    //Default ss profile
    @JvmStatic
    val defaultLabel = "Sample"
    @JvmStatic
    val defaultIP = "please.change.me"
    @JvmStatic
    val defaultCryptMethod = "chacha20"
    @JvmStatic
    val defaultRemotePort = 233
    @JvmStatic
    val defaultLocalPort = 1093
    @JvmStatic
    val defaultRoute = "bypass-lan"
    //SSR
    @JvmStatic
    val defaultTcpProtocol = "origin"
    @JvmStatic
    val defaultObfsMethod = "plain"
    //
    //TODO: should not use hard-coded
    @SuppressLint("SdCardPath")
    @JvmStatic
    val baseDir = "/data/data/com.proxy.shadowsocksr/"
    //
    @JvmStatic
    val STATUS_CONNECTED = 0
    @JvmStatic
    val STATUS_FAILED = 1
    @JvmStatic
    val STATUS_DISCONNECTED = 2
    //
    @JvmStatic
    val lineSept = System.getProperty("line.separator")
}
