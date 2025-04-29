package com.fakestore.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000f0\u000eJ\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0!0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/fakestore/Repository/ProductRepository;", "", "api", "Lcom/fakestore/Network/api/data/StoreApi;", "db", "Lcom/fakestore/Room/ProductDatabase;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/fakestore/Network/api/data/StoreApi;Lcom/fakestore/Room/ProductDatabase;Landroidx/lifecycle/SavedStateHandle;)V", "cartDao", "Lcom/fakestore/Room/Dao/CartDao;", "productDao", "Lcom/fakestore/Room/Dao/ProductDao;", "productsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fakestore/Room/ProductEntity;", "getProductsFlow", "()Lkotlinx/coroutines/flow/Flow;", "searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchQuery", "()Landroidx/lifecycle/MutableLiveData;", "addToCart", "", "product", "Lcom/fakestore/Room/CartEntity;", "(Lcom/fakestore/Room/CartEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartItem", "cartItem", "getCartItems", "getProducts", "Lcom/fakestore/util/Resource;", "app_debug"})
public final class ProductRepository {
    private final com.fakestore.Network.api.data.StoreApi api = null;
    private final com.fakestore.Room.ProductDatabase db = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    private final com.fakestore.Room.Dao.ProductDao productDao = null;
    private final com.fakestore.Room.Dao.CartDao cartDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery = null;
    
    /**
     * we want to use the save state to restore/save our search
     */
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.fakestore.Room.ProductEntity>> productsFlow = null;
    
    @javax.inject.Inject
    public ProductRepository(@org.jetbrains.annotations.NotNull
    com.fakestore.Network.api.data.StoreApi api, @org.jetbrains.annotations.NotNull
    com.fakestore.Room.ProductDatabase db, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fakestore.Room.ProductEntity>> getProductsFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.fakestore.util.Resource<java.util.List<com.fakestore.Room.ProductEntity>>> getProducts() {
        return null;
    }
    
    /**
     * not a suspend function since we didn't call our getAllCart in our Dao as suspend it is also coming from a loca;db
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.fakestore.Room.CartEntity>> getCartItems() {
        return null;
    }
    
    /**
     * saving our cartItems to our local database
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addToCart(@org.jetbrains.annotations.NotNull
    com.fakestore.Room.CartEntity product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * remove cartItem
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteCartItem(@org.jetbrains.annotations.NotNull
    com.fakestore.Room.CartEntity cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}