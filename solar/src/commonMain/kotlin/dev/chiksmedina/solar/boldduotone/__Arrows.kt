package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.arrows.AltArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.AltArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.AltArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.AltArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.ArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.ArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.ArrowLeftDown
import dev.chiksmedina.solar.boldduotone.arrows.ArrowLeftUp
import dev.chiksmedina.solar.boldduotone.arrows.ArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.ArrowRightDown
import dev.chiksmedina.solar.boldduotone.arrows.ArrowRightUp
import dev.chiksmedina.solar.boldduotone.arrows.ArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.Refresh
import dev.chiksmedina.solar.boldduotone.arrows.RefreshCircle
import dev.chiksmedina.solar.boldduotone.arrows.RefreshSquare
import dev.chiksmedina.solar.boldduotone.arrows.Restart
import dev.chiksmedina.solar.boldduotone.arrows.RestartCircle
import dev.chiksmedina.solar.boldduotone.arrows.RestartSquare
import dev.chiksmedina.solar.boldduotone.arrows.RoundAltArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.RoundAltArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.RoundAltArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.RoundAltArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowLeftDown
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowLeftUp
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowRightDown
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowRightUp
import dev.chiksmedina.solar.boldduotone.arrows.RoundArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.RoundSortHorizontal
import dev.chiksmedina.solar.boldduotone.arrows.RoundSortVertical
import dev.chiksmedina.solar.boldduotone.arrows.RoundTransferDiagonal
import dev.chiksmedina.solar.boldduotone.arrows.RoundTransferHorizontal
import dev.chiksmedina.solar.boldduotone.arrows.RoundTransferVertical
import dev.chiksmedina.solar.boldduotone.arrows.SortHorizontal
import dev.chiksmedina.solar.boldduotone.arrows.SortVertical
import dev.chiksmedina.solar.boldduotone.arrows.SquareAltArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.SquareAltArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.SquareAltArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.SquareAltArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowLeftDown
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowLeftUp
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowRightDown
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowRightUp
import dev.chiksmedina.solar.boldduotone.arrows.SquareArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowDown
import dev.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowLeft
import dev.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowRight
import dev.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowUp
import dev.chiksmedina.solar.boldduotone.arrows.SquareSortHorizontal
import dev.chiksmedina.solar.boldduotone.arrows.SquareSortVertical
import dev.chiksmedina.solar.boldduotone.arrows.SquareTransferHorizontal
import dev.chiksmedina.solar.boldduotone.arrows.SquareTransferVertical
import dev.chiksmedina.solar.boldduotone.arrows.TransferHorizontal
import dev.chiksmedina.solar.boldduotone.arrows.TransferVertical
import kotlin.collections.List as KtList

object ArrowsGroup

val BoldDuotoneSolar.Arrows: ArrowsGroup
    get() = ArrowsGroup

private var _AllIcons: KtList<ImageVector>? = null

val ArrowsGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            AltArrowDown,
            AltArrowLeft,
            AltArrowRight,
            AltArrowUp,
            ArrowDown,
            ArrowLeft,
            ArrowLeftDown,
            ArrowLeftUp,
            ArrowRight,
            ArrowRightDown,
            ArrowRightUp,
            ArrowUp,
            DoubleAltArrowDown,
            DoubleAltArrowLeft,
            DoubleAltArrowRight,
            DoubleAltArrowUp,
            Refresh,
            RefreshCircle,
            RefreshSquare,
            Restart,
            RestartCircle,
            RestartSquare,
            RoundAltArrowDown,
            RoundAltArrowLeft,
            RoundAltArrowRight,
            RoundAltArrowUp,
            RoundArrowDown,
            RoundArrowLeft,
            RoundArrowLeftDown,
            RoundArrowLeftUp,
            RoundArrowRight,
            RoundArrowRightDown,
            RoundArrowRightUp,
            RoundArrowUp,
            RoundDoubleAltArrowDown,
            RoundDoubleAltArrowLeft,
            RoundDoubleAltArrowRight,
            RoundDoubleAltArrowUp,
            RoundSortHorizontal,
            RoundSortVertical,
            RoundTransferDiagonal,
            RoundTransferHorizontal,
            RoundTransferVertical,
            SortHorizontal,
            SortVertical,
            SquareAltArrowLeft,
            SquareAltArrowRight,
            SquareAltArrowUp,
            SquareAltArrowDown,
            SquareArrowDown,
            SquareArrowLeft,
            SquareArrowLeftDown,
            SquareArrowLeftUp,
            SquareArrowRight,
            SquareArrowRightDown,
            SquareArrowRightUp,
            SquareArrowUp,
            SquareDoubleAltArrowDown,
            SquareDoubleAltArrowLeft,
            SquareDoubleAltArrowUp,
            SquareDoubleAltArrowRight,
            SquareSortHorizontal,
            SquareSortVertical,
            SquareTransferHorizontal,
            SquareTransferVertical,
            TransferHorizontal,
            TransferVertical
        )
        return _AllIcons!!
    }
