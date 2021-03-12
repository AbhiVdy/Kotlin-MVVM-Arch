package com.core.shaditest.ui.base

import androidx.lifecycle.*
import com.core.shaditest.data.model.ResponseDaoModel
import com.core.shaditest.data.model.ResponseModel
import com.core.shaditest.data.repository.MainRepository
import com.core.shaditest.data.repository.ResponseDAORepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
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
        for (model in responseModel.results) {
            val name = model.name.first + " " + model.name.last
            responseDAORepository.insert(ResponseDaoModel(name))
        }
    }

    fun getSavedData(): LiveData<List<ResponseDaoModel>> {
        return responseDAORepository.responseModel.asLiveData()
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