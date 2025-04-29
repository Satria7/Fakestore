package com.fakestore.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/fakestore/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/fakestore/ui/adapter/ProductAdapter$OnItemClickListener;", "()V", "binding", "Lcom/fakestore/databinding/FragmentHomeBinding;", "cartViewModel", "Lcom/fakestore/ViewModel/CartViewModel;", "getCartViewModel", "()Lcom/fakestore/ViewModel/CartViewModel;", "cartViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/fakestore/ViewModel/ProductViewModel;", "getViewModel", "()Lcom/fakestore/ViewModel/ProductViewModel;", "viewModel$delegate", "onAddToCartClicked", "", "cartItem", "Lcom/fakestore/Room/ProductEntity;", "onItemClick", "product", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.fakestore.ui.adapter.ProductAdapter.OnItemClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy cartViewModel$delegate = null;
    private com.fakestore.databinding.FragmentHomeBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
        super();
    }
    
    private final com.fakestore.ViewModel.ProductViewModel getViewModel() {
        return null;
    }
    
    private final com.fakestore.ViewModel.CartViewModel getCartViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    com.fakestore.Room.ProductEntity product) {
    }
    
    @java.lang.Override
    public void onAddToCartClicked(@org.jetbrains.annotations.NotNull
    com.fakestore.Room.ProductEntity cartItem) {
    }
}