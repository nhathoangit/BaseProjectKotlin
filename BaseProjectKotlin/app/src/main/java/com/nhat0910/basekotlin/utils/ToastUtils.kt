package com.nhat0910.basekotlin.utils

import android.app.Activity
import android.widget.Toast
import com.nhat0910.basekotlin.ui.base.BaseApplication

/*
 * Created by NhatHoang on 27/12/2018.
 */
class ToastUtils  {
    fun toast(message: CharSequence) {
        Toast.makeText(BaseApplication().getContext(), message, Toast.LENGTH_SHORT).show()
    }
}