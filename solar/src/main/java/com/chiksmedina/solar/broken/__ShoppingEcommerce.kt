package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.shoppingecommerce.Bag
import com.chiksmedina.solar.broken.shoppingecommerce.Bag2
import com.chiksmedina.solar.broken.shoppingecommerce.Bag3
import com.chiksmedina.solar.broken.shoppingecommerce.Bag4
import com.chiksmedina.solar.broken.shoppingecommerce.Bag5
import com.chiksmedina.solar.broken.shoppingecommerce.BagCheck
import com.chiksmedina.solar.broken.shoppingecommerce.BagCross
import com.chiksmedina.solar.broken.shoppingecommerce.BagHeart
import com.chiksmedina.solar.broken.shoppingecommerce.BagMusic
import com.chiksmedina.solar.broken.shoppingecommerce.BagMusic2
import com.chiksmedina.solar.broken.shoppingecommerce.BagSmile
import com.chiksmedina.solar.broken.shoppingecommerce.Cart
import com.chiksmedina.solar.broken.shoppingecommerce.Cart2
import com.chiksmedina.solar.broken.shoppingecommerce.Cart3
import com.chiksmedina.solar.broken.shoppingecommerce.Cart4
import com.chiksmedina.solar.broken.shoppingecommerce.Cart5
import com.chiksmedina.solar.broken.shoppingecommerce.CartCheck
import com.chiksmedina.solar.broken.shoppingecommerce.CartCross
import com.chiksmedina.solar.broken.shoppingecommerce.CartLarge
import com.chiksmedina.solar.broken.shoppingecommerce.CartLarge2
import com.chiksmedina.solar.broken.shoppingecommerce.CartLarge3
import com.chiksmedina.solar.broken.shoppingecommerce.CartLarge4
import com.chiksmedina.solar.broken.shoppingecommerce.CartLargeMinimalistic
import com.chiksmedina.solar.broken.shoppingecommerce.CartPlus
import com.chiksmedina.solar.broken.shoppingecommerce.Shop
import com.chiksmedina.solar.broken.shoppingecommerce.Shop2
import com.chiksmedina.solar.broken.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as ____KtList

public object ShoppingEcommerceGroup

public val BrokenGroup.ShoppingEcommerce: ShoppingEcommerceGroup
  get() = ShoppingEcommerceGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ShoppingEcommerceGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bag, Bag2, Bag3, Bag4, Bag5, BagCheck, BagCross, BagHeart, BagMusic,
        BagMusic2, BagSmile, Cart, Cart2, Cart3, Cart4, Cart5, CartCheck, CartCross, CartLarge,
        CartLarge2, CartLarge3, CartLarge4, CartLargeMinimalistic, CartPlus, Shop, Shop2,
        ShopMinimalistic)
    return __AllIcons!!
  }
