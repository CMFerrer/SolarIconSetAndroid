package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.naturetravel.Bonfire
import com.chiksmedina.solar.linear.naturetravel.Fire
import com.chiksmedina.solar.linear.naturetravel.FireMinimalistic
import com.chiksmedina.solar.linear.naturetravel.FireSquare
import com.chiksmedina.solar.linear.naturetravel.Flame
import com.chiksmedina.solar.linear.naturetravel.Leaf
import com.chiksmedina.solar.linear.naturetravel.Suitcase
import com.chiksmedina.solar.linear.naturetravel.SuitcaseLines
import com.chiksmedina.solar.linear.naturetravel.SuitcaseTag
import kotlin.collections.List as ____KtList

public object NatureTravelGroup

public val LinearGroup.NatureTravel: NatureTravelGroup
  get() = NatureTravelGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NatureTravelGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bonfire, Fire, FireMinimalistic, FireSquare, Flame, Leaf, Suitcase,
        SuitcaseLines, SuitcaseTag)
    return __AllIcons!!
  }
