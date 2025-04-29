package com.fakestore.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/fakestore/datastore/PreferenceDataStore;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accessToken", "Lkotlinx/coroutines/flow/Flow;", "", "getAccessToken", "()Lkotlinx/coroutines/flow/Flow;", "appContext", "kotlin.jvm.PlatformType", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAccessToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class PreferenceDataStore {
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull
    public static final com.fakestore.datastore.PreferenceDataStore.Companion Companion = null;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> ACCESS_TOKEN = null;
    
    @javax.inject.Inject
    public PreferenceDataStore(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    /**
     * saving the auth token
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveAccessToken(@org.jetbrains.annotations.NotNull
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getAccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/fakestore/datastore/PreferenceDataStore$Companion;", "", "()V", "ACCESS_TOKEN", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}