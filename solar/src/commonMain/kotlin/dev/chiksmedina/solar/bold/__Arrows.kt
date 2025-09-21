package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.arrows.AltArrowDown
import dev.chiksmedina.solar.bold.arrows.AltArrowLeft
import dev.chiksmedina.solar.bold.arrows.AltArrowRight
import dev.chiksmedina.solar.bold.arrows.AltArrowUp
import dev.chiksmedina.solar.bold.arrows.ArrowDown
import dev.chiksmedina.solar.bold.arrows.ArrowLeft
import dev.chiksmedina.solar.bold.arrows.ArrowLeftDown
import dev.chiksmedina.solar.bold.arrows.ArrowLeftUp
import dev.chiksmedina.solar.bold.arrows.ArrowRight
import dev.chiksmedina.solar.bold.arrows.ArrowRightDown
import dev.chiksmedina.solar.bold.arrows.ArrowRightUp
import dev.chiksmedina.solar.bold.arrows.ArrowUp
import dev.chiksmedina.solar.bold.arrows.DoubleAltArrowDown
import dev.chiksmedina.solar.bold.arrows.DoubleAltArrowLeft
import dev.chiksmedina.solar.bold.arrows.DoubleAltArrowRight
import dev.chiksmedina.solar.bold.arrows.DoubleAltArrowUp
import dev.chiksmedina.solar.bold.arrows.Refresh
import dev.chiksmedina.solar.bold.arrows.RefreshCircle
import dev.chiksmedina.solar.bold.arrows.RefreshSquare
import dev.chiksmedina.solar.bold.arrows.Restart
import dev.chiksmedina.solar.bold.arrows.RestartCircle
import dev.chiksmedina.solar.bold.arrows.RestartSquare
import dev.chiksmedina.solar.bold.arrows.RoundAltArrowDown
import dev.chiksmedina.solar.bold.arrows.RoundAltArrowLeft
import dev.chiksmedina.solar.bold.arrows.RoundAltArrowRight
import dev.chiksmedina.solar.bold.arrows.RoundAltArrowUp
import dev.chiksmedina.solar.bold.arrows.RoundArrowDown
import dev.chiksmedina.solar.bold.arrows.RoundArrowLeft
import dev.chiksmedina.solar.bold.arrows.RoundArrowLeftDown
import dev.chiksmedina.solar.bold.arrows.RoundArrowLeftUp
import dev.chiksmedina.solar.bold.arrows.RoundArrowRight
import dev.chiksmedina.solar.bold.arrows.RoundArrowRightDown
import dev.chiksmedina.solar.bold.arrows.RoundArrowRightUp
import dev.chiksmedina.solar.bold.arrows.RoundArrowUp
import dev.chiksmedina.solar.bold.arrows.RoundDoubleAltArrowDown
import dev.chiksmedina.solar.bold.arrows.RoundDoubleAltArrowLeft
import dev.chiksmedina.solar.bold.arrows.RoundDoubleAltArrowRight
import dev.chiksmedina.solar.bold.arrows.RoundDoubleAltArrowUp
import dev.chiksmedina.solar.bold.arrows.RoundSortHorizontal
import dev.chiksmedina.solar.bold.arrows.RoundSortVertical
import dev.chiksmedina.solar.bold.arrows.RoundTransferDiagonal
import dev.chiksmedina.solar.bold.arrows.RoundTransferHorizontal
import dev.chiksmedina.solar.bold.arrows.RoundTransferVertical
import dev.chiksmedina.solar.bold.arrows.SortHorizontal
import dev.chiksmedina.solar.bold.arrows.SortVertical
import dev.chiksmedina.solar.bold.arrows.SquareAltArrowDown
import dev.chiksmedina.solar.bold.arrows.SquareAltArrowLeft
import dev.chiksmedina.solar.bold.arrows.SquareAltArrowRight
import dev.chiksmedina.solar.bold.arrows.SquareAltArrowUp
import dev.chiksmedina.solar.bold.arrows.SquareArrowDown
import dev.chiksmedina.solar.bold.arrows.SquareArrowLeft
import dev.chiksmedina.solar.bold.arrows.SquareArrowLeftDown
import dev.chiksmedina.solar.bold.arrows.SquareArrowLeftUp
import dev.chiksmedina.solar.bold.arrows.SquareArrowRight
import dev.chiksmedina.solar.bold.arrows.SquareArrowRightDown
import dev.chiksmedina.solar.bold.arrows.SquareArrowRightUp
import dev.chiksmedina.solar.bold.arrows.SquareArrowUp
import dev.chiksmedina.solar.bold.arrows.SquareDoubleAltArrowDown
import dev.chiksmedina.solar.bold.arrows.SquareDoubleAltArrowLeft
import dev.chiksmedina.solar.bold.arrows.SquareDoubleAltArrowRight
import dev.chiksmedina.solar.bold.arrows.SquareDoubleAltArrowUp
import dev.chiksmedina.solar.bold.arrows.SquareSortHorizontal
import dev.chiksmedina.solar.bold.arrows.SquareSortVertical
import dev.chiksmedina.solar.bold.arrows.SquareTransferHorizontal
import dev.chiksmedina.solar.bold.arrows.SquareTransferVertical
import dev.chiksmedina.solar.bold.arrows.TransferHorizontal
import dev.chiksmedina.solar.bold.arrows.TransferVertical
import kotlin.collections.List as KtList

object ArrowsGroup

val BoldSolar.Arrows: ArrowsGroup
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
