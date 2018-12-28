package com.nhat0910.basekotlin.ui.base

/*
 * Created by NhatHoang on 28/12/2018.
 */
interface MvpView {
    fun showLoading()

    fun hideLoading()

    fun addFragment(fragment: BaseFragment, isAddToBackStack: Boolean, isAnimation: Boolean)

    fun replaceFragment(fragment: BaseFragment, isAddToBackStack: Boolean, isAnimation: Boolean)
}