package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.naturetravel.Bonfire
import com.chiksmedina.solar.lineduotone.naturetravel.Fire
import com.chiksmedina.solar.lineduotone.naturetravel.FireMinimalistic
import com.chiksmedina.solar.lineduotone.naturetravel.FireSquare
import com.chiksmedina.solar.lineduotone.naturetravel.Flame
import com.chiksmedina.solar.lineduotone.naturetravel.Leaf
import com.chiksmedina.solar.lineduotone.naturetravel.Suitcase
import com.chiksmedina.solar.lineduotone.naturetravel.SuitcaseLines
import com.chiksmedina.solar.lineduotone.naturetravel.SuitcaseTag
import kotlin.collections.List as ____KtList

public object NatureTravelGroup

public val LineduotoneGroup.NatureTravel: NatureTravelGroup
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
