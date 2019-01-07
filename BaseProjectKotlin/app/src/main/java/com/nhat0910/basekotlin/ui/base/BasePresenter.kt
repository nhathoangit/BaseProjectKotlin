package com.nhat0910.basekotlin.ui.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/*
 * Created by NhatHoang on 28/12/2018.
 */
class BasePresenter<V : MvpView>() : IPresenter<V> {

    private var view: V? = null
    private var compositeDisposable: CompositeDisposable

    init {
        this.compositeDisposable = CompositeDisposable()
    }

    override fun onAttach(mvpView: V) {
        this.view = mvpView
    }

    override fun onDetach() {
        this.view = null
        unsubscribe()
    }

    override fun isViewAttach(): Boolean {
        return view != null
    }

    private fun unsubscribe() {
        if (true) {
            compositeDisposable.dispose()
        }
    }

    fun getView(): V? {
        return view
    }

    protected fun addSubscribe(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

}