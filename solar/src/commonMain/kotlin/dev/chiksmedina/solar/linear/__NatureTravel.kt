package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.naturetravel.Bonfire
import dev.chiksmedina.solar.linear.naturetravel.Fire
import dev.chiksmedina.solar.linear.naturetravel.FireMinimalistic
import dev.chiksmedina.solar.linear.naturetravel.FireSquare
import dev.chiksmedina.solar.linear.naturetravel.Flame
import dev.chiksmedina.solar.linear.naturetravel.Leaf
import dev.chiksmedina.solar.linear.naturetravel.Suitcase
import dev.chiksmedina.solar.linear.naturetravel.SuitcaseLines
import dev.chiksmedina.solar.linear.naturetravel.SuitcaseTag
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
