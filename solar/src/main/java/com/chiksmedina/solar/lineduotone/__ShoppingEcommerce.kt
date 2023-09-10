package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
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
import kotlin.collections.List as KtList

object ShoppingEcommerceGroup

val LineDuotoneSolar.ShoppingEcommerce: ShoppingEcommerceGroup
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
