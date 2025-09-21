package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.arrows.AltArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.AltArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.AltArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.AltArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.ArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.ArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.ArrowLeftDown
import dev.chiksmedina.solar.lineduotone.arrows.ArrowLeftUp
import dev.chiksmedina.solar.lineduotone.arrows.ArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.ArrowRightDown
import dev.chiksmedina.solar.lineduotone.arrows.ArrowRightUp
import dev.chiksmedina.solar.lineduotone.arrows.ArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.Refresh
import dev.chiksmedina.solar.lineduotone.arrows.RefreshCircle
import dev.chiksmedina.solar.lineduotone.arrows.RefreshSquare
import dev.chiksmedina.solar.lineduotone.arrows.Restart
import dev.chiksmedina.solar.lineduotone.arrows.RestartCircle
import dev.chiksmedina.solar.lineduotone.arrows.RestartSquare
import dev.chiksmedina.solar.lineduotone.arrows.RoundAltArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.RoundAltArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.RoundAltArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.RoundAltArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowLeftDown
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowLeftUp
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowRightDown
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowRightUp
import dev.chiksmedina.solar.lineduotone.arrows.RoundArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.RoundSortHorizontal
import dev.chiksmedina.solar.lineduotone.arrows.RoundSortVertical
import dev.chiksmedina.solar.lineduotone.arrows.RoundTransferDiagonal
import dev.chiksmedina.solar.lineduotone.arrows.RoundTransferHorizontal
import dev.chiksmedina.solar.lineduotone.arrows.RoundTransferVertical
import dev.chiksmedina.solar.lineduotone.arrows.SortHorizontal
import dev.chiksmedina.solar.lineduotone.arrows.SortVertical
import dev.chiksmedina.solar.lineduotone.arrows.SquareAltArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.SquareAltArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.SquareAltArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.SquareAltArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowLeftDown
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowLeftUp
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowRightDown
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowRightUp
import dev.chiksmedina.solar.lineduotone.arrows.SquareArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowDown
import dev.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowLeft
import dev.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowRight
import dev.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowUp
import dev.chiksmedina.solar.lineduotone.arrows.SquareSortHorizontal
import dev.chiksmedina.solar.lineduotone.arrows.SquareSortVertical
import dev.chiksmedina.solar.lineduotone.arrows.SquareTransferHorizontal
import dev.chiksmedina.solar.lineduotone.arrows.SquareTransferVertical
import dev.chiksmedina.solar.lineduotone.arrows.TransferHorizontal
import dev.chiksmedina.solar.lineduotone.arrows.TransferVertical
import kotlin.collections.List as KtList

object ArrowsGroup

val LineDuotoneSolar.Arrows: ArrowsGroup
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
