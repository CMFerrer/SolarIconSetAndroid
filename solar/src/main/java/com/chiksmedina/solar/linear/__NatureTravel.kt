package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.naturetravel.Bonfire
import com.chiksmedina.solar.linear.naturetravel.Fire
import com.chiksmedina.solar.linear.naturetravel.FireMinimalistic
import com.chiksmedina.solar.linear.naturetravel.FireSquare
import com.chiksmedina.solar.linear.naturetravel.Flame
import com.chiksmedina.solar.linear.naturetravel.Leaf
import com.chiksmedina.solar.linear.naturetravel.Suitcase
import com.chiksmedina.solar.linear.naturetravel.SuitcaseLines
import com.chiksmedina.solar.linear.naturetravel.SuitcaseTag
import kotlin.collections.List as KtList

object NatureTravelGroup

val LinearSolar.NatureTravel: NatureTravelGroup
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
