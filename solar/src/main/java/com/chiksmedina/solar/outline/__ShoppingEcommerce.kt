package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.shoppingecommerce.Bag
import com.chiksmedina.solar.outline.shoppingecommerce.Bag2
import com.chiksmedina.solar.outline.shoppingecommerce.Bag3
import com.chiksmedina.solar.outline.shoppingecommerce.Bag4
import com.chiksmedina.solar.outline.shoppingecommerce.Bag5
import com.chiksmedina.solar.outline.shoppingecommerce.BagCheck
import com.chiksmedina.solar.outline.shoppingecommerce.BagCross
import com.chiksmedina.solar.outline.shoppingecommerce.BagHeart
import com.chiksmedina.solar.outline.shoppingecommerce.BagMusic
import com.chiksmedina.solar.outline.shoppingecommerce.BagMusic2
import com.chiksmedina.solar.outline.shoppingecommerce.BagSmile
import com.chiksmedina.solar.outline.shoppingecommerce.Cart
import com.chiksmedina.solar.outline.shoppingecommerce.Cart2
import com.chiksmedina.solar.outline.shoppingecommerce.Cart3
import com.chiksmedina.solar.outline.shoppingecommerce.Cart4
import com.chiksmedina.solar.outline.shoppingecommerce.Cart5
import com.chiksmedina.solar.outline.shoppingecommerce.CartCheck
import com.chiksmedina.solar.outline.shoppingecommerce.CartCross
import com.chiksmedina.solar.outline.shoppingecommerce.CartLarge
import com.chiksmedina.solar.outline.shoppingecommerce.CartLarge2
import com.chiksmedina.solar.outline.shoppingecommerce.CartLarge3
import com.chiksmedina.solar.outline.shoppingecommerce.CartLarge4
import com.chiksmedina.solar.outline.shoppingecommerce.CartLargeMinimalistic
import com.chiksmedina.solar.outline.shoppingecommerce.CartPlus
import com.chiksmedina.solar.outline.shoppingecommerce.Shop
import com.chiksmedina.solar.outline.shoppingecommerce.Shop2
import com.chiksmedina.solar.outline.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as ____KtList

public object ShoppingEcommerceGroup

public val OutlineGroup.ShoppingEcommerce: ShoppingEcommerceGroup
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
