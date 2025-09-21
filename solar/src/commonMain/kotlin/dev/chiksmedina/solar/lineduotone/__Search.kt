package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.search.Magnifer
import dev.chiksmedina.solar.lineduotone.search.MagniferBug
import dev.chiksmedina.solar.lineduotone.search.MagniferZoomIn
import dev.chiksmedina.solar.lineduotone.search.MagniferZoomOut
import dev.chiksmedina.solar.lineduotone.search.MinimalisticMagnifer
import dev.chiksmedina.solar.lineduotone.search.MinimalisticMagniferBug
import dev.chiksmedina.solar.lineduotone.search.MinimalisticMagniferZoomIn
import dev.chiksmedina.solar.lineduotone.search.MinimalisticMagniferZoomOut
import dev.chiksmedina.solar.lineduotone.search.RoundedMagnifer
import dev.chiksmedina.solar.lineduotone.search.RoundedMagniferBug
import dev.chiksmedina.solar.lineduotone.search.RoundedMagniferZoomIn
import dev.chiksmedina.solar.lineduotone.search.RoundedMagniferZoomOut
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
