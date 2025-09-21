package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.shoppingecommerce.Bag
import dev.chiksmedina.solar.outline.shoppingecommerce.Bag2
import dev.chiksmedina.solar.outline.shoppingecommerce.Bag3
import dev.chiksmedina.solar.outline.shoppingecommerce.Bag4
import dev.chiksmedina.solar.outline.shoppingecommerce.Bag5
import dev.chiksmedina.solar.outline.shoppingecommerce.BagCheck
import dev.chiksmedina.solar.outline.shoppingecommerce.BagCross
import dev.chiksmedina.solar.outline.shoppingecommerce.BagHeart
import dev.chiksmedina.solar.outline.shoppingecommerce.BagMusic
import dev.chiksmedina.solar.outline.shoppingecommerce.BagMusic2
import dev.chiksmedina.solar.outline.shoppingecommerce.BagSmile
import dev.chiksmedina.solar.outline.shoppingecommerce.Cart
import dev.chiksmedina.solar.outline.shoppingecommerce.Cart2
import dev.chiksmedina.solar.outline.shoppingecommerce.Cart3
import dev.chiksmedina.solar.outline.shoppingecommerce.Cart4
import dev.chiksmedina.solar.outline.shoppingecommerce.Cart5
import dev.chiksmedina.solar.outline.shoppingecommerce.CartCheck
import dev.chiksmedina.solar.outline.shoppingecommerce.CartCross
import dev.chiksmedina.solar.outline.shoppingecommerce.CartLarge
import dev.chiksmedina.solar.outline.shoppingecommerce.CartLarge2
import dev.chiksmedina.solar.outline.shoppingecommerce.CartLarge3
import dev.chiksmedina.solar.outline.shoppingecommerce.CartLarge4
import dev.chiksmedina.solar.outline.shoppingecommerce.CartLargeMinimalistic
import dev.chiksmedina.solar.outline.shoppingecommerce.CartPlus
import dev.chiksmedina.solar.outline.shoppingecommerce.Shop
import dev.chiksmedina.solar.outline.shoppingecommerce.Shop2
import dev.chiksmedina.solar.outline.shoppingecommerce.ShopMinimalistic
import kotlin.collections.List as KtList

object ShoppingEcommerceGroup

val OutlineSolar.ShoppingEcommerce: ShoppingEcommerceGroup
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
