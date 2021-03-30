package com.core.shaditest.ui.base

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.shaditest.data.model.Profiles
import com.core.shaditest.data.model.ResponseModel
import com.core.shaditest.data.repository.MainRepository
import com.core.shaditest.data.repository.ResponseDAORepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class MainViewModel(
    private val mainRepository: MainRepository,
    private val responseDAORepository: ResponseDAORepository,
    size: Int
) : ViewModel() {

    private val profileList = MutableLiveData<UIView<ResponseModel>>()
    private val compositeDisposable = CompositeDisposable()

    init {
        getProfiles(size)
    }

    fun saveToDatabase(responseModel: ResponseModel) = viewModelScope.launch {
        println("responseList " + responseModel.results.size)
        for (model in responseModel.results) {
            try {
                println("val storing " + model.name)
                responseDAORepository.insert(
                    Profiles(
                        primId = null,
                        gender = model.gender,
                        name = model.name,
                        location = model.location,
                        email = model.email,
                        login = model.login,
                        dob = model.dob,
                        registered = model.registered,
                        phone = model.phone,
                        cell = model.cell,
                        id = model.id,
                        picture = model.picture,
                        nat = model.nat
                    )
                )
                println("val stored " + model.name)
            } catch (ex: Exception) {
                Log.e("SOME EX - ", ex.localizedMessage)
            }
        }
    }

    fun getSavedData(): Flow<List<Profiles>> {
        return responseDAORepository.responseModel
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
                        saveToDatabase(obj)
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