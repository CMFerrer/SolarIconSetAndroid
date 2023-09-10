package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.arrows.AltArrowDown
import com.chiksmedina.solar.boldduotone.arrows.AltArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.AltArrowRight
import com.chiksmedina.solar.boldduotone.arrows.AltArrowUp
import com.chiksmedina.solar.boldduotone.arrows.ArrowDown
import com.chiksmedina.solar.boldduotone.arrows.ArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.ArrowLeftDown
import com.chiksmedina.solar.boldduotone.arrows.ArrowLeftUp
import com.chiksmedina.solar.boldduotone.arrows.ArrowRight
import com.chiksmedina.solar.boldduotone.arrows.ArrowRightDown
import com.chiksmedina.solar.boldduotone.arrows.ArrowRightUp
import com.chiksmedina.solar.boldduotone.arrows.ArrowUp
import com.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowDown
import com.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowRight
import com.chiksmedina.solar.boldduotone.arrows.DoubleAltArrowUp
import com.chiksmedina.solar.boldduotone.arrows.Refresh
import com.chiksmedina.solar.boldduotone.arrows.RefreshCircle
import com.chiksmedina.solar.boldduotone.arrows.RefreshSquare
import com.chiksmedina.solar.boldduotone.arrows.Restart
import com.chiksmedina.solar.boldduotone.arrows.RestartCircle
import com.chiksmedina.solar.boldduotone.arrows.RestartSquare
import com.chiksmedina.solar.boldduotone.arrows.RoundAltArrowDown
import com.chiksmedina.solar.boldduotone.arrows.RoundAltArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.RoundAltArrowRight
import com.chiksmedina.solar.boldduotone.arrows.RoundAltArrowUp
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowDown
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowLeftDown
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowLeftUp
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowRight
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowRightDown
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowRightUp
import com.chiksmedina.solar.boldduotone.arrows.RoundArrowUp
import com.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowDown
import com.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowRight
import com.chiksmedina.solar.boldduotone.arrows.RoundDoubleAltArrowUp
import com.chiksmedina.solar.boldduotone.arrows.RoundSortHorizontal
import com.chiksmedina.solar.boldduotone.arrows.RoundSortVertical
import com.chiksmedina.solar.boldduotone.arrows.RoundTransferDiagonal
import com.chiksmedina.solar.boldduotone.arrows.RoundTransferHorizontal
import com.chiksmedina.solar.boldduotone.arrows.RoundTransferVertical
import com.chiksmedina.solar.boldduotone.arrows.SortHorizontal
import com.chiksmedina.solar.boldduotone.arrows.SortVertical
import com.chiksmedina.solar.boldduotone.arrows.SquareAltArrowDown
import com.chiksmedina.solar.boldduotone.arrows.SquareAltArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.SquareAltArrowRight
import com.chiksmedina.solar.boldduotone.arrows.SquareAltArrowUp
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowDown
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowLeftDown
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowLeftUp
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowRight
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowRightDown
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowRightUp
import com.chiksmedina.solar.boldduotone.arrows.SquareArrowUp
import com.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowDown
import com.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowLeft
import com.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowRight
import com.chiksmedina.solar.boldduotone.arrows.SquareDoubleAltArrowUp
import com.chiksmedina.solar.boldduotone.arrows.SquareSortHorizontal
import com.chiksmedina.solar.boldduotone.arrows.SquareSortVertical
import com.chiksmedina.solar.boldduotone.arrows.SquareTransferHorizontal
import com.chiksmedina.solar.boldduotone.arrows.SquareTransferVertical
import com.chiksmedina.solar.boldduotone.arrows.TransferHorizontal
import com.chiksmedina.solar.boldduotone.arrows.TransferVertical
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
