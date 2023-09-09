package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.search.Magnifer
import com.chiksmedina.solar.bold.search.MagniferBug
import com.chiksmedina.solar.bold.search.MagniferZoomIn
import com.chiksmedina.solar.bold.search.MagniferZoomOut
import com.chiksmedina.solar.bold.search.MinimalisticMagnifer
import com.chiksmedina.solar.bold.search.MinimalisticMagniferBug
import com.chiksmedina.solar.bold.search.MinimalisticMagniferZoomIn
import com.chiksmedina.solar.bold.search.MinimalisticMagniferZoomOut
import com.chiksmedina.solar.bold.search.RoundedMagnifer
import com.chiksmedina.solar.bold.search.RoundedMagniferBug
import com.chiksmedina.solar.bold.search.RoundedMagniferZoomIn
import com.chiksmedina.solar.bold.search.RoundedMagniferZoomOut
import kotlin.collections.List as ____KtList

public object SearchGroup

public val BoldGroup.Search: SearchGroup
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
