package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.foodkitchen.Bottle
import dev.chiksmedina.solar.linear.foodkitchen.ChefHat
import dev.chiksmedina.solar.linear.foodkitchen.ChefHatHeart
import dev.chiksmedina.solar.linear.foodkitchen.ChefHatMinimalistic
import dev.chiksmedina.solar.linear.foodkitchen.Corkscrew
import dev.chiksmedina.solar.linear.foodkitchen.Cup
import dev.chiksmedina.solar.linear.foodkitchen.CupHot
import dev.chiksmedina.solar.linear.foodkitchen.CupPaper
import dev.chiksmedina.solar.linear.foodkitchen.Donut
import dev.chiksmedina.solar.linear.foodkitchen.DonutBitten
import dev.chiksmedina.solar.linear.foodkitchen.Ladle
import dev.chiksmedina.solar.linear.foodkitchen.OvenMitts
import dev.chiksmedina.solar.linear.foodkitchen.OvenMittsMinimalistic
import dev.chiksmedina.solar.linear.foodkitchen.RollingPin
import dev.chiksmedina.solar.linear.foodkitchen.TeaCup
import dev.chiksmedina.solar.linear.foodkitchen.Whisk
import dev.chiksmedina.solar.linear.foodkitchen.Wineglass
import dev.chiksmedina.solar.linear.foodkitchen.WineglassTriangle
import kotlin.collections.List as KtList

object FoodKitchenGroup

val LinearSolar.FoodKitchen: FoodKitchenGroup
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
