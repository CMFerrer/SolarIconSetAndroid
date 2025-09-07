package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.foodkitchen.Bottle
import com.chiksmedina.solar.boldduotone.foodkitchen.ChefHat
import com.chiksmedina.solar.boldduotone.foodkitchen.ChefHatHeart
import com.chiksmedina.solar.boldduotone.foodkitchen.ChefHatMinimalistic
import com.chiksmedina.solar.boldduotone.foodkitchen.Corkscrew
import com.chiksmedina.solar.boldduotone.foodkitchen.Cup
import com.chiksmedina.solar.boldduotone.foodkitchen.CupHot
import com.chiksmedina.solar.boldduotone.foodkitchen.CupPaper
import com.chiksmedina.solar.boldduotone.foodkitchen.Donut
import com.chiksmedina.solar.boldduotone.foodkitchen.DonutBitten
import com.chiksmedina.solar.boldduotone.foodkitchen.Ladle
import com.chiksmedina.solar.boldduotone.foodkitchen.OvenMitts
import com.chiksmedina.solar.boldduotone.foodkitchen.OvenMittsMinimalistic
import com.chiksmedina.solar.boldduotone.foodkitchen.RollingPin
import com.chiksmedina.solar.boldduotone.foodkitchen.TeaCup
import com.chiksmedina.solar.boldduotone.foodkitchen.Whisk
import com.chiksmedina.solar.boldduotone.foodkitchen.Wineglass
import com.chiksmedina.solar.boldduotone.foodkitchen.WineglassTriangle
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
