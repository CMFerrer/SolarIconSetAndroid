package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.foodkitchen.Bottle
import com.chiksmedina.solar.outline.foodkitchen.ChefHat
import com.chiksmedina.solar.outline.foodkitchen.ChefHatHeart
import com.chiksmedina.solar.outline.foodkitchen.ChefHatMinimalistic
import com.chiksmedina.solar.outline.foodkitchen.Corkscrew
import com.chiksmedina.solar.outline.foodkitchen.Cup
import com.chiksmedina.solar.outline.foodkitchen.CupHot
import com.chiksmedina.solar.outline.foodkitchen.CupPaper
import com.chiksmedina.solar.outline.foodkitchen.Donut
import com.chiksmedina.solar.outline.foodkitchen.DonutBitten
import com.chiksmedina.solar.outline.foodkitchen.Ladle
import com.chiksmedina.solar.outline.foodkitchen.OvenMitts
import com.chiksmedina.solar.outline.foodkitchen.OvenMittsMinimalistic
import com.chiksmedina.solar.outline.foodkitchen.RollingPin
import com.chiksmedina.solar.outline.foodkitchen.TeaCup
import com.chiksmedina.solar.outline.foodkitchen.Whisk
import com.chiksmedina.solar.outline.foodkitchen.Wineglass
import com.chiksmedina.solar.outline.foodkitchen.WineglassTriangle
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
