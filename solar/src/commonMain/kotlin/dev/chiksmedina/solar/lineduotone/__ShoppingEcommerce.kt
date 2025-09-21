package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Bag
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Bag2
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Bag3
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Bag4
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Bag5
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.BagCheck
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.BagCross
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.BagHeart
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.BagMusic
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.BagMusic2
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.BagSmile
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Cart
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Cart2
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Cart3
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Cart4
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Cart5
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartCheck
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartCross
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge2
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge3
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartLarge4
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartLargeMinimalistic
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.CartPlus
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Shop
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.Shop2
import dev.chiksmedina.solar.lineduotone.shoppingecommerce.ShopMinimalistic
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
