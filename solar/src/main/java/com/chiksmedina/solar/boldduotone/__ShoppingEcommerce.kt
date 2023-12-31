package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Bag
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Bag2
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Bag3
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Bag4
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Bag5
import com.chiksmedina.solar.boldduotone.shoppingecommerce.BagCheck
import com.chiksmedina.solar.boldduotone.shoppingecommerce.BagCross
import com.chiksmedina.solar.boldduotone.shoppingecommerce.BagHeart
import com.chiksmedina.solar.boldduotone.shoppingecommerce.BagMusic
import com.chiksmedina.solar.boldduotone.shoppingecommerce.BagMusic2
import com.chiksmedina.solar.boldduotone.shoppingecommerce.BagSmile
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Cart
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Cart2
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Cart3
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Cart4
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Cart5
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartCheck
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartCross
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge2
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge3
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge4
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartLargeMinimalistic
import com.chiksmedina.solar.boldduotone.shoppingecommerce.CartPlus
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Shop
import com.chiksmedina.solar.boldduotone.shoppingecommerce.Shop2
import com.chiksmedina.solar.boldduotone.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as KtList

object ShoppingEcommerceGroup

val BoldDuotoneSolar.ShoppingEcommerce: ShoppingEcommerceGroup
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
