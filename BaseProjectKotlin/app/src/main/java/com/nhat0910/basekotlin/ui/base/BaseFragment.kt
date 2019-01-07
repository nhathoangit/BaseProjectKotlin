package com.nhat0910.basekotlin.ui.base

import android.support.v4.app.Fragment

/*
 * Created by NhatHoang on 27/12/2018.
 */
open class BaseFragment : Fragment(), MvpView{
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addFragment(fragment: BaseFragment, isAddToBackStack: Boolean, isAnimation: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun replaceFragment(fragment: BaseFragment, isAddToBackStack: Boolean, isAnimation: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}