package com.core.shaditest.ui.base

import com.core.shaditest.utils.Constants

class UIView<out T>(val status: Constants.Status, val data: T?, val msg: String?) {
    companion object {
        fun <T> showLoading(data: T?): UIView<T> {
            return UIView(Constants.Status.LOADING, data, null)
        }

        fun <T> success(data: T?): UIView<T> {
            return UIView(Constants.Status.SUCCESS, data, null)
        }

        fun <T> failure(msg: String, data: T?): UIView<T> {
            return UIView(Constants.Status.ERROR, data, msg)
        }
    }
}