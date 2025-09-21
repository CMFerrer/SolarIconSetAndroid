package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.naturetravel.Bonfire
import dev.chiksmedina.solar.boldduotone.naturetravel.Fire
import dev.chiksmedina.solar.boldduotone.naturetravel.FireMinimalistic
import dev.chiksmedina.solar.boldduotone.naturetravel.FireSquare
import dev.chiksmedina.solar.boldduotone.naturetravel.Flame
import dev.chiksmedina.solar.boldduotone.naturetravel.Leaf
import dev.chiksmedina.solar.boldduotone.naturetravel.Suitcase
import dev.chiksmedina.solar.boldduotone.naturetravel.SuitcaseLines
import dev.chiksmedina.solar.boldduotone.naturetravel.SuitcaseTag
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
