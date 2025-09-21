package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.search.Magnifer
import dev.chiksmedina.solar.broken.search.MagniferBug
import dev.chiksmedina.solar.broken.search.MagniferZoomIn
import dev.chiksmedina.solar.broken.search.MagniferZoomOut
import dev.chiksmedina.solar.broken.search.MinimalisticMagnifer
import dev.chiksmedina.solar.broken.search.MinimalisticMagniferBug
import dev.chiksmedina.solar.broken.search.MinimalisticMagniferZoomIn
import dev.chiksmedina.solar.broken.search.MinimalisticMagniferZoomOut
import dev.chiksmedina.solar.broken.search.RoundedMagnifer
import dev.chiksmedina.solar.broken.search.RoundedMagniferBug
import dev.chiksmedina.solar.broken.search.RoundedMagniferZoomIn
import dev.chiksmedina.solar.broken.search.RoundedMagniferZoomOut
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
