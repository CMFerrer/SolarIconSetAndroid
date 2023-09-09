package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.naturetravel.Bonfire
import com.chiksmedina.solar.outline.naturetravel.Fire
import com.chiksmedina.solar.outline.naturetravel.FireMinimalistic
import com.chiksmedina.solar.outline.naturetravel.FireSquare
import com.chiksmedina.solar.outline.naturetravel.Flame
import com.chiksmedina.solar.outline.naturetravel.Leaf
import com.chiksmedina.solar.outline.naturetravel.Suitcase
import com.chiksmedina.solar.outline.naturetravel.SuitcaseLines
import com.chiksmedina.solar.outline.naturetravel.SuitcaseTag
import kotlin.collections.List as ____KtList

public object NatureTravelGroup

public val OutlineGroup.NatureTravel: NatureTravelGroup
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
