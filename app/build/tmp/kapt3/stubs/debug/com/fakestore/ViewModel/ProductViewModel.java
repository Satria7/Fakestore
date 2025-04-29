package com.fakestore.ViewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\rR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/fakestore/ViewModel/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fakestore/Repository/ProductRepository;", "userRepository", "Lcom/fakestore/Repository/UserRepository;", "(Lcom/fakestore/Repository/ProductRepository;Lcom/fakestore/Repository/UserRepository;)V", "_user", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/fakestore/util/Resource;", "", "Lcom/fakestore/Network/Response/UserResponse;", "getElectonics", "Lkotlinx/coroutines/Job;", "getGetElectonics", "()Lkotlinx/coroutines/Job;", "products", "Landroidx/lifecycle/LiveData;", "Lcom/fakestore/Room/ProductEntity;", "getProducts", "()Landroidx/lifecycle/LiveData;", "searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "getSearchQuery", "()Landroidx/lifecycle/MutableLiveData;", "user", "getUser", "app_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    private final com.fakestore.Repository.ProductRepository repository = null;
    private final com.fakestore.Repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery = null;
    
    /**
     * we don't have to launch a coroutine to collect the flow.since we turned the flow into live data its already handled for us
     */
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.fakestore.util.Resource<java.util.List<com.fakestore.Room.ProductEntity>>> products = null;
    
    /**
     * NOT WORKING
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.fakestore.util.Resource<java.util.List<com.fakestore.Network.Response.UserResponse>>> _user = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.fakestore.util.Resource<java.util.List<com.fakestore.Network.Response.UserResponse>>> user = null;
    
    /**
     * NOT WORKING
     */
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.Job getElectonics = null;
    
    @javax.inject.Inject
    public ProductViewModel(@org.jetbrains.annotations.NotNull
    com.fakestore.Repository.ProductRepository repository, @org.jetbrains.annotations.NotNull
    com.fakestore.Repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.fakestore.util.Resource<java.util.List<com.fakestore.Room.ProductEntity>>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.fakestore.util.Resource<java.util.List<com.fakestore.Network.Response.UserResponse>>> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getGetElectonics() {
        return null;
    }
}