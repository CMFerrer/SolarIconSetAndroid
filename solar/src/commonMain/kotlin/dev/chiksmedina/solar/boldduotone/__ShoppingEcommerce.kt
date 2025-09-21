package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Bag
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Bag2
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Bag3
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Bag4
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Bag5
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.BagCheck
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.BagCross
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.BagHeart
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.BagMusic
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.BagMusic2
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.BagSmile
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Cart
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Cart2
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Cart3
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Cart4
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Cart5
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartCheck
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartCross
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge2
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge3
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartLarge4
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartLargeMinimalistic
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.CartPlus
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Shop
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.Shop2
import dev.chiksmedina.solar.boldduotone.shoppingecommerce.ShopMinimalistic
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
