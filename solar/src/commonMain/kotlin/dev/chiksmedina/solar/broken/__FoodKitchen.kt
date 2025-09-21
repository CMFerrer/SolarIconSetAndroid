package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.foodkitchen.Bottle
import dev.chiksmedina.solar.broken.foodkitchen.ChefHat
import dev.chiksmedina.solar.broken.foodkitchen.ChefHatHeart
import dev.chiksmedina.solar.broken.foodkitchen.ChefHatMinimalistic
import dev.chiksmedina.solar.broken.foodkitchen.Corkscrew
import dev.chiksmedina.solar.broken.foodkitchen.Cup
import dev.chiksmedina.solar.broken.foodkitchen.CupHot
import dev.chiksmedina.solar.broken.foodkitchen.CupPaper
import dev.chiksmedina.solar.broken.foodkitchen.Donut
import dev.chiksmedina.solar.broken.foodkitchen.DonutBitten
import dev.chiksmedina.solar.broken.foodkitchen.Ladle
import dev.chiksmedina.solar.broken.foodkitchen.OvenMitts
import dev.chiksmedina.solar.broken.foodkitchen.OvenMittsMinimalistic
import dev.chiksmedina.solar.broken.foodkitchen.RollingPin
import dev.chiksmedina.solar.broken.foodkitchen.TeaCup
import dev.chiksmedina.solar.broken.foodkitchen.Whisk
import dev.chiksmedina.solar.broken.foodkitchen.Wineglass
import dev.chiksmedina.solar.broken.foodkitchen.WineglassTriangle
import kotlin.collections.List as KtList

object FoodKitchenGroup

val BrokenSolar.FoodKitchen: FoodKitchenGroup
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
