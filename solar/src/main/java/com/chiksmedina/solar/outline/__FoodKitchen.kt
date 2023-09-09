package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
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
import kotlin.collections.List as ____KtList

public object FoodKitchenGroup

public val OutlineGroup.FoodKitchen: FoodKitchenGroup
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
