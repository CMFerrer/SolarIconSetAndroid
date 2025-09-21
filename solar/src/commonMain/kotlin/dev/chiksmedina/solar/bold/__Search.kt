package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.search.Magnifer
import dev.chiksmedina.solar.bold.search.MagniferBug
import dev.chiksmedina.solar.bold.search.MagniferZoomIn
import dev.chiksmedina.solar.bold.search.MagniferZoomOut
import dev.chiksmedina.solar.bold.search.MinimalisticMagnifer
import dev.chiksmedina.solar.bold.search.MinimalisticMagniferBug
import dev.chiksmedina.solar.bold.search.MinimalisticMagniferZoomIn
import dev.chiksmedina.solar.bold.search.MinimalisticMagniferZoomOut
import dev.chiksmedina.solar.bold.search.RoundedMagnifer
import dev.chiksmedina.solar.bold.search.RoundedMagniferBug
import dev.chiksmedina.solar.bold.search.RoundedMagniferZoomIn
import dev.chiksmedina.solar.bold.search.RoundedMagniferZoomOut
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
