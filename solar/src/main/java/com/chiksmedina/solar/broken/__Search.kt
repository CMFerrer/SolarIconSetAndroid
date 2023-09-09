package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.search.Magnifer
import com.chiksmedina.solar.broken.search.MagniferBug
import com.chiksmedina.solar.broken.search.MagniferZoomIn
import com.chiksmedina.solar.broken.search.MagniferZoomOut
import com.chiksmedina.solar.broken.search.MinimalisticMagnifer
import com.chiksmedina.solar.broken.search.MinimalisticMagniferBug
import com.chiksmedina.solar.broken.search.MinimalisticMagniferZoomIn
import com.chiksmedina.solar.broken.search.MinimalisticMagniferZoomOut
import com.chiksmedina.solar.broken.search.RoundedMagnifer
import com.chiksmedina.solar.broken.search.RoundedMagniferBug
import com.chiksmedina.solar.broken.search.RoundedMagniferZoomIn
import com.chiksmedina.solar.broken.search.RoundedMagniferZoomOut
import kotlin.collections.List as ____KtList

public object SearchGroup

public val BrokenGroup.Search: SearchGroup
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
