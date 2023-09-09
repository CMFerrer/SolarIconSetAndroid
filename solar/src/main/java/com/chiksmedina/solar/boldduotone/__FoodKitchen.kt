package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
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
import kotlin.collections.List as ____KtList

public object FoodKitchenGroup

public val BoldduotoneGroup.FoodKitchen: FoodKitchenGroup
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
