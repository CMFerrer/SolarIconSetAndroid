package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.naturetravel.Bonfire
import dev.chiksmedina.solar.outline.naturetravel.Fire
import dev.chiksmedina.solar.outline.naturetravel.FireMinimalistic
import dev.chiksmedina.solar.outline.naturetravel.FireSquare
import dev.chiksmedina.solar.outline.naturetravel.Flame
import dev.chiksmedina.solar.outline.naturetravel.Leaf
import dev.chiksmedina.solar.outline.naturetravel.Suitcase
import dev.chiksmedina.solar.outline.naturetravel.SuitcaseLines
import dev.chiksmedina.solar.outline.naturetravel.SuitcaseTag
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
