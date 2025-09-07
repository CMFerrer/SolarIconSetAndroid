package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.foodkitchen.Bottle
import com.chiksmedina.solar.broken.foodkitchen.ChefHat
import com.chiksmedina.solar.broken.foodkitchen.ChefHatHeart
import com.chiksmedina.solar.broken.foodkitchen.ChefHatMinimalistic
import com.chiksmedina.solar.broken.foodkitchen.Corkscrew
import com.chiksmedina.solar.broken.foodkitchen.Cup
import com.chiksmedina.solar.broken.foodkitchen.CupHot
import com.chiksmedina.solar.broken.foodkitchen.CupPaper
import com.chiksmedina.solar.broken.foodkitchen.Donut
import com.chiksmedina.solar.broken.foodkitchen.DonutBitten
import com.chiksmedina.solar.broken.foodkitchen.Ladle
import com.chiksmedina.solar.broken.foodkitchen.OvenMitts
import com.chiksmedina.solar.broken.foodkitchen.OvenMittsMinimalistic
import com.chiksmedina.solar.broken.foodkitchen.RollingPin
import com.chiksmedina.solar.broken.foodkitchen.TeaCup
import com.chiksmedina.solar.broken.foodkitchen.Whisk
import com.chiksmedina.solar.broken.foodkitchen.Wineglass
import com.chiksmedina.solar.broken.foodkitchen.WineglassTriangle
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
