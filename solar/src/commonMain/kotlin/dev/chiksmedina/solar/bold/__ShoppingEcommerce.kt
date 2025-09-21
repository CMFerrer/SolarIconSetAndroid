package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.shoppingecommerce.Bag
import dev.chiksmedina.solar.bold.shoppingecommerce.Bag2
import dev.chiksmedina.solar.bold.shoppingecommerce.Bag3
import dev.chiksmedina.solar.bold.shoppingecommerce.Bag4
import dev.chiksmedina.solar.bold.shoppingecommerce.Bag5
import dev.chiksmedina.solar.bold.shoppingecommerce.BagCheck
import dev.chiksmedina.solar.bold.shoppingecommerce.BagCross
import dev.chiksmedina.solar.bold.shoppingecommerce.BagHeart
import dev.chiksmedina.solar.bold.shoppingecommerce.BagMusic
import dev.chiksmedina.solar.bold.shoppingecommerce.BagMusic2
import dev.chiksmedina.solar.bold.shoppingecommerce.BagSmile
import dev.chiksmedina.solar.bold.shoppingecommerce.Cart
import dev.chiksmedina.solar.bold.shoppingecommerce.Cart2
import dev.chiksmedina.solar.bold.shoppingecommerce.Cart3
import dev.chiksmedina.solar.bold.shoppingecommerce.Cart4
import dev.chiksmedina.solar.bold.shoppingecommerce.Cart5
import dev.chiksmedina.solar.bold.shoppingecommerce.CartCheck
import dev.chiksmedina.solar.bold.shoppingecommerce.CartCross
import dev.chiksmedina.solar.bold.shoppingecommerce.CartLarge
import dev.chiksmedina.solar.bold.shoppingecommerce.CartLarge2
import dev.chiksmedina.solar.bold.shoppingecommerce.CartLarge3
import dev.chiksmedina.solar.bold.shoppingecommerce.CartLarge4
import dev.chiksmedina.solar.bold.shoppingecommerce.CartLargeMinimalistic
import dev.chiksmedina.solar.bold.shoppingecommerce.CartPlus
import dev.chiksmedina.solar.bold.shoppingecommerce.Shop
import dev.chiksmedina.solar.bold.shoppingecommerce.Shop2
import dev.chiksmedina.solar.bold.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as KtList

object ShoppingEcommerceGroup

val BoldSolar.ShoppingEcommerce: ShoppingEcommerceGroup
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
