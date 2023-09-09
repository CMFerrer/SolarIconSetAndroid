package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.naturetravel.Bonfire
import com.chiksmedina.solar.boldduotone.naturetravel.Fire
import com.chiksmedina.solar.boldduotone.naturetravel.FireMinimalistic
import com.chiksmedina.solar.boldduotone.naturetravel.FireSquare
import com.chiksmedina.solar.boldduotone.naturetravel.Flame
import com.chiksmedina.solar.boldduotone.naturetravel.Leaf
import com.chiksmedina.solar.boldduotone.naturetravel.Suitcase
import com.chiksmedina.solar.boldduotone.naturetravel.SuitcaseLines
import com.chiksmedina.solar.boldduotone.naturetravel.SuitcaseTag
import kotlin.collections.List as ____KtList

public object NatureTravelGroup

public val BoldduotoneGroup.NatureTravel: NatureTravelGroup
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
