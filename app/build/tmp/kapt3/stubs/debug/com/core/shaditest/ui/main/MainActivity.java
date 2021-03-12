package com.core.shaditest.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J \u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/core/shaditest/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/core/shaditest/ui/main/ProfileAdapter$ProfileEventListener;", "()V", "binding", "Lcom/core/shaditest/databinding/ActivityMainBinding;", "currSize", "", "mainViewModel", "Lcom/core/shaditest/ui/base/MainViewModel;", "profileAdapter", "Lcom/core/shaditest/ui/main/ProfileAdapter;", "profilesList", "Ljava/util/ArrayList;", "Lcom/core/shaditest/data/model/Profiles;", "Lkotlin/collections/ArrayList;", "responseModel", "Lcom/core/shaditest/data/model/ResponseModel;", "addDataToList", "", "fetchData", "onActionButtonClicked", "profile", "pos", "status", "Lcom/core/shaditest/utils/Constants$SELECTION_STATUS;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPageIncresed", "setUI", "setViewModel", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.core.shaditest.ui.main.ProfileAdapter.ProfileEventListener {
    private com.core.shaditest.databinding.ActivityMainBinding binding;
    private com.core.shaditest.ui.base.MainViewModel mainViewModel;
    private com.core.shaditest.data.model.ResponseModel responseModel;
    private java.util.ArrayList<com.core.shaditest.data.model.Profiles> profilesList;
    private com.core.shaditest.ui.main.ProfileAdapter profileAdapter;
    private int currSize = 10;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUI() {
    }
    
    private final void setViewModel() {
    }
    
    private final void fetchData() {
    }
    
    private final void addDataToList(com.core.shaditest.data.model.ResponseModel responseModel) {
    }
    
    @java.lang.Override()
    public void onPageIncresed() {
    }
    
    @java.lang.Override()
    public void onActionButtonClicked(@org.jetbrains.annotations.NotNull()
    com.core.shaditest.data.model.Profiles profile, int pos, @org.jetbrains.annotations.NotNull()
    com.core.shaditest.utils.Constants.SELECTION_STATUS status) {
    }
    
    public MainActivity() {
        super();
    }
}