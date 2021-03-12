package com.core.shaditest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/core/shaditest/ShadiApplication;", "Landroid/app/Application;", "()V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "database", "Lcom/core/shaditest/data/db/ResponseModelDatabase;", "getDatabase", "()Lcom/core/shaditest/data/db/ResponseModelDatabase;", "database$delegate", "Lkotlin/Lazy;", "repository", "Lcom/core/shaditest/data/repository/ResponseDAORepository;", "getRepository", "()Lcom/core/shaditest/data/repository/ResponseDAORepository;", "repository$delegate", "onCreate", "", "Companion", "app_debug"})
public final class ShadiApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    public static com.core.shaditest.ShadiApplication instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.core.shaditest.ShadiApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
        return null;
    }
    
    private final com.core.shaditest.data.db.ResponseModelDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.core.shaditest.data.repository.ResponseDAORepository getRepository() {
        return null;
    }
    
    public ShadiApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/core/shaditest/ShadiApplication$Companion;", "", "()V", "instance", "Lcom/core/shaditest/ShadiApplication;", "getInstance", "()Lcom/core/shaditest/ShadiApplication;", "setInstance", "(Lcom/core/shaditest/ShadiApplication;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.core.shaditest.ShadiApplication getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.core.shaditest.ShadiApplication p0) {
        }
        
        private Companion() {
            super();
        }
    }
}