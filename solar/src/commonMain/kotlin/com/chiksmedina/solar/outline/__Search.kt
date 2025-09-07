package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
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
import kotlin.collections.List as KtList

object SearchGroup

val OutlineSolar.Search: SearchGroup
    get() = SearchGroup

private var _AllIcons: KtList<ImageVector>? = null

val SearchGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Magnifer, MagniferBug, MagniferZoomIn, MagniferZoomOut, MinimalisticMagnifer,
            MinimalisticMagniferBug, MinimalisticMagniferZoomIn, MinimalisticMagniferZoomOut,
            RoundedMagnifer, RoundedMagniferBug, RoundedMagniferZoomIn, RoundedMagniferZoomOut
        )
        return _AllIcons!!
    }
