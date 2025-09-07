package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.foodkitchen.Bottle
import com.chiksmedina.solar.linear.foodkitchen.ChefHat
import com.chiksmedina.solar.linear.foodkitchen.ChefHatHeart
import com.chiksmedina.solar.linear.foodkitchen.ChefHatMinimalistic
import com.chiksmedina.solar.linear.foodkitchen.Corkscrew
import com.chiksmedina.solar.linear.foodkitchen.Cup
import com.chiksmedina.solar.linear.foodkitchen.CupHot
import com.chiksmedina.solar.linear.foodkitchen.CupPaper
import com.chiksmedina.solar.linear.foodkitchen.Donut
import com.chiksmedina.solar.linear.foodkitchen.DonutBitten
import com.chiksmedina.solar.linear.foodkitchen.Ladle
import com.chiksmedina.solar.linear.foodkitchen.OvenMitts
import com.chiksmedina.solar.linear.foodkitchen.OvenMittsMinimalistic
import com.chiksmedina.solar.linear.foodkitchen.RollingPin
import com.chiksmedina.solar.linear.foodkitchen.TeaCup
import com.chiksmedina.solar.linear.foodkitchen.Whisk
import com.chiksmedina.solar.linear.foodkitchen.Wineglass
import com.chiksmedina.solar.linear.foodkitchen.WineglassTriangle
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
