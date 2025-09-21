package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.foodkitchen.Bottle
import dev.chiksmedina.solar.boldduotone.foodkitchen.ChefHat
import dev.chiksmedina.solar.boldduotone.foodkitchen.ChefHatHeart
import dev.chiksmedina.solar.boldduotone.foodkitchen.ChefHatMinimalistic
import dev.chiksmedina.solar.boldduotone.foodkitchen.Corkscrew
import dev.chiksmedina.solar.boldduotone.foodkitchen.Cup
import dev.chiksmedina.solar.boldduotone.foodkitchen.CupHot
import dev.chiksmedina.solar.boldduotone.foodkitchen.CupPaper
import dev.chiksmedina.solar.boldduotone.foodkitchen.Donut
import dev.chiksmedina.solar.boldduotone.foodkitchen.DonutBitten
import dev.chiksmedina.solar.boldduotone.foodkitchen.Ladle
import dev.chiksmedina.solar.boldduotone.foodkitchen.OvenMitts
import dev.chiksmedina.solar.boldduotone.foodkitchen.OvenMittsMinimalistic
import dev.chiksmedina.solar.boldduotone.foodkitchen.RollingPin
import dev.chiksmedina.solar.boldduotone.foodkitchen.TeaCup
import dev.chiksmedina.solar.boldduotone.foodkitchen.Whisk
import dev.chiksmedina.solar.boldduotone.foodkitchen.Wineglass
import dev.chiksmedina.solar.boldduotone.foodkitchen.WineglassTriangle
import kotlin.collections.List as KtList

object FoodKitchenGroup

val BoldDuotoneSolar.FoodKitchen: FoodKitchenGroup
    get() = FoodKitchenGroup

private var _AllIcons: KtList<ImageVector>? = null

val FoodKitchenGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bottle,
            ChefHat,
            ChefHatHeart,
            ChefHatMinimalistic,
            Corkscrew,
            Cup,
            CupHot,
            CupPaper,
            Donut,
            DonutBitten,
            Ladle,
            OvenMitts,
            OvenMittsMinimalistic,
            RollingPin,
            TeaCup,
            Whisk,
            Wineglass,
            WineglassTriangle
        )
        return _AllIcons!!
    }
