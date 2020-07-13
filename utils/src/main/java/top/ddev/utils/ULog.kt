package top.ddev.utils

import android.util.Log

/**
 * log信息工具类
 */
object ULog {

    var sDebug = false
    private const val commonLogTag = "ULog"

    /**
     * i级别信息输出
     */
    fun i(tag: String?, info: String) {
        if (sDebug) Log.i(tag ?: commonLogTag, info)
    }

    /**
     * d级别信息输出
     */
    fun d(tag: String?, info: String) {
        if (sDebug) Log.d(tag ?: commonLogTag, info)
    }

}