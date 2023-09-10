package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.naturetravel.Bonfire
import com.chiksmedina.solar.outline.naturetravel.Fire
import com.chiksmedina.solar.outline.naturetravel.FireMinimalistic
import com.chiksmedina.solar.outline.naturetravel.FireSquare
import com.chiksmedina.solar.outline.naturetravel.Flame
import com.chiksmedina.solar.outline.naturetravel.Leaf
import com.chiksmedina.solar.outline.naturetravel.Suitcase
import com.chiksmedina.solar.outline.naturetravel.SuitcaseLines
import com.chiksmedina.solar.outline.naturetravel.SuitcaseTag
import kotlin.collections.List as KtList

object NatureTravelGroup

val OutlineSolar.NatureTravel: NatureTravelGroup
    get() = NatureTravelGroup

private var _AllIcons: KtList<ImageVector>? = null

val NatureTravelGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bonfire, Fire, FireMinimalistic, FireSquare, Flame, Leaf, Suitcase,
            SuitcaseLines, SuitcaseTag
        )
        return _AllIcons!!
    }
