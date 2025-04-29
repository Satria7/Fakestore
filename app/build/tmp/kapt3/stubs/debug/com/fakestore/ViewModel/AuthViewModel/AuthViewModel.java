package com.fakestore.ViewModel.AuthViewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/fakestore/ViewModel/AuthViewModel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fakestore/Repository/AuthRepository/AuthRepository;", "(Lcom/fakestore/Repository/AuthRepository/AuthRepository;)V", "_loginResponse", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/fakestore/util/Resource;", "Lcom/fakestore/Network/Response/LoginResponse;", "_signupResponse", "Lcom/fakestore/Network/Response/UserResponse;", "loginResponse", "Landroidx/lifecycle/LiveData;", "getLoginResponse", "()Landroidx/lifecycle/LiveData;", "signupResponse", "getSignupResponse", "loginUser", "Lkotlinx/coroutines/Job;", "username", "", "password", "saveAccessTokens", "", "accessToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpUser", "email", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.fakestore.Repository.AuthRepository.AuthRepository repository = null;
    
    /**
     * Using Live data //live data version
     *   private val _loginResponse: MutableLiveData<Resource<LoginResponse>> = MutableLiveData()
     *   val loginResponse: LiveData<Resource<LoginResponse>>
     *   get() = _loginResponse
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.fakestore.util.Resource<com.fakestore.Network.Response.LoginResponse>> _loginResponse = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.fakestore.util.Resource<com.fakestore.Network.Response.LoginResponse>> loginResponse = null;
    
    /**
     * SignUp
     */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.fakestore.util.Resource<com.fakestore.Network.Response.UserResponse>> _signupResponse = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.fakestore.util.Resource<com.fakestore.Network.Response.UserResponse>> signupResponse = null;
    
    @javax.inject.Inject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.fakestore.Repository.AuthRepository.AuthRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.fakestore.util.Resource<com.fakestore.Network.Response.LoginResponse>> getLoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    /**
     * //consider using this over the above one
     * private val loginUser: StateFlow<Resource<LoginResponse>> = flow {
     *     emit(repository.login(username, password))
     * }.stateIn(
     *     scope = viewModelScope,
     *     started =  WhileSubscribed(5000), //SharingStarted.Lazily,
     *     initialValue = Resource.Loading()
     * )
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveAccessTokens(@org.jetbrains.annotations.NotNull
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.fakestore.util.Resource<com.fakestore.Network.Response.UserResponse>> getSignupResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job signUpUser(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
}