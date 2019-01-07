package com.nhat0910.basekotlin.ui.sample

import android.os.Bundle
import android.widget.Toast
import com.nhat0910.basekotlin.R
import com.nhat0910.basekotlin.ui.base.BaseActivity
import com.nhat0910.basekotlin.utils.NetworkUtils

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(NetworkUtils().isNetworkConnected(this)){
            Toast.makeText(this, "Có mạng", Toast.LENGTH_SHORT).show()
        }else
            Toast.makeText(this, "Không có mạng", Toast.LENGTH_SHORT).show()

    }
}
