package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.shoppingecommerce.Bag
import com.chiksmedina.solar.bold.shoppingecommerce.Bag2
import com.chiksmedina.solar.bold.shoppingecommerce.Bag3
import com.chiksmedina.solar.bold.shoppingecommerce.Bag4
import com.chiksmedina.solar.bold.shoppingecommerce.Bag5
import com.chiksmedina.solar.bold.shoppingecommerce.BagCheck
import com.chiksmedina.solar.bold.shoppingecommerce.BagCross
import com.chiksmedina.solar.bold.shoppingecommerce.BagHeart
import com.chiksmedina.solar.bold.shoppingecommerce.BagMusic
import com.chiksmedina.solar.bold.shoppingecommerce.BagMusic2
import com.chiksmedina.solar.bold.shoppingecommerce.BagSmile
import com.chiksmedina.solar.bold.shoppingecommerce.Cart
import com.chiksmedina.solar.bold.shoppingecommerce.Cart2
import com.chiksmedina.solar.bold.shoppingecommerce.Cart3
import com.chiksmedina.solar.bold.shoppingecommerce.Cart4
import com.chiksmedina.solar.bold.shoppingecommerce.Cart5
import com.chiksmedina.solar.bold.shoppingecommerce.CartCheck
import com.chiksmedina.solar.bold.shoppingecommerce.CartCross
import com.chiksmedina.solar.bold.shoppingecommerce.CartLarge
import com.chiksmedina.solar.bold.shoppingecommerce.CartLarge2
import com.chiksmedina.solar.bold.shoppingecommerce.CartLarge3
import com.chiksmedina.solar.bold.shoppingecommerce.CartLarge4
import com.chiksmedina.solar.bold.shoppingecommerce.CartLargeMinimalistic
import com.chiksmedina.solar.bold.shoppingecommerce.CartPlus
import com.chiksmedina.solar.bold.shoppingecommerce.Shop
import com.chiksmedina.solar.bold.shoppingecommerce.Shop2
import com.chiksmedina.solar.bold.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as ____KtList

public object ShoppingEcommerceGroup

public val BoldGroup.ShoppingEcommerce: ShoppingEcommerceGroup
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
