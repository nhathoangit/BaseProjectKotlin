package com.nhat0910.basekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nhat0910.basekotlin.ui.base.BaseApplication
import com.nhat0910.basekotlin.utils.NetworkUtils
import com.nhat0910.basekotlin.utils.ToastUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(NetworkUtils().isNetworkConnected(this)){
            Toast.makeText(this, "Có mạng", Toast.LENGTH_SHORT).show()
        }else
            Toast.makeText(this, "Không có mạng", Toast.LENGTH_SHORT).show()

    }
}
