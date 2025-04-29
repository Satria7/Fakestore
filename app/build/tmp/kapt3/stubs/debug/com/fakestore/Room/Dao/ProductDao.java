package com.fakestore.Room.Dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\'J\u001f\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/fakestore/Room/Dao/ProductDao;", "", "deleteAllProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllProducts", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fakestore/Room/ProductEntity;", "searchQuery", "", "insertProducts", "products", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProductDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM products_table WHERE title LIKE \'%\' || :searchQuery || \'%\' ")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fakestore.Room.ProductEntity>> getAllProducts(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertProducts(@org.jetbrains.annotations.NotNull
    java.util.List<com.fakestore.Room.ProductEntity> products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM products_table ")
    public abstract java.lang.Object deleteAllProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}