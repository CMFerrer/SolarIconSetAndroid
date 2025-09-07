package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
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
import kotlin.collections.List as KtList

object SearchGroup

val LinearSolar.Search: SearchGroup
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
