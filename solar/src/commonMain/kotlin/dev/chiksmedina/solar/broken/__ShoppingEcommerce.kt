package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.shoppingecommerce.Bag
import dev.chiksmedina.solar.broken.shoppingecommerce.Bag2
import dev.chiksmedina.solar.broken.shoppingecommerce.Bag3
import dev.chiksmedina.solar.broken.shoppingecommerce.Bag4
import dev.chiksmedina.solar.broken.shoppingecommerce.Bag5
import dev.chiksmedina.solar.broken.shoppingecommerce.BagCheck
import dev.chiksmedina.solar.broken.shoppingecommerce.BagCross
import dev.chiksmedina.solar.broken.shoppingecommerce.BagHeart
import dev.chiksmedina.solar.broken.shoppingecommerce.BagMusic
import dev.chiksmedina.solar.broken.shoppingecommerce.BagMusic2
import dev.chiksmedina.solar.broken.shoppingecommerce.BagSmile
import dev.chiksmedina.solar.broken.shoppingecommerce.Cart
import dev.chiksmedina.solar.broken.shoppingecommerce.Cart2
import dev.chiksmedina.solar.broken.shoppingecommerce.Cart3
import dev.chiksmedina.solar.broken.shoppingecommerce.Cart4
import dev.chiksmedina.solar.broken.shoppingecommerce.Cart5
import dev.chiksmedina.solar.broken.shoppingecommerce.CartCheck
import dev.chiksmedina.solar.broken.shoppingecommerce.CartCross
import dev.chiksmedina.solar.broken.shoppingecommerce.CartLarge
import dev.chiksmedina.solar.broken.shoppingecommerce.CartLarge2
import dev.chiksmedina.solar.broken.shoppingecommerce.CartLarge3
import dev.chiksmedina.solar.broken.shoppingecommerce.CartLarge4
import dev.chiksmedina.solar.broken.shoppingecommerce.CartLargeMinimalistic
import dev.chiksmedina.solar.broken.shoppingecommerce.CartPlus
import dev.chiksmedina.solar.broken.shoppingecommerce.Shop
import dev.chiksmedina.solar.broken.shoppingecommerce.Shop2
import dev.chiksmedina.solar.broken.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as KtList

object ShoppingEcommerceGroup

val BrokenSolar.ShoppingEcommerce: ShoppingEcommerceGroup
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
