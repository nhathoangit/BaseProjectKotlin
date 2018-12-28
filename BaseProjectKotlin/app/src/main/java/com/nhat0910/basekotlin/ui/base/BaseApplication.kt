package com.nhat0910.basekotlin.ui.base

import android.app.Application
import android.content.Context

/*
 * Created by NhatHoang on 27/12/2018.
 */
class BaseApplication : Application() {
    private var mContext: Context? = null

    override fun onCreate() {
        super.onCreate()
        mContext = this
    }

    fun getContext(): Context? {
        return mContext
    }
}