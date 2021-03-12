package com.core.shaditest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/core/shaditest/ui/base/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/core/shaditest/data/repository/MainRepository;", "responseDAORepository", "Lcom/core/shaditest/data/repository/ResponseDAORepository;", "size", "", "(Lcom/core/shaditest/data/repository/MainRepository;Lcom/core/shaditest/data/repository/ResponseDAORepository;I)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "profileList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/core/shaditest/ui/base/UIView;", "Lcom/core/shaditest/data/model/ResponseModel;", "getProfileList", "Landroidx/lifecycle/LiveData;", "getProfiles", "", "getSavedData", "", "Lcom/core/shaditest/data/model/ResponseDaoModel;", "onCleared", "saveToDatabase", "Lkotlinx/coroutines/Job;", "responseModel", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.core.shaditest.ui.base.UIView<com.core.shaditest.data.model.ResponseModel>> profileList = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.core.shaditest.data.repository.MainRepository mainRepository = null;
    private final com.core.shaditest.data.repository.ResponseDAORepository responseDAORepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveToDatabase(@org.jetbrains.annotations.NotNull()
    com.core.shaditest.data.model.ResponseModel responseModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.core.shaditest.data.model.ResponseDaoModel>> getSavedData() {
        return null;
    }
    
    public final void getProfiles(int size) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.core.shaditest.ui.base.UIView<com.core.shaditest.data.model.ResponseModel>> getProfileList() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.core.shaditest.data.repository.MainRepository mainRepository, @org.jetbrains.annotations.NotNull()
    com.core.shaditest.data.repository.ResponseDAORepository responseDAORepository, int size) {
        super();
    }
}