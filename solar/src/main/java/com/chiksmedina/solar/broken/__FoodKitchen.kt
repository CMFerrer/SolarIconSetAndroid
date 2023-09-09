package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
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
import kotlin.collections.List as ____KtList

public object FoodKitchenGroup

public val BrokenGroup.FoodKitchen: FoodKitchenGroup
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
