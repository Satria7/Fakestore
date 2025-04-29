package com.fakestore.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/fakestore/ui/adapter/CartAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/fakestore/Room/CartEntity;", "Lcom/fakestore/ui/adapter/CartAdapter$CartViewHolder;", "listener", "Lcom/fakestore/ui/adapter/CartAdapter$OnItemClickListener;", "(Lcom/fakestore/ui/adapter/CartAdapter$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CartComparator", "CartViewHolder", "OnItemClickListener", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.ListAdapter<com.fakestore.Room.CartEntity, com.fakestore.ui.adapter.CartAdapter.CartViewHolder> {
    private final com.fakestore.ui.adapter.CartAdapter.OnItemClickListener listener = null;
    
    public CartAdapter(@org.jetbrains.annotations.NotNull
    com.fakestore.ui.adapter.CartAdapter.OnItemClickListener listener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.fakestore.ui.adapter.CartAdapter.CartViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.fakestore.ui.adapter.CartAdapter.CartViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fakestore/ui/adapter/CartAdapter$CartViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/fakestore/databinding/CartRowLayoutBinding;", "(Lcom/fakestore/ui/adapter/CartAdapter;Lcom/fakestore/databinding/CartRowLayoutBinding;)V", "bind", "", "cart", "Lcom/fakestore/Room/CartEntity;", "app_debug"})
    public final class CartViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.fakestore.databinding.CartRowLayoutBinding binding = null;
        
        public CartViewHolder(@org.jetbrains.annotations.NotNull
        com.fakestore.databinding.CartRowLayoutBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.CartEntity cart) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/fakestore/ui/adapter/CartAdapter$OnItemClickListener;", "", "onRemoveFromCartClicked", "", "cartItem", "Lcom/fakestore/Room/CartEntity;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onRemoveFromCartClicked(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.CartEntity cartItem);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/fakestore/ui/adapter/CartAdapter$CartComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/fakestore/Room/CartEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class CartComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.fakestore.Room.CartEntity> {
        
        public CartComparator() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.CartEntity oldItem, @org.jetbrains.annotations.NotNull
        com.fakestore.Room.CartEntity newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.CartEntity oldItem, @org.jetbrains.annotations.NotNull
        com.fakestore.Room.CartEntity newItem) {
            return false;
        }
    }
}