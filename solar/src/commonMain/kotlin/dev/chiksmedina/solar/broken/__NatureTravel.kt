package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.naturetravel.Bonfire
import dev.chiksmedina.solar.broken.naturetravel.Fire
import dev.chiksmedina.solar.broken.naturetravel.FireMinimalistic
import dev.chiksmedina.solar.broken.naturetravel.FireSquare
import dev.chiksmedina.solar.broken.naturetravel.Flame
import dev.chiksmedina.solar.broken.naturetravel.Leaf
import dev.chiksmedina.solar.broken.naturetravel.Suitcase
import dev.chiksmedina.solar.broken.naturetravel.SuitcaseLines
import dev.chiksmedina.solar.broken.naturetravel.SuitcaseTag
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
