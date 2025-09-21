package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.search.Magnifer
import dev.chiksmedina.solar.boldduotone.search.MagniferBug
import dev.chiksmedina.solar.boldduotone.search.MagniferZoomIn
import dev.chiksmedina.solar.boldduotone.search.MagniferZoomOut
import dev.chiksmedina.solar.boldduotone.search.MinimalisticMagnifer
import dev.chiksmedina.solar.boldduotone.search.MinimalisticMagniferBug
import dev.chiksmedina.solar.boldduotone.search.MinimalisticMagniferZoomIn
import dev.chiksmedina.solar.boldduotone.search.MinimalisticMagniferZoomOut
import dev.chiksmedina.solar.boldduotone.search.RoundedMagnifer
import dev.chiksmedina.solar.boldduotone.search.RoundedMagniferBug
import dev.chiksmedina.solar.boldduotone.search.RoundedMagniferZoomIn
import dev.chiksmedina.solar.boldduotone.search.RoundedMagniferZoomOut
import kotlin.collections.List as KtList

object SearchGroup

val BoldDuotoneSolar.Search: SearchGroup
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
