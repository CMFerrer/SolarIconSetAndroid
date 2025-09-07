package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
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
import kotlin.collections.List as KtList

object SearchGroup

val BoldSolar.Search: SearchGroup
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
