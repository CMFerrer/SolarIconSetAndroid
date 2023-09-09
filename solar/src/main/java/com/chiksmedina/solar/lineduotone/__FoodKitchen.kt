package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
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
import kotlin.collections.List as ____KtList

public object FoodKitchenGroup

public val LineduotoneGroup.FoodKitchen: FoodKitchenGroup
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
