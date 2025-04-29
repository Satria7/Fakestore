package com.fakestore.Room.Dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.fakestore.Room.CartEntity;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CartDao_Impl implements CartDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CartEntity> __insertionAdapterOfCartEntity;

  private final EntityDeletionOrUpdateAdapter<CartEntity> __deletionAdapterOfCartEntity;

  public CartDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCartEntity = new EntityInsertionAdapter<CartEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `cartItems` (`id`,`title`,`price`,`category`,`image`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getPrice());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategory());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
      }
    };
    this.__deletionAdapterOfCartEntity = new EntityDeletionOrUpdateAdapter<CartEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cartItems` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CartEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Object insertCartItems(final CartEntity product,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCartEntity.insert(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final CartEntity cartItem, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCartEntity.handle(cartItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<CartEntity>> getAllCartItems() {
    final String _sql = "SELECT * FROM cartItems";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"cartItems"}, new Callable<List<CartEntity>>() {
      @Override
      public List<CartEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<CartEntity> _result = new ArrayList<CartEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CartEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final Double _tmpPrice;
            if (_cursor.isNull(_cursorIndexOfPrice)) {
              _tmpPrice = null;
            } else {
              _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new CartEntity(_tmpId,_tmpTitle,_tmpPrice,_tmpCategory,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
