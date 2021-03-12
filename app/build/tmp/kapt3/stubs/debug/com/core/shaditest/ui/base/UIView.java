package com.core.shaditest.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u0010*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/core/shaditest/ui/base/UIView;", "T", "", "status", "Lcom/core/shaditest/utils/Constants$Status;", "data", "msg", "", "(Lcom/core/shaditest/utils/Constants$Status;Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "getStatus", "()Lcom/core/shaditest/utils/Constants$Status;", "Companion", "app_debug"})
public final class UIView<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.core.shaditest.utils.Constants.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.core.shaditest.ui.base.UIView.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shaditest.utils.Constants.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMsg() {
        return null;
    }
    
    public UIView(@org.jetbrains.annotations.NotNull()
    com.core.shaditest.utils.Constants.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/core/shaditest/ui/base/UIView$Companion;", "", "()V", "failure", "Lcom/core/shaditest/ui/base/UIView;", "T", "msg", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/core/shaditest/ui/base/UIView;", "showLoading", "(Ljava/lang/Object;)Lcom/core/shaditest/ui/base/UIView;", "success", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.core.shaditest.ui.base.UIView<T> showLoading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.core.shaditest.ui.base.UIView<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.core.shaditest.ui.base.UIView<T> failure(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}