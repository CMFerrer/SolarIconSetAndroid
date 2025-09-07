package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.foodkitchen.Bottle
import com.chiksmedina.solar.lineduotone.foodkitchen.ChefHat
import com.chiksmedina.solar.lineduotone.foodkitchen.ChefHatHeart
import com.chiksmedina.solar.lineduotone.foodkitchen.ChefHatMinimalistic
import com.chiksmedina.solar.lineduotone.foodkitchen.Corkscrew
import com.chiksmedina.solar.lineduotone.foodkitchen.Cup
import com.chiksmedina.solar.lineduotone.foodkitchen.CupHot
import com.chiksmedina.solar.lineduotone.foodkitchen.CupPaper
import com.chiksmedina.solar.lineduotone.foodkitchen.Donut
import com.chiksmedina.solar.lineduotone.foodkitchen.DonutBitten
import com.chiksmedina.solar.lineduotone.foodkitchen.Ladle
import com.chiksmedina.solar.lineduotone.foodkitchen.OvenMitts
import com.chiksmedina.solar.lineduotone.foodkitchen.OvenMittsMinimalistic
import com.chiksmedina.solar.lineduotone.foodkitchen.RollingPin
import com.chiksmedina.solar.lineduotone.foodkitchen.TeaCup
import com.chiksmedina.solar.lineduotone.foodkitchen.Whisk
import com.chiksmedina.solar.lineduotone.foodkitchen.Wineglass
import com.chiksmedina.solar.lineduotone.foodkitchen.WineglassTriangle
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
