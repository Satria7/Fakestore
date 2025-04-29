package com.fakestore.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/fakestore/Repository/UserRepository;", "Lcom/fakestore/Network/api/SafeApiCall;", "api", "Lcom/fakestore/Network/api/data/UserApi;", "(Lcom/fakestore/Network/api/data/UserApi;)V", "getUser", "Lcom/fakestore/util/Resource;", "", "Lcom/fakestore/Network/Response/UserResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository implements com.fakestore.Network.api.SafeApiCall {
    private final com.fakestore.Network.api.data.UserApi api = null;
    
    @javax.inject.Inject
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.fakestore.Network.api.data.UserApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fakestore.util.Resource<java.util.List<com.fakestore.Network.Response.UserResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fakestore.util.Resource<T>> p1) {
        return null;
    }
}