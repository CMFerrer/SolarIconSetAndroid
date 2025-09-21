package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.foodkitchen.Bottle
import dev.chiksmedina.solar.bold.foodkitchen.ChefHat
import dev.chiksmedina.solar.bold.foodkitchen.ChefHatHeart
import dev.chiksmedina.solar.bold.foodkitchen.ChefHatMinimalistic
import dev.chiksmedina.solar.bold.foodkitchen.Corkscrew
import dev.chiksmedina.solar.bold.foodkitchen.Cup
import dev.chiksmedina.solar.bold.foodkitchen.CupHot
import dev.chiksmedina.solar.bold.foodkitchen.CupPaper
import dev.chiksmedina.solar.bold.foodkitchen.Donut
import dev.chiksmedina.solar.bold.foodkitchen.DonutBitten
import dev.chiksmedina.solar.bold.foodkitchen.Ladle
import dev.chiksmedina.solar.bold.foodkitchen.OvenMitts
import dev.chiksmedina.solar.bold.foodkitchen.OvenMittsMinimalistic
import dev.chiksmedina.solar.bold.foodkitchen.RollingPin
import dev.chiksmedina.solar.bold.foodkitchen.TeaCup
import dev.chiksmedina.solar.bold.foodkitchen.Whisk
import dev.chiksmedina.solar.bold.foodkitchen.Wineglass
import dev.chiksmedina.solar.bold.foodkitchen.WineglassTriangle
import kotlin.collections.List as KtList

object FoodKitchenGroup

val BoldSolar.FoodKitchen: FoodKitchenGroup
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
