package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.naturetravel.Bonfire
import com.chiksmedina.solar.broken.naturetravel.Fire
import com.chiksmedina.solar.broken.naturetravel.FireMinimalistic
import com.chiksmedina.solar.broken.naturetravel.FireSquare
import com.chiksmedina.solar.broken.naturetravel.Flame
import com.chiksmedina.solar.broken.naturetravel.Leaf
import com.chiksmedina.solar.broken.naturetravel.Suitcase
import com.chiksmedina.solar.broken.naturetravel.SuitcaseLines
import com.chiksmedina.solar.broken.naturetravel.SuitcaseTag
import kotlin.collections.List as ____KtList

public object NatureTravelGroup

public val BrokenGroup.NatureTravel: NatureTravelGroup
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
