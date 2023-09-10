package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.naturetravel.Bonfire
import com.chiksmedina.solar.lineduotone.naturetravel.Fire
import com.chiksmedina.solar.lineduotone.naturetravel.FireMinimalistic
import com.chiksmedina.solar.lineduotone.naturetravel.FireSquare
import com.chiksmedina.solar.lineduotone.naturetravel.Flame
import com.chiksmedina.solar.lineduotone.naturetravel.Leaf
import com.chiksmedina.solar.lineduotone.naturetravel.Suitcase
import com.chiksmedina.solar.lineduotone.naturetravel.SuitcaseLines
import com.chiksmedina.solar.lineduotone.naturetravel.SuitcaseTag
import kotlin.collections.List as KtList

object NatureTravelGroup

val LineDuotoneSolar.NatureTravel: NatureTravelGroup
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
