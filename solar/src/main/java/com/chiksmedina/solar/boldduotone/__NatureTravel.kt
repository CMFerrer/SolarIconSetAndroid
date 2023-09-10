package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.naturetravel.Bonfire
import com.chiksmedina.solar.boldduotone.naturetravel.Fire
import com.chiksmedina.solar.boldduotone.naturetravel.FireMinimalistic
import com.chiksmedina.solar.boldduotone.naturetravel.FireSquare
import com.chiksmedina.solar.boldduotone.naturetravel.Flame
import com.chiksmedina.solar.boldduotone.naturetravel.Leaf
import com.chiksmedina.solar.boldduotone.naturetravel.Suitcase
import com.chiksmedina.solar.boldduotone.naturetravel.SuitcaseLines
import com.chiksmedina.solar.boldduotone.naturetravel.SuitcaseTag
import kotlin.collections.List as KtList

object NatureTravelGroup

val BoldDuotoneSolar.NatureTravel: NatureTravelGroup
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
