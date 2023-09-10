package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.shoppingecommerce.Bag
import com.chiksmedina.solar.linear.shoppingecommerce.Bag2
import com.chiksmedina.solar.linear.shoppingecommerce.Bag3
import com.chiksmedina.solar.linear.shoppingecommerce.Bag4
import com.chiksmedina.solar.linear.shoppingecommerce.Bag5
import com.chiksmedina.solar.linear.shoppingecommerce.BagCheck
import com.chiksmedina.solar.linear.shoppingecommerce.BagCross
import com.chiksmedina.solar.linear.shoppingecommerce.BagHeart
import com.chiksmedina.solar.linear.shoppingecommerce.BagMusic
import com.chiksmedina.solar.linear.shoppingecommerce.BagMusic2
import com.chiksmedina.solar.linear.shoppingecommerce.BagSmile
import com.chiksmedina.solar.linear.shoppingecommerce.Cart
import com.chiksmedina.solar.linear.shoppingecommerce.Cart2
import com.chiksmedina.solar.linear.shoppingecommerce.Cart3
import com.chiksmedina.solar.linear.shoppingecommerce.Cart4
import com.chiksmedina.solar.linear.shoppingecommerce.Cart5
import com.chiksmedina.solar.linear.shoppingecommerce.CartCheck
import com.chiksmedina.solar.linear.shoppingecommerce.CartCross
import com.chiksmedina.solar.linear.shoppingecommerce.CartLarge
import com.chiksmedina.solar.linear.shoppingecommerce.CartLarge2
import com.chiksmedina.solar.linear.shoppingecommerce.CartLarge3
import com.chiksmedina.solar.linear.shoppingecommerce.CartLarge4
import com.chiksmedina.solar.linear.shoppingecommerce.CartLargeMinimalistic
import com.chiksmedina.solar.linear.shoppingecommerce.CartPlus
import com.chiksmedina.solar.linear.shoppingecommerce.Shop
import com.chiksmedina.solar.linear.shoppingecommerce.Shop2
import com.chiksmedina.solar.linear.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as KtList

object ShoppingEcommerceGroup

val LinearSolar.ShoppingEcommerce: ShoppingEcommerceGroup
    get() = ShoppingEcommerceGroup

private var _AllIcons: KtList<ImageVector>? = null

val ShoppingEcommerceGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bag, Bag2, Bag3, Bag4, Bag5, BagCheck, BagCross, BagHeart, BagMusic,
            BagMusic2, BagSmile, Cart, Cart2, Cart3, Cart4, Cart5, CartCheck, CartCross, CartLarge,
            CartLarge2, CartLarge3, CartLarge4, CartLargeMinimalistic, CartPlus, Shop, Shop2,
            ShopMinimalistic
        )
        return _AllIcons!!
    }
