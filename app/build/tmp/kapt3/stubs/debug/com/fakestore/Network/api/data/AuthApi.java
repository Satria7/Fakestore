package com.fakestore.Network.api.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J/\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/fakestore/Network/api/data/AuthApi;", "", "login", "Lcom/fakestore/Network/Response/LoginResponse;", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/fakestore/Network/Response/UserResponse;", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "auth/login")
    @retrofit2.http.FormUrlEncoded
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fakestore.Network.Response.LoginResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "")
    @retrofit2.http.FormUrlEncoded
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.fakestore.Network.Response.UserResponse> continuation);
}