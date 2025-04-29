package com.fakestore.Room;

import java.lang.System;

@androidx.room.Database(entities = {com.fakestore.Room.ProductEntity.class, com.fakestore.Room.CartEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/fakestore/Room/ProductDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cartDao", "Lcom/fakestore/Room/Dao/CartDao;", "productDao", "Lcom/fakestore/Room/Dao/ProductDao;", "app_debug"})
public abstract class ProductDatabase extends androidx.room.RoomDatabase {
    
    public ProductDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.fakestore.Room.Dao.ProductDao productDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.fakestore.Room.Dao.CartDao cartDao();
}