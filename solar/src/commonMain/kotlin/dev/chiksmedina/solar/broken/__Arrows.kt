package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.arrows.AltArrowDown
import dev.chiksmedina.solar.broken.arrows.AltArrowLeft
import dev.chiksmedina.solar.broken.arrows.AltArrowRight
import dev.chiksmedina.solar.broken.arrows.AltArrowUp
import dev.chiksmedina.solar.broken.arrows.ArrowDown
import dev.chiksmedina.solar.broken.arrows.ArrowLeft
import dev.chiksmedina.solar.broken.arrows.ArrowLeftDown
import dev.chiksmedina.solar.broken.arrows.ArrowLeftUp
import dev.chiksmedina.solar.broken.arrows.ArrowRight
import dev.chiksmedina.solar.broken.arrows.ArrowRightDown
import dev.chiksmedina.solar.broken.arrows.ArrowRightUp
import dev.chiksmedina.solar.broken.arrows.ArrowUp
import dev.chiksmedina.solar.broken.arrows.DoubleAltArrowDown
import dev.chiksmedina.solar.broken.arrows.DoubleAltArrowLeft
import dev.chiksmedina.solar.broken.arrows.DoubleAltArrowRight
import dev.chiksmedina.solar.broken.arrows.DoubleAltArrowUp
import dev.chiksmedina.solar.broken.arrows.Refresh
import dev.chiksmedina.solar.broken.arrows.RefreshCircle
import dev.chiksmedina.solar.broken.arrows.RefreshSquare
import dev.chiksmedina.solar.broken.arrows.Restart
import dev.chiksmedina.solar.broken.arrows.RestartCircle
import dev.chiksmedina.solar.broken.arrows.RestartSquare
import dev.chiksmedina.solar.broken.arrows.RoundAltArrowDown
import dev.chiksmedina.solar.broken.arrows.RoundAltArrowLeft
import dev.chiksmedina.solar.broken.arrows.RoundAltArrowRight
import dev.chiksmedina.solar.broken.arrows.RoundAltArrowUp
import dev.chiksmedina.solar.broken.arrows.RoundArrowDown
import dev.chiksmedina.solar.broken.arrows.RoundArrowLeft
import dev.chiksmedina.solar.broken.arrows.RoundArrowLeftDown
import dev.chiksmedina.solar.broken.arrows.RoundArrowLeftUp
import dev.chiksmedina.solar.broken.arrows.RoundArrowRight
import dev.chiksmedina.solar.broken.arrows.RoundArrowRightDown
import dev.chiksmedina.solar.broken.arrows.RoundArrowRightUp
import dev.chiksmedina.solar.broken.arrows.RoundArrowUp
import dev.chiksmedina.solar.broken.arrows.RoundDoubleAltArrowDown
import dev.chiksmedina.solar.broken.arrows.RoundDoubleAltArrowLeft
import dev.chiksmedina.solar.broken.arrows.RoundDoubleAltArrowRight
import dev.chiksmedina.solar.broken.arrows.RoundDoubleAltArrowUp
import dev.chiksmedina.solar.broken.arrows.RoundSortHorizontal
import dev.chiksmedina.solar.broken.arrows.RoundSortVertical
import dev.chiksmedina.solar.broken.arrows.RoundTransferDiagonal
import dev.chiksmedina.solar.broken.arrows.RoundTransferHorizontal
import dev.chiksmedina.solar.broken.arrows.RoundTransferVertical
import dev.chiksmedina.solar.broken.arrows.SortHorizontal
import dev.chiksmedina.solar.broken.arrows.SortVertical
import dev.chiksmedina.solar.broken.arrows.SquareAltArrowDown
import dev.chiksmedina.solar.broken.arrows.SquareAltArrowLeft
import dev.chiksmedina.solar.broken.arrows.SquareAltArrowRight
import dev.chiksmedina.solar.broken.arrows.SquareAltArrowUp
import dev.chiksmedina.solar.broken.arrows.SquareArrowDown
import dev.chiksmedina.solar.broken.arrows.SquareArrowLeft
import dev.chiksmedina.solar.broken.arrows.SquareArrowLeftDown
import dev.chiksmedina.solar.broken.arrows.SquareArrowLeftUp
import dev.chiksmedina.solar.broken.arrows.SquareArrowRight
import dev.chiksmedina.solar.broken.arrows.SquareArrowRightDown
import dev.chiksmedina.solar.broken.arrows.SquareArrowRightUp
import dev.chiksmedina.solar.broken.arrows.SquareArrowUp
import dev.chiksmedina.solar.broken.arrows.SquareDoubleAltArrowDown
import dev.chiksmedina.solar.broken.arrows.SquareDoubleAltArrowLeft
import dev.chiksmedina.solar.broken.arrows.SquareDoubleAltArrowRight
import dev.chiksmedina.solar.broken.arrows.SquareDoubleAltArrowUp
import dev.chiksmedina.solar.broken.arrows.SquareSortHorizontal
import dev.chiksmedina.solar.broken.arrows.SquareSortVertical
import dev.chiksmedina.solar.broken.arrows.SquareTransferHorizontal
import dev.chiksmedina.solar.broken.arrows.SquareTransferVertical
import dev.chiksmedina.solar.broken.arrows.TransferHorizontal
import dev.chiksmedina.solar.broken.arrows.TransferVertical
import kotlin.collections.List as KtList

object ArrowsGroup

val BrokenSolar.Arrows: ArrowsGroup
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
