package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.arrows.AltArrowDown
import dev.chiksmedina.solar.outline.arrows.AltArrowLeft
import dev.chiksmedina.solar.outline.arrows.AltArrowRight
import dev.chiksmedina.solar.outline.arrows.AltArrowUp
import dev.chiksmedina.solar.outline.arrows.ArrowDown
import dev.chiksmedina.solar.outline.arrows.ArrowLeft
import dev.chiksmedina.solar.outline.arrows.ArrowLeftDown
import dev.chiksmedina.solar.outline.arrows.ArrowLeftUp
import dev.chiksmedina.solar.outline.arrows.ArrowRight
import dev.chiksmedina.solar.outline.arrows.ArrowRightDown
import dev.chiksmedina.solar.outline.arrows.ArrowRightUp
import dev.chiksmedina.solar.outline.arrows.ArrowUp
import dev.chiksmedina.solar.outline.arrows.DoubleAltArrowDown
import dev.chiksmedina.solar.outline.arrows.DoubleAltArrowLeft
import dev.chiksmedina.solar.outline.arrows.DoubleAltArrowRight
import dev.chiksmedina.solar.outline.arrows.DoubleAltArrowUp
import dev.chiksmedina.solar.outline.arrows.Refresh
import dev.chiksmedina.solar.outline.arrows.RefreshCircle
import dev.chiksmedina.solar.outline.arrows.RefreshSquare
import dev.chiksmedina.solar.outline.arrows.Restart
import dev.chiksmedina.solar.outline.arrows.RestartCircle
import dev.chiksmedina.solar.outline.arrows.RestartSquare
import dev.chiksmedina.solar.outline.arrows.RoundAltArrowDown
import dev.chiksmedina.solar.outline.arrows.RoundAltArrowLeft
import dev.chiksmedina.solar.outline.arrows.RoundAltArrowRight
import dev.chiksmedina.solar.outline.arrows.RoundAltArrowUp
import dev.chiksmedina.solar.outline.arrows.RoundArrowDown
import dev.chiksmedina.solar.outline.arrows.RoundArrowLeft
import dev.chiksmedina.solar.outline.arrows.RoundArrowLeftDown
import dev.chiksmedina.solar.outline.arrows.RoundArrowLeftUp
import dev.chiksmedina.solar.outline.arrows.RoundArrowRight
import dev.chiksmedina.solar.outline.arrows.RoundArrowRightDown
import dev.chiksmedina.solar.outline.arrows.RoundArrowRightUp
import dev.chiksmedina.solar.outline.arrows.RoundArrowUp
import dev.chiksmedina.solar.outline.arrows.RoundDoubleAltArrowDown
import dev.chiksmedina.solar.outline.arrows.RoundDoubleAltArrowLeft
import dev.chiksmedina.solar.outline.arrows.RoundDoubleAltArrowRight
import dev.chiksmedina.solar.outline.arrows.RoundDoubleAltArrowUp
import dev.chiksmedina.solar.outline.arrows.RoundSortHorizontal
import dev.chiksmedina.solar.outline.arrows.RoundSortVertical
import dev.chiksmedina.solar.outline.arrows.RoundTransferDiagonal
import dev.chiksmedina.solar.outline.arrows.RoundTransferHorizontal
import dev.chiksmedina.solar.outline.arrows.RoundTransferVertical
import dev.chiksmedina.solar.outline.arrows.SortHorizontal
import dev.chiksmedina.solar.outline.arrows.SortVertical
import dev.chiksmedina.solar.outline.arrows.SquareAltArrowDown
import dev.chiksmedina.solar.outline.arrows.SquareAltArrowLeft
import dev.chiksmedina.solar.outline.arrows.SquareAltArrowRight
import dev.chiksmedina.solar.outline.arrows.SquareAltArrowUp
import dev.chiksmedina.solar.outline.arrows.SquareArrowDown
import dev.chiksmedina.solar.outline.arrows.SquareArrowLeft
import dev.chiksmedina.solar.outline.arrows.SquareArrowLeftDown
import dev.chiksmedina.solar.outline.arrows.SquareArrowLeftUp
import dev.chiksmedina.solar.outline.arrows.SquareArrowRight
import dev.chiksmedina.solar.outline.arrows.SquareArrowRightDown
import dev.chiksmedina.solar.outline.arrows.SquareArrowRightUp
import dev.chiksmedina.solar.outline.arrows.SquareArrowUp
import dev.chiksmedina.solar.outline.arrows.SquareDoubleAltArrowDown
import dev.chiksmedina.solar.outline.arrows.SquareDoubleAltArrowLeft
import dev.chiksmedina.solar.outline.arrows.SquareDoubleAltArrowRight
import dev.chiksmedina.solar.outline.arrows.SquareDoubleAltArrowUp
import dev.chiksmedina.solar.outline.arrows.SquareSortHorizontal
import dev.chiksmedina.solar.outline.arrows.SquareSortVertical
import dev.chiksmedina.solar.outline.arrows.SquareTransferHorizontal
import dev.chiksmedina.solar.outline.arrows.SquareTransferVertical
import dev.chiksmedina.solar.outline.arrows.TransferHorizontal
import dev.chiksmedina.solar.outline.arrows.TransferVertical
import kotlin.collections.List as KtList

object ArrowsGroup

val OutlineSolar.Arrows: ArrowsGroup
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
