package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.search.Magnifer
import dev.chiksmedina.solar.linear.search.MagniferBug
import dev.chiksmedina.solar.linear.search.MagniferZoomIn
import dev.chiksmedina.solar.linear.search.MagniferZoomOut
import dev.chiksmedina.solar.linear.search.MinimalisticMagnifer
import dev.chiksmedina.solar.linear.search.MinimalisticMagniferBug
import dev.chiksmedina.solar.linear.search.MinimalisticMagniferZoomIn
import dev.chiksmedina.solar.linear.search.MinimalisticMagniferZoomOut
import dev.chiksmedina.solar.linear.search.RoundedMagnifer
import dev.chiksmedina.solar.linear.search.RoundedMagniferBug
import dev.chiksmedina.solar.linear.search.RoundedMagniferZoomIn
import dev.chiksmedina.solar.linear.search.RoundedMagniferZoomOut
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
