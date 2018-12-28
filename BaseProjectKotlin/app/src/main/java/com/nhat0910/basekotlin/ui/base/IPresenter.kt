package com.nhat0910.basekotlin.ui.base

/*
 * Created by NhatHoang on 28/12/2018.
 */
interface IPresenter<V : MvpView> {

    fun onAttach(mvpView: V)

    fun onDetach()

    fun isViewAttach(): Boolean
}