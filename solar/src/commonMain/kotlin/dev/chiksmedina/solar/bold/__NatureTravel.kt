package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.naturetravel.Bonfire
import dev.chiksmedina.solar.bold.naturetravel.Fire
import dev.chiksmedina.solar.bold.naturetravel.FireMinimalistic
import dev.chiksmedina.solar.bold.naturetravel.FireSquare
import dev.chiksmedina.solar.bold.naturetravel.Flame
import dev.chiksmedina.solar.bold.naturetravel.Leaf
import dev.chiksmedina.solar.bold.naturetravel.Suitcase
import dev.chiksmedina.solar.bold.naturetravel.SuitcaseLines
import dev.chiksmedina.solar.bold.naturetravel.SuitcaseTag
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
