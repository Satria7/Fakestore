package com.fakestore.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/fakestore/ui/CartItemsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/fakestore/ui/adapter/CartAdapter$OnItemClickListener;", "()V", "viewModel", "Lcom/fakestore/ViewModel/CartViewModel;", "getViewModel", "()Lcom/fakestore/ViewModel/CartViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onRemoveFromCartClicked", "", "cartItem", "Lcom/fakestore/Room/CartEntity;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CartItemsFragment extends androidx.fragment.app.Fragment implements com.fakestore.ui.adapter.CartAdapter.OnItemClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public CartItemsFragment() {
        super();
    }
    
    private final com.fakestore.ViewModel.CartViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onRemoveFromCartClicked(@org.jetbrains.annotations.NotNull
    com.fakestore.Room.CartEntity cartItem) {
    }
}