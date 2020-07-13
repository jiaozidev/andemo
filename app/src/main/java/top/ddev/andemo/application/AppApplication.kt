package top.ddev.andemo.application

import android.app.Application
import top.ddev.utils.ULog

/**
 * App的自定义Application
 */
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ULog.d(info = "AppApplication.onCreate()", tag = "Application")
    }
}