package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.foodkitchen.Bottle
import dev.chiksmedina.solar.outline.foodkitchen.ChefHat
import dev.chiksmedina.solar.outline.foodkitchen.ChefHatHeart
import dev.chiksmedina.solar.outline.foodkitchen.ChefHatMinimalistic
import dev.chiksmedina.solar.outline.foodkitchen.Corkscrew
import dev.chiksmedina.solar.outline.foodkitchen.Cup
import dev.chiksmedina.solar.outline.foodkitchen.CupHot
import dev.chiksmedina.solar.outline.foodkitchen.CupPaper
import dev.chiksmedina.solar.outline.foodkitchen.Donut
import dev.chiksmedina.solar.outline.foodkitchen.DonutBitten
import dev.chiksmedina.solar.outline.foodkitchen.Ladle
import dev.chiksmedina.solar.outline.foodkitchen.OvenMitts
import dev.chiksmedina.solar.outline.foodkitchen.OvenMittsMinimalistic
import dev.chiksmedina.solar.outline.foodkitchen.RollingPin
import dev.chiksmedina.solar.outline.foodkitchen.TeaCup
import dev.chiksmedina.solar.outline.foodkitchen.Whisk
import dev.chiksmedina.solar.outline.foodkitchen.Wineglass
import dev.chiksmedina.solar.outline.foodkitchen.WineglassTriangle
import kotlin.collections.List as KtList

object FoodKitchenGroup

val OutlineSolar.FoodKitchen: FoodKitchenGroup
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
