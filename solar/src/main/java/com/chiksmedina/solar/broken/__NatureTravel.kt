package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.naturetravel.Bonfire
import com.chiksmedina.solar.broken.naturetravel.Fire
import com.chiksmedina.solar.broken.naturetravel.FireMinimalistic
import com.chiksmedina.solar.broken.naturetravel.FireSquare
import com.chiksmedina.solar.broken.naturetravel.Flame
import com.chiksmedina.solar.broken.naturetravel.Leaf
import com.chiksmedina.solar.broken.naturetravel.Suitcase
import com.chiksmedina.solar.broken.naturetravel.SuitcaseLines
import com.chiksmedina.solar.broken.naturetravel.SuitcaseTag
import kotlin.collections.List as KtList

object NatureTravelGroup

val BrokenSolar.NatureTravel: NatureTravelGroup
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
