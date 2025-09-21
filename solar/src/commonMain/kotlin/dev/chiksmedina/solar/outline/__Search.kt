package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.search.Magnifer
import dev.chiksmedina.solar.outline.search.MagniferBug
import dev.chiksmedina.solar.outline.search.MagniferZoomIn
import dev.chiksmedina.solar.outline.search.MagniferZoomOut
import dev.chiksmedina.solar.outline.search.MinimalisticMagnifer
import dev.chiksmedina.solar.outline.search.MinimalisticMagniferBug
import dev.chiksmedina.solar.outline.search.MinimalisticMagniferZoomIn
import dev.chiksmedina.solar.outline.search.MinimalisticMagniferZoomOut
import dev.chiksmedina.solar.outline.search.RoundedMagnifer
import dev.chiksmedina.solar.outline.search.RoundedMagniferBug
import dev.chiksmedina.solar.outline.search.RoundedMagniferZoomIn
import dev.chiksmedina.solar.outline.search.RoundedMagniferZoomOut
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
