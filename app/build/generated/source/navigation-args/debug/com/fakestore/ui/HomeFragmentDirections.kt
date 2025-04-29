package com.fakestore.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.fakestore.R
import com.fakestore.Room.ProductEntity
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToProductItemFragment(
    public val ProductItem: ProductEntity? = null
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_ProductItemFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(ProductEntity::class.java)) {
          result.putParcelable("ProductItem", this.ProductItem as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(ProductEntity::class.java)) {
          result.putSerializable("ProductItem", this.ProductItem as Serializable?)
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToProductItemFragment(ProductItem: ProductEntity? = null):
        NavDirections = ActionHomeFragmentToProductItemFragment(ProductItem)
  }
}
