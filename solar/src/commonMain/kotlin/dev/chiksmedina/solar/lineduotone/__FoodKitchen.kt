package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.foodkitchen.Bottle
import dev.chiksmedina.solar.lineduotone.foodkitchen.ChefHat
import dev.chiksmedina.solar.lineduotone.foodkitchen.ChefHatHeart
import dev.chiksmedina.solar.lineduotone.foodkitchen.ChefHatMinimalistic
import dev.chiksmedina.solar.lineduotone.foodkitchen.Corkscrew
import dev.chiksmedina.solar.lineduotone.foodkitchen.Cup
import dev.chiksmedina.solar.lineduotone.foodkitchen.CupHot
import dev.chiksmedina.solar.lineduotone.foodkitchen.CupPaper
import dev.chiksmedina.solar.lineduotone.foodkitchen.Donut
import dev.chiksmedina.solar.lineduotone.foodkitchen.DonutBitten
import dev.chiksmedina.solar.lineduotone.foodkitchen.Ladle
import dev.chiksmedina.solar.lineduotone.foodkitchen.OvenMitts
import dev.chiksmedina.solar.lineduotone.foodkitchen.OvenMittsMinimalistic
import dev.chiksmedina.solar.lineduotone.foodkitchen.RollingPin
import dev.chiksmedina.solar.lineduotone.foodkitchen.TeaCup
import dev.chiksmedina.solar.lineduotone.foodkitchen.Whisk
import dev.chiksmedina.solar.lineduotone.foodkitchen.Wineglass
import dev.chiksmedina.solar.lineduotone.foodkitchen.WineglassTriangle
import kotlin.collections.List as KtList

object FoodKitchenGroup

val LineDuotoneSolar.FoodKitchen: FoodKitchenGroup
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
