package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.naturetravel.Bonfire
import com.chiksmedina.solar.bold.naturetravel.Fire
import com.chiksmedina.solar.bold.naturetravel.FireMinimalistic
import com.chiksmedina.solar.bold.naturetravel.FireSquare
import com.chiksmedina.solar.bold.naturetravel.Flame
import com.chiksmedina.solar.bold.naturetravel.Leaf
import com.chiksmedina.solar.bold.naturetravel.Suitcase
import com.chiksmedina.solar.bold.naturetravel.SuitcaseLines
import com.chiksmedina.solar.bold.naturetravel.SuitcaseTag
import kotlin.collections.List as KtList

object NatureTravelGroup

val BoldSolar.NatureTravel: NatureTravelGroup
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
