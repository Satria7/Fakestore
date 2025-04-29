package com.fakestore.ViewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001f\u001a\u00020 R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u0019@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/fakestore/ViewModel/ProductItemViewModel;", "Landroidx/lifecycle/ViewModel;", "state", "Landroidx/lifecycle/SavedStateHandle;", "repository", "Lcom/fakestore/Repository/ProductRepository;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/fakestore/Repository/ProductRepository;)V", "product", "Lcom/fakestore/Room/ProductEntity;", "value", "", "productItemCategory", "getProductItemCategory", "()Ljava/lang/String;", "setProductItemCategory", "(Ljava/lang/String;)V", "productItemDescription", "getProductItemDescription", "setProductItemDescription", "productItemImage", "getProductItemImage", "setProductItemImage", "productItemName", "getProductItemName", "setProductItemName", "", "productItemPrice", "getProductItemPrice", "()Ljava/lang/Object;", "setProductItemPrice", "(Ljava/lang/Object;)V", "addToCart", "", "Companion", "app_debug"})
public final class ProductItemViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * we can use the SavedStateHandle to store little pieces of information to restore/recreating our ui
     * but also store the navigation arguments we sent over to this screen
     */
    private final androidx.lifecycle.SavedStateHandle state = null;
    private final com.fakestore.Repository.ProductRepository repository = null;
    @org.jetbrains.annotations.NotNull
    public static final com.fakestore.ViewModel.ProductItemViewModel.Companion Companion = null;
    private static final java.lang.String PRODUCT_ITEM = "ProductItem";
    private static final java.lang.String PRODUCT_ITEM_NAME = "productItemName";
    private static final java.lang.String PRODUCT_ITEM_CATEGORY = "productItemCategory";
    private static final java.lang.String PRODUCT_ITEM_IMAGE = "productItemImage";
    private static final java.lang.String PRODUCT_ITEM_PRICE = "productItemPrice";
    private static final java.lang.String PRODUCT_ITEM_DESCRIPTION = "productItemDescription";
    private final com.fakestore.Room.ProductEntity product = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String productItemName;
    @org.jetbrains.annotations.NotNull
    private java.lang.String productItemCategory;
    @org.jetbrains.annotations.NotNull
    private java.lang.String productItemImage;
    @org.jetbrains.annotations.NotNull
    private java.lang.Object productItemPrice;
    @org.jetbrains.annotations.NotNull
    private java.lang.String productItemDescription;
    
    @javax.inject.Inject
    public ProductItemViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle state, @org.jetbrains.annotations.NotNull
    com.fakestore.Repository.ProductRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProductItemName() {
        return null;
    }
    
    public final void setProductItemName(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProductItemCategory() {
        return null;
    }
    
    public final void setProductItemCategory(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProductItemImage() {
        return null;
    }
    
    public final void setProductItemImage(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getProductItemPrice() {
        return null;
    }
    
    public final void setProductItemPrice(@org.jetbrains.annotations.NotNull
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProductItemDescription() {
        return null;
    }
    
    public final void setProductItemDescription(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void addToCart() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fakestore/ViewModel/ProductItemViewModel$Companion;", "", "()V", "PRODUCT_ITEM", "", "PRODUCT_ITEM_CATEGORY", "PRODUCT_ITEM_DESCRIPTION", "PRODUCT_ITEM_IMAGE", "PRODUCT_ITEM_NAME", "PRODUCT_ITEM_PRICE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}