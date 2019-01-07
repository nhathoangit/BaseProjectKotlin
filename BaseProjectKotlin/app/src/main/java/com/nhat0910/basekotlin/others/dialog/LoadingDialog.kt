package com.nhat0910.basekotlin.others.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.nhat0910.basekotlin.R

/*
 * Created by NhatHoang on 28/12/2018.
 */
class LoadingDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        if (window != null) {
            window!!.setDimAmount(0.3f)
            window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }
        window!!.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        setContentView(R.layout.dialog_loading)
    }
}