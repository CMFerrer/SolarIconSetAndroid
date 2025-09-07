package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.search.Magnifer
import com.chiksmedina.solar.boldduotone.search.MagniferBug
import com.chiksmedina.solar.boldduotone.search.MagniferZoomIn
import com.chiksmedina.solar.boldduotone.search.MagniferZoomOut
import com.chiksmedina.solar.boldduotone.search.MinimalisticMagnifer
import com.chiksmedina.solar.boldduotone.search.MinimalisticMagniferBug
import com.chiksmedina.solar.boldduotone.search.MinimalisticMagniferZoomIn
import com.chiksmedina.solar.boldduotone.search.MinimalisticMagniferZoomOut
import com.chiksmedina.solar.boldduotone.search.RoundedMagnifer
import com.chiksmedina.solar.boldduotone.search.RoundedMagniferBug
import com.chiksmedina.solar.boldduotone.search.RoundedMagniferZoomIn
import com.chiksmedina.solar.boldduotone.search.RoundedMagniferZoomOut
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
