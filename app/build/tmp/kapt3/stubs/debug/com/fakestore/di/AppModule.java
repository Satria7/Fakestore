package com.fakestore.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/fakestore/di/AppModule;", "", "()V", "provideAuthApi", "Lcom/fakestore/Network/api/data/AuthApi;", "remoteDataSource", "Lcom/fakestore/Network/api/RemoteDataSource;", "context", "Landroid/content/Context;", "provideDatabase", "Lcom/fakestore/Room/ProductDatabase;", "app", "Landroid/app/Application;", "provideProductApi", "Lcom/fakestore/Network/api/data/StoreApi;", "provideUserApi", "Lcom/fakestore/Network/api/data/UserApi;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.fakestore.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.fakestore.Network.api.data.AuthApi provideAuthApi(@org.jetbrains.annotations.NotNull
    com.fakestore.Network.api.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.fakestore.Network.api.data.StoreApi provideProductApi(@org.jetbrains.annotations.NotNull
    com.fakestore.Network.api.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.fakestore.Network.api.data.UserApi provideUserApi(@org.jetbrains.annotations.NotNull
    com.fakestore.Network.api.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.fakestore.Room.ProductDatabase provideDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
}