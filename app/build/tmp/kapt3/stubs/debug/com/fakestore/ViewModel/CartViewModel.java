package com.fakestore.ViewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\bR\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/fakestore/ViewModel/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fakestore/Repository/ProductRepository;", "(Lcom/fakestore/Repository/ProductRepository;)V", "getCart", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/fakestore/Room/CartEntity;", "getGetCart", "()Lkotlinx/coroutines/flow/StateFlow;", "getTotal", "Lkotlinx/coroutines/flow/Flow;", "", "getGetTotal", "()Lkotlinx/coroutines/flow/Flow;", "deletecartItem", "", "cartItem", "insertCartItem", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    private final com.fakestore.Repository.ProductRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.fakestore.Room.CartEntity>> getCart = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Double> getTotal = null;
    
    @javax.inject.Inject
    public CartViewModel(@org.jetbrains.annotations.NotNull
    com.fakestore.Repository.ProductRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.fakestore.Room.CartEntity>> getGetCart() {
        return null;
    }
    
    /**
     * delete cart item
     */
    public final void deletecartItem(@org.jetbrains.annotations.NotNull
    com.fakestore.Room.CartEntity cartItem) {
    }
    
    /**
     * adding item to cart
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertCartItem(@org.jetbrains.annotations.NotNull
    com.fakestore.Room.CartEntity cartItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Double> getGetTotal() {
        return null;
    }
}