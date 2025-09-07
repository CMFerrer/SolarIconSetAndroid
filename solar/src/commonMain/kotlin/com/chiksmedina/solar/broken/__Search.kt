package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
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
import kotlin.collections.List as KtList

object SearchGroup

val BrokenSolar.Search: SearchGroup
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
