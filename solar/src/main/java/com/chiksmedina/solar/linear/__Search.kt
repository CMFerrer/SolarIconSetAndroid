package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.search.Magnifer
import com.chiksmedina.solar.linear.search.MagniferBug
import com.chiksmedina.solar.linear.search.MagniferZoomIn
import com.chiksmedina.solar.linear.search.MagniferZoomOut
import com.chiksmedina.solar.linear.search.MinimalisticMagnifer
import com.chiksmedina.solar.linear.search.MinimalisticMagniferBug
import com.chiksmedina.solar.linear.search.MinimalisticMagniferZoomIn
import com.chiksmedina.solar.linear.search.MinimalisticMagniferZoomOut
import com.chiksmedina.solar.linear.search.RoundedMagnifer
import com.chiksmedina.solar.linear.search.RoundedMagniferBug
import com.chiksmedina.solar.linear.search.RoundedMagniferZoomIn
import com.chiksmedina.solar.linear.search.RoundedMagniferZoomOut
import kotlin.collections.List as ____KtList

public object SearchGroup

public val LinearGroup.Search: SearchGroup
  get() = SearchGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SearchGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Magnifer, MagniferBug, MagniferZoomIn, MagniferZoomOut, MinimalisticMagnifer,
        MinimalisticMagniferBug, MinimalisticMagniferZoomIn, MinimalisticMagniferZoomOut,
        RoundedMagnifer, RoundedMagniferBug, RoundedMagniferZoomIn, RoundedMagniferZoomOut)
    return __AllIcons!!
  }
