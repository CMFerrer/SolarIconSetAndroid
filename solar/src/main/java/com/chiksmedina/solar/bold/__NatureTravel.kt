package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.naturetravel.Bonfire
import com.chiksmedina.solar.bold.naturetravel.Fire
import com.chiksmedina.solar.bold.naturetravel.FireMinimalistic
import com.chiksmedina.solar.bold.naturetravel.FireSquare
import com.chiksmedina.solar.bold.naturetravel.Flame
import com.chiksmedina.solar.bold.naturetravel.Leaf
import com.chiksmedina.solar.bold.naturetravel.Suitcase
import com.chiksmedina.solar.bold.naturetravel.SuitcaseLines
import com.chiksmedina.solar.bold.naturetravel.SuitcaseTag
import kotlin.collections.List as ____KtList

public object NatureTravelGroup

public val BoldGroup.NatureTravel: NatureTravelGroup
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
