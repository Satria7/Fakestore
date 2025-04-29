package com.fakestore.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.fakestore.Room.ProductEntity
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ProductItemFragmentArgs(
  public val ProductItem: ProductEntity? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ProductEntity::class.java)) {
      result.putParcelable("ProductItem", this.ProductItem as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ProductEntity::class.java)) {
      result.putSerializable("ProductItem", this.ProductItem as Serializable?)
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ProductEntity::class.java)) {
      result.set("ProductItem", this.ProductItem as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(ProductEntity::class.java)) {
      result.set("ProductItem", this.ProductItem as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ProductItemFragmentArgs {
      bundle.setClassLoader(ProductItemFragmentArgs::class.java.classLoader)
      val __ProductItem : ProductEntity?
      if (bundle.containsKey("ProductItem")) {
        if (Parcelable::class.java.isAssignableFrom(ProductEntity::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductEntity::class.java)) {
          __ProductItem = bundle.get("ProductItem") as ProductEntity?
        } else {
          throw UnsupportedOperationException(ProductEntity::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __ProductItem = null
      }
      return ProductItemFragmentArgs(__ProductItem)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ProductItemFragmentArgs {
      val __ProductItem : ProductEntity?
      if (savedStateHandle.contains("ProductItem")) {
        if (Parcelable::class.java.isAssignableFrom(ProductEntity::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductEntity::class.java)) {
          __ProductItem = savedStateHandle.get<ProductEntity?>("ProductItem")
        } else {
          throw UnsupportedOperationException(ProductEntity::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __ProductItem = null
      }
      return ProductItemFragmentArgs(__ProductItem)
    }
  }
}
