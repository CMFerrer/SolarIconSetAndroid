package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.arrows.AltArrowDown
import com.chiksmedina.solar.linear.arrows.AltArrowLeft
import com.chiksmedina.solar.linear.arrows.AltArrowRight
import com.chiksmedina.solar.linear.arrows.AltArrowUp
import com.chiksmedina.solar.linear.arrows.ArrowDown
import com.chiksmedina.solar.linear.arrows.ArrowLeft
import com.chiksmedina.solar.linear.arrows.ArrowLeftDown
import com.chiksmedina.solar.linear.arrows.ArrowLeftUp
import com.chiksmedina.solar.linear.arrows.ArrowRight
import com.chiksmedina.solar.linear.arrows.ArrowRightDown
import com.chiksmedina.solar.linear.arrows.ArrowRightUp
import com.chiksmedina.solar.linear.arrows.ArrowUp
import com.chiksmedina.solar.linear.arrows.DoubleAltArrowDown
import com.chiksmedina.solar.linear.arrows.DoubleAltArrowLeft
import com.chiksmedina.solar.linear.arrows.DoubleAltArrowRight
import com.chiksmedina.solar.linear.arrows.DoubleAltArrowUp
import com.chiksmedina.solar.linear.arrows.Refresh
import com.chiksmedina.solar.linear.arrows.RefreshCircle
import com.chiksmedina.solar.linear.arrows.RefreshSquare
import com.chiksmedina.solar.linear.arrows.Restart
import com.chiksmedina.solar.linear.arrows.RestartCircle
import com.chiksmedina.solar.linear.arrows.RestartSquare
import com.chiksmedina.solar.linear.arrows.RoundAltArrowDown
import com.chiksmedina.solar.linear.arrows.RoundAltArrowLeft
import com.chiksmedina.solar.linear.arrows.RoundAltArrowRight
import com.chiksmedina.solar.linear.arrows.RoundAltArrowUp
import com.chiksmedina.solar.linear.arrows.RoundArrowDown
import com.chiksmedina.solar.linear.arrows.RoundArrowLeft
import com.chiksmedina.solar.linear.arrows.RoundArrowLeftDown
import com.chiksmedina.solar.linear.arrows.RoundArrowLeftUp
import com.chiksmedina.solar.linear.arrows.RoundArrowRight
import com.chiksmedina.solar.linear.arrows.RoundArrowRightDown
import com.chiksmedina.solar.linear.arrows.RoundArrowRightUp
import com.chiksmedina.solar.linear.arrows.RoundArrowUp
import com.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowDown
import com.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowLeft
import com.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowRight
import com.chiksmedina.solar.linear.arrows.RoundDoubleAltArrowUp
import com.chiksmedina.solar.linear.arrows.RoundSortHorizontal
import com.chiksmedina.solar.linear.arrows.RoundSortVertical
import com.chiksmedina.solar.linear.arrows.RoundTransferDiagonal
import com.chiksmedina.solar.linear.arrows.RoundTransferHorizontal
import com.chiksmedina.solar.linear.arrows.RoundTransferVertical
import com.chiksmedina.solar.linear.arrows.SortHorizontal
import com.chiksmedina.solar.linear.arrows.SortVertical
import com.chiksmedina.solar.linear.arrows.SquareAltArrowDown
import com.chiksmedina.solar.linear.arrows.SquareAltArrowLeft
import com.chiksmedina.solar.linear.arrows.SquareAltArrowRight
import com.chiksmedina.solar.linear.arrows.SquareAltArrowUp
import com.chiksmedina.solar.linear.arrows.SquareArrowDown
import com.chiksmedina.solar.linear.arrows.SquareArrowLeft
import com.chiksmedina.solar.linear.arrows.SquareArrowLeftDown
import com.chiksmedina.solar.linear.arrows.SquareArrowLeftUp
import com.chiksmedina.solar.linear.arrows.SquareArrowRight
import com.chiksmedina.solar.linear.arrows.SquareArrowRightDown
import com.chiksmedina.solar.linear.arrows.SquareArrowRightUp
import com.chiksmedina.solar.linear.arrows.SquareArrowUp
import com.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowDown
import com.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowLeft
import com.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowRight
import com.chiksmedina.solar.linear.arrows.SquareDoubleAltArrowUp
import com.chiksmedina.solar.linear.arrows.SquareSortHorizontal
import com.chiksmedina.solar.linear.arrows.SquareSortVertical
import com.chiksmedina.solar.linear.arrows.SquareTransferHorizontal
import com.chiksmedina.solar.linear.arrows.SquareTransferVertical
import com.chiksmedina.solar.linear.arrows.TransferHorizontal
import com.chiksmedina.solar.linear.arrows.TransferVertical
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
