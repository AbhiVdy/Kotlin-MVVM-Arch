package com.core.shaditest.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/core/shaditest/data/network/NetworkService;", "", "getProfiledData", "Lio/reactivex/Single;", "Lcom/core/shaditest/data/model/ResponseModel;", "size", "", "(Ljava/lang/Integer;)Lio/reactivex/Single;", "app_debug"})
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/")
    public abstract io.reactivex.Single<com.core.shaditest.data.model.ResponseModel> getProfiledData(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "results")
    java.lang.Integer size);
}