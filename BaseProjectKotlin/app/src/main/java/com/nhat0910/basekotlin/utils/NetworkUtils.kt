package com.nhat0910.basekotlin.utils

import android.content.Context
import android.net.ConnectivityManager

/*
 * Created by NhatHoang on 27/12/2018.
 */
class NetworkUtils {

    fun isNetworkConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnected
    }

}