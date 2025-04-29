package com.fakestore.Repository.AuthRepository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/fakestore/Repository/AuthRepository/AuthRepository;", "Lcom/fakestore/Network/api/SafeApiCall;", "api", "Lcom/fakestore/Network/api/data/AuthApi;", "preferences", "Lcom/fakestore/datastore/PreferenceDataStore;", "(Lcom/fakestore/Network/api/data/AuthApi;Lcom/fakestore/datastore/PreferenceDataStore;)V", "SignUp", "Lcom/fakestore/util/Resource;", "Lcom/fakestore/Network/Response/UserResponse;", "email", "", "username", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/fakestore/Network/Response/LoginResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAccessTokens", "", "accessToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthRepository implements com.fakestore.Network.api.SafeApiCall {
    private final com.fakestore.Network.api.data.AuthApi api = null;
    private final com.fakestore.datastore.PreferenceDataStore preferences = null;
    
    @javax.inject.Inject
    public AuthRepository(@org.jetbrains.annotations.NotNull
    com.fakestore.Network.api.data.AuthApi api, @org.jetbrains.annotations.NotNull
    com.fakestore.datastore.PreferenceDataStore preferences) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fakestore.util.Resource<com.fakestore.Network.Response.LoginResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveAccessTokens(@org.jetbrains.annotations.NotNull
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object SignUp(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fakestore.util.Resource<com.fakestore.Network.Response.UserResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fakestore.util.Resource<T>> p1) {
        return null;
    }
}