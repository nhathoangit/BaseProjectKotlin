package com.nhat0910.basekotlin.ui.base

import android.support.v7.app.AppCompatActivity
import com.nhat0910.basekotlin.ui.sample.MainActivity
import com.nhat0910.basekotlin.R
import com.nhat0910.basekotlin.data.local.CustomTransaction
import com.nhat0910.basekotlin.others.dialog.LoadingDialog
import com.nhat0910.basekotlin.utils.NetworkUtils

/*
 * Created by NhatHoang on 27/12/2018.
 */
open class BaseActivity : AppCompatActivity(), MvpView {
    private var mDialogView: LoadingDialog? = null

    override fun showLoading() {
        if (NetworkUtils().isNetworkConnected(this)) {
            if (mDialogView == null) {
                mDialogView = LoadingDialog(this)
                mDialogView?.setCanceledOnTouchOutside(false)
                mDialogView?.show()
            }
            mDialogView?.show()
        }
    }

    override fun hideLoading() {
        mDialogView.let {
            mDialogView?.dismiss()
        }

    }

    override fun addFragment(fragment: BaseFragment, isAddToBackStack: Boolean, isAnimation: Boolean) {
        addReplaceFragment(CustomTransaction(isAnimation = isAnimation), fragment, false, isAddToBackStack)
    }

    override fun replaceFragment(fragment: BaseFragment, isAddToBackStack: Boolean, isAnimation: Boolean) {
        addReplaceFragment(CustomTransaction(isAnimation = isAnimation), fragment, true, isAddToBackStack)
    }

    private fun addReplaceFragment(customTransaction: CustomTransaction, fragment: BaseFragment, isReplace: Boolean, isAddToBackStack: Boolean) {

        fun getCurrentViewID(view: Int): Int {
            return when {
                view != 0 -> view
                this is MainActivity -> android.R.id.tabcontent
                else -> R.id.frmContainer
            }
        }

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager?.beginTransaction()
        fragmentTransaction?.let { it ->
            if (customTransaction.isAnimation)
                it.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right)
            if (isReplace)
                it.replace(getCurrentViewID(customTransaction.containerViewId), fragment)
            else {
                val currentFragment = supportFragmentManager.findFragmentById(getCurrentViewID(customTransaction.containerViewId))
                currentFragment?.let { current -> it.hide(current) }
                it.add(getCurrentViewID(customTransaction.containerViewId), fragment, fragment::class.java.simpleName)
            }
            if (isAddToBackStack)
                it.addToBackStack(fragment::class.java.simpleName).commit()
        }
    }

    fun clearAllBackStack() {
        val fm = supportFragmentManager
        val count = fm?.backStackEntryCount
        count?.let {
            for (i in 0 until it) {
                fm.popBackStack()
            }
        }
    }

}