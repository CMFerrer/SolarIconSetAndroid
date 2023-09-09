package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.foodkitchen.Bottle
import com.chiksmedina.solar.bold.foodkitchen.ChefHat
import com.chiksmedina.solar.bold.foodkitchen.ChefHatHeart
import com.chiksmedina.solar.bold.foodkitchen.ChefHatMinimalistic
import com.chiksmedina.solar.bold.foodkitchen.Corkscrew
import com.chiksmedina.solar.bold.foodkitchen.Cup
import com.chiksmedina.solar.bold.foodkitchen.CupHot
import com.chiksmedina.solar.bold.foodkitchen.CupPaper
import com.chiksmedina.solar.bold.foodkitchen.Donut
import com.chiksmedina.solar.bold.foodkitchen.DonutBitten
import com.chiksmedina.solar.bold.foodkitchen.Ladle
import com.chiksmedina.solar.bold.foodkitchen.OvenMitts
import com.chiksmedina.solar.bold.foodkitchen.OvenMittsMinimalistic
import com.chiksmedina.solar.bold.foodkitchen.RollingPin
import com.chiksmedina.solar.bold.foodkitchen.TeaCup
import com.chiksmedina.solar.bold.foodkitchen.Whisk
import com.chiksmedina.solar.bold.foodkitchen.Wineglass
import com.chiksmedina.solar.bold.foodkitchen.WineglassTriangle
import kotlin.collections.List as ____KtList

public object FoodKitchenGroup

public val BoldGroup.FoodKitchen: FoodKitchenGroup
  get() = FoodKitchenGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val FoodKitchenGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bottle, ChefHat, ChefHatHeart, ChefHatMinimalistic, Corkscrew, Cup, CupHot,
        CupPaper, Donut, DonutBitten, Ladle, OvenMitts, OvenMittsMinimalistic, RollingPin, TeaCup,
        Whisk, Wineglass, WineglassTriangle)
    return __AllIcons!!
  }
