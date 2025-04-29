package com.fakestore.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/fakestore/ui/adapter/ProductAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/fakestore/Room/ProductEntity;", "Lcom/fakestore/ui/adapter/ProductAdapter$StoreViewHolder;", "listener", "Lcom/fakestore/ui/adapter/ProductAdapter$OnItemClickListener;", "(Lcom/fakestore/ui/adapter/ProductAdapter$OnItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "StoreComparator", "StoreViewHolder", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.ListAdapter<com.fakestore.Room.ProductEntity, com.fakestore.ui.adapter.ProductAdapter.StoreViewHolder> {
    private final com.fakestore.ui.adapter.ProductAdapter.OnItemClickListener listener = null;
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull
    com.fakestore.ui.adapter.ProductAdapter.OnItemClickListener listener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.fakestore.ui.adapter.ProductAdapter.StoreViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.fakestore.ui.adapter.ProductAdapter.StoreViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fakestore/ui/adapter/ProductAdapter$StoreViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/fakestore/databinding/HomeListItemLayoutBinding;", "(Lcom/fakestore/ui/adapter/ProductAdapter;Lcom/fakestore/databinding/HomeListItemLayoutBinding;)V", "bind", "", "product", "Lcom/fakestore/Room/ProductEntity;", "app_debug"})
    public final class StoreViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.fakestore.databinding.HomeListItemLayoutBinding binding = null;
        
        public StoreViewHolder(@org.jetbrains.annotations.NotNull
        com.fakestore.databinding.HomeListItemLayoutBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.ProductEntity product) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/fakestore/ui/adapter/ProductAdapter$OnItemClickListener;", "", "onAddToCartClicked", "", "cartItem", "Lcom/fakestore/Room/ProductEntity;", "onItemClick", "product", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.ProductEntity product);
        
        public abstract void onAddToCartClicked(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.ProductEntity cartItem);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/fakestore/ui/adapter/ProductAdapter$StoreComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/fakestore/Room/ProductEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class StoreComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.fakestore.Room.ProductEntity> {
        
        public StoreComparator() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.ProductEntity oldItem, @org.jetbrains.annotations.NotNull
        com.fakestore.Room.ProductEntity newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.fakestore.Room.ProductEntity oldItem, @org.jetbrains.annotations.NotNull
        com.fakestore.Room.ProductEntity newItem) {
            return false;
        }
    }
}