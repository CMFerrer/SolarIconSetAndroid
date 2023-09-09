package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.search.Magnifer
import com.chiksmedina.solar.outline.search.MagniferBug
import com.chiksmedina.solar.outline.search.MagniferZoomIn
import com.chiksmedina.solar.outline.search.MagniferZoomOut
import com.chiksmedina.solar.outline.search.MinimalisticMagnifer
import com.chiksmedina.solar.outline.search.MinimalisticMagniferBug
import com.chiksmedina.solar.outline.search.MinimalisticMagniferZoomIn
import com.chiksmedina.solar.outline.search.MinimalisticMagniferZoomOut
import com.chiksmedina.solar.outline.search.RoundedMagnifer
import com.chiksmedina.solar.outline.search.RoundedMagniferBug
import com.chiksmedina.solar.outline.search.RoundedMagniferZoomIn
import com.chiksmedina.solar.outline.search.RoundedMagniferZoomOut
import kotlin.collections.List as ____KtList

public object SearchGroup

public val OutlineGroup.Search: SearchGroup
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
