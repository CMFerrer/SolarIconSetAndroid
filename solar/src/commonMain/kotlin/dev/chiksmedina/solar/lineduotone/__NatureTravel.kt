package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.naturetravel.Bonfire
import dev.chiksmedina.solar.lineduotone.naturetravel.Fire
import dev.chiksmedina.solar.lineduotone.naturetravel.FireMinimalistic
import dev.chiksmedina.solar.lineduotone.naturetravel.FireSquare
import dev.chiksmedina.solar.lineduotone.naturetravel.Flame
import dev.chiksmedina.solar.lineduotone.naturetravel.Leaf
import dev.chiksmedina.solar.lineduotone.naturetravel.Suitcase
import dev.chiksmedina.solar.lineduotone.naturetravel.SuitcaseLines
import dev.chiksmedina.solar.lineduotone.naturetravel.SuitcaseTag
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
