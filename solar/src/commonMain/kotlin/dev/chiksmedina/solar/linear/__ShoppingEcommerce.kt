package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.shoppingecommerce.Bag
import dev.chiksmedina.solar.linear.shoppingecommerce.Bag2
import dev.chiksmedina.solar.linear.shoppingecommerce.Bag3
import dev.chiksmedina.solar.linear.shoppingecommerce.Bag4
import dev.chiksmedina.solar.linear.shoppingecommerce.Bag5
import dev.chiksmedina.solar.linear.shoppingecommerce.BagCheck
import dev.chiksmedina.solar.linear.shoppingecommerce.BagCross
import dev.chiksmedina.solar.linear.shoppingecommerce.BagHeart
import dev.chiksmedina.solar.linear.shoppingecommerce.BagMusic
import dev.chiksmedina.solar.linear.shoppingecommerce.BagMusic2
import dev.chiksmedina.solar.linear.shoppingecommerce.BagSmile
import dev.chiksmedina.solar.linear.shoppingecommerce.Cart
import dev.chiksmedina.solar.linear.shoppingecommerce.Cart2
import dev.chiksmedina.solar.linear.shoppingecommerce.Cart3
import dev.chiksmedina.solar.linear.shoppingecommerce.Cart4
import dev.chiksmedina.solar.linear.shoppingecommerce.Cart5
import dev.chiksmedina.solar.linear.shoppingecommerce.CartCheck
import dev.chiksmedina.solar.linear.shoppingecommerce.CartCross
import dev.chiksmedina.solar.linear.shoppingecommerce.CartLarge
import dev.chiksmedina.solar.linear.shoppingecommerce.CartLarge2
import dev.chiksmedina.solar.linear.shoppingecommerce.CartLarge3
import dev.chiksmedina.solar.linear.shoppingecommerce.CartLarge4
import dev.chiksmedina.solar.linear.shoppingecommerce.CartLargeMinimalistic
import dev.chiksmedina.solar.linear.shoppingecommerce.CartPlus
import dev.chiksmedina.solar.linear.shoppingecommerce.Shop
import dev.chiksmedina.solar.linear.shoppingecommerce.Shop2
import dev.chiksmedina.solar.linear.shoppingecommerce.ShopMinimalistic
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
