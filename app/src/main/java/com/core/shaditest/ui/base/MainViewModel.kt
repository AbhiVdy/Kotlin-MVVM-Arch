package com.core.shaditest.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.core.shaditest.data.helper.UIView
import com.core.shaditest.data.model.ResponseModel
import com.core.shaditest.data.repository.MainRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainViewModel(private val mainRepository: MainRepository, val size: Int) : ViewModel() {

    private val profileList = MutableLiveData<UIView<ResponseModel>>()
    private val compositeDisposable = CompositeDisposable()

    init {
        getProfiles(size)
    }

    fun getProfiles(size: Int) {
        profileList.postValue(UIView.showLoading(null))
        compositeDisposable.add(
            mainRepository.getProfileList(size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { obj ->
                        profileList.postValue(
                            UIView.success(obj)
                        )
                    },
                    { throwable ->
                        profileList.postValue(
                            UIView.failure(
                                "Something went wrong",
                                null
                            )
                        )
                    })
        )
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

    fun getProfileList(): LiveData<UIView<ResponseModel>> {
        return profileList
    }
}