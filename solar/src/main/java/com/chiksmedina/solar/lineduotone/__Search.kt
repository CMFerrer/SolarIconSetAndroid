package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.search.Magnifer
import com.chiksmedina.solar.lineduotone.search.MagniferBug
import com.chiksmedina.solar.lineduotone.search.MagniferZoomIn
import com.chiksmedina.solar.lineduotone.search.MagniferZoomOut
import com.chiksmedina.solar.lineduotone.search.MinimalisticMagnifer
import com.chiksmedina.solar.lineduotone.search.MinimalisticMagniferBug
import com.chiksmedina.solar.lineduotone.search.MinimalisticMagniferZoomIn
import com.chiksmedina.solar.lineduotone.search.MinimalisticMagniferZoomOut
import com.chiksmedina.solar.lineduotone.search.RoundedMagnifer
import com.chiksmedina.solar.lineduotone.search.RoundedMagniferBug
import com.chiksmedina.solar.lineduotone.search.RoundedMagniferZoomIn
import com.chiksmedina.solar.lineduotone.search.RoundedMagniferZoomOut
import kotlin.collections.List as KtList

object SearchGroup

val LineDuotoneSolar.Search: SearchGroup
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
