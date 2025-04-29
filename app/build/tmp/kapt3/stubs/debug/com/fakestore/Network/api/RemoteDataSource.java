package com.fakestore.Network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/fakestore/Network/api/RemoteDataSource;", "", "()V", "buildApi", "Api", "api", "Ljava/lang/Class;", "context", "Landroid/content/Context;", "(Ljava/lang/Class;Landroid/content/Context;)Ljava/lang/Object;", "getRetrofitClient", "Lokhttp3/OkHttpClient;", "authenticator", "Lcom/fakestore/Network/api/TokenAuthenticator;", "Companion", "app_debug"})
public final class RemoteDataSource {
    @org.jetbrains.annotations.NotNull
    public static final com.fakestore.Network.api.RemoteDataSource.Companion Companion = null;
    private static final java.lang.String BASE_URL = "https://fakestoreapi.com/";
    
    @javax.inject.Inject
    public RemoteDataSource() {
        super();
    }
    
    public final <Api extends java.lang.Object>Api buildApi(@org.jetbrains.annotations.NotNull
    java.lang.Class<Api> api, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    private final okhttp3.OkHttpClient getRetrofitClient(com.fakestore.Network.api.TokenAuthenticator authenticator) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/fakestore/Network/api/RemoteDataSource$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}