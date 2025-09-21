package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.arrows.AltArrowDown
import dev.chiksmedina.solar.linear.arrows.AltArrowLeft
import dev.chiksmedina.solar.linear.arrows.AltArrowRight
import dev.chiksmedina.solar.linear.arrows.AltArrowUp
import dev.chiksmedina.solar.linear.arrows.ArrowDown
import dev.chiksmedina.solar.linear.arrows.ArrowLeft
import dev.chiksmedina.solar.linear.arrows.ArrowLeftDown
import dev.chiksmedina.solar.linear.arrows.ArrowLeftUp
import dev.chiksmedina.solar.linear.arrows.ArrowRight
import dev.chiksmedina.solar.linear.arrows.ArrowRightDown
import dev.chiksmedina.solar.linear.arrows.ArrowRightUp
import dev.chiksmedina.solar.linear.arrows.ArrowUp
import dev.chiksmedina.solar.linear.arrows.DoubleAltArrowDown
import dev.chiksmedina.solar.linear.arrows.DoubleAltArrowLeft
import dev.chiksmedina.solar.linear.arrows.DoubleAltArrowRight
import dev.chiksmedina.solar.linear.arrows.DoubleAltArrowUp
import dev.chiksmedina.solar.linear.arrows.Refresh
import dev.chiksmedina.solar.linear.arrows.RefreshCircle
import dev.chiksmedina.solar.linear.arrows.RefreshSquare
import dev.chiksmedina.solar.linear.arrows.Restart
import dev.chiksmedina.solar.linear.arrows.RestartCircle
import dev.chiksmedina.solar.linear.arrows.RestartSquare
import dev.chiksmedina.solar.linear.arrows.RoundAltArrowDown
import dev.chiksmedina.solar.linear.arrows.RoundAltArrowLeft
import dev.chiksmedina.solar.linear.arrows.RoundAltArrowRight
import dev.chiksmedina.solar.linear.arrows.RoundAltArrowUp
import dev.chiksmedina.solar.linear.arrows.RoundArrowDown
import dev.chiksmedina.solar.linear.arrows.RoundArrowLeft
import dev.chiksmedina.solar.linear.arrows.RoundArrowLeftDown
import dev.chiksmedina.solar.linear.arrows.RoundArrowLeftUp
import dev.chiksmedina.solar.linear.arrows.RoundArrowRight
import dev.chiksmedina.solar.linear.arrows.RoundArrowRightDown
import dev.chiksmedina.solar.linear.arrows.RoundArrowRightUp
import dev.chiksmedina.solar.linear.arrows.RoundArrowUp
import dev.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowDown
import dev.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowLeft
import dev.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowRight
import dev.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowUp
import dev.chiksmedina.solar.linear.arrows.RoundSortHorizontal
import dev.chiksmedina.solar.linear.arrows.RoundSortVertical
import dev.chiksmedina.solar.linear.arrows.RoundTransferDiagonal
import dev.chiksmedina.solar.linear.arrows.RoundTransferHorizontal
import dev.chiksmedina.solar.linear.arrows.RoundTransferVertical
import dev.chiksmedina.solar.linear.arrows.SortHorizontal
import dev.chiksmedina.solar.linear.arrows.SortVertical
import dev.chiksmedina.solar.linear.arrows.SquareAltArrowDown
import dev.chiksmedina.solar.linear.arrows.SquareAltArrowLeft
import dev.chiksmedina.solar.linear.arrows.SquareAltArrowRight
import dev.chiksmedina.solar.linear.arrows.SquareAltArrowUp
import dev.chiksmedina.solar.linear.arrows.SquareArrowDown
import dev.chiksmedina.solar.linear.arrows.SquareArrowLeft
import dev.chiksmedina.solar.linear.arrows.SquareArrowLeftDown
import dev.chiksmedina.solar.linear.arrows.SquareArrowLeftUp
import dev.chiksmedina.solar.linear.arrows.SquareArrowRight
import dev.chiksmedina.solar.linear.arrows.SquareArrowRightDown
import dev.chiksmedina.solar.linear.arrows.SquareArrowRightUp
import dev.chiksmedina.solar.linear.arrows.SquareArrowUp
import dev.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowDown
import dev.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowLeft
import dev.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowRight
import dev.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowUp
import dev.chiksmedina.solar.linear.arrows.SquareSortHorizontal
import dev.chiksmedina.solar.linear.arrows.SquareSortVertical
import dev.chiksmedina.solar.linear.arrows.SquareTransferHorizontal
import dev.chiksmedina.solar.linear.arrows.SquareTransferVertical
import dev.chiksmedina.solar.linear.arrows.TransferHorizontal
import dev.chiksmedina.solar.linear.arrows.TransferVertical
import kotlin.collections.List as KtList

object ArrowsGroup

val LinearSolar.Arrows: ArrowsGroup
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
