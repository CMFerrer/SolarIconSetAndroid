package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Bag
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Bag2
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Bag3
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Bag4
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Bag5
import com.chiksmedina.solar.lineduotone.shoppingecommerce.BagCheck
import com.chiksmedina.solar.lineduotone.shoppingecommerce.BagCross
import com.chiksmedina.solar.lineduotone.shoppingecommerce.BagHeart
import com.chiksmedina.solar.lineduotone.shoppingecommerce.BagMusic
import com.chiksmedina.solar.lineduotone.shoppingecommerce.BagMusic2
import com.chiksmedina.solar.lineduotone.shoppingecommerce.BagSmile
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Cart
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Cart2
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Cart3
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Cart4
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Cart5
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartCheck
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartCross
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge2
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge3
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge4
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartLargeMinimalistic
import com.chiksmedina.solar.lineduotone.shoppingecommerce.CartPlus
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Shop
import com.chiksmedina.solar.lineduotone.shoppingecommerce.Shop2
import com.chiksmedina.solar.lineduotone.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as ____KtList

public object ShoppingEcommerceGroup

public val LineduotoneGroup.ShoppingEcommerce: ShoppingEcommerceGroup
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
