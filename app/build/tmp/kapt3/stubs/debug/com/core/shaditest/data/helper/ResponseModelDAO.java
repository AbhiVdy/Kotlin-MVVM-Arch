package com.core.shaditest.data.helper;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/core/shaditest/data/helper/ResponseModelDAO;", "", "()V", "getResponseModel", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/core/shaditest/data/model/ResponseDaoModel;", "insertResponseModel", "", "profile", "app_debug"})
public abstract class ResponseModelDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from profilemodel")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.core.shaditest.data.model.ResponseDaoModel>> getResponseModel();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertResponseModel(@org.jetbrains.annotations.NotNull()
    com.core.shaditest.data.model.ResponseDaoModel profile);
    
    public ResponseModelDAO() {
        super();
    }
}