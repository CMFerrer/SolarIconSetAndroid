package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
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
import kotlin.collections.List as ____KtList

public object FoodKitchenGroup

public val LinearGroup.FoodKitchen: FoodKitchenGroup
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
