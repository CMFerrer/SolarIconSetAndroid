package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.arrows.AltArrowDown
import com.chiksmedina.solar.lineduotone.arrows.AltArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.AltArrowRight
import com.chiksmedina.solar.lineduotone.arrows.AltArrowUp
import com.chiksmedina.solar.lineduotone.arrows.ArrowDown
import com.chiksmedina.solar.lineduotone.arrows.ArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.ArrowLeftDown
import com.chiksmedina.solar.lineduotone.arrows.ArrowLeftUp
import com.chiksmedina.solar.lineduotone.arrows.ArrowRight
import com.chiksmedina.solar.lineduotone.arrows.ArrowRightDown
import com.chiksmedina.solar.lineduotone.arrows.ArrowRightUp
import com.chiksmedina.solar.lineduotone.arrows.ArrowUp
import com.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowDown
import com.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowRight
import com.chiksmedina.solar.lineduotone.arrows.DoubleAltArrowUp
import com.chiksmedina.solar.lineduotone.arrows.Refresh
import com.chiksmedina.solar.lineduotone.arrows.RefreshCircle
import com.chiksmedina.solar.lineduotone.arrows.RefreshSquare
import com.chiksmedina.solar.lineduotone.arrows.Restart
import com.chiksmedina.solar.lineduotone.arrows.RestartCircle
import com.chiksmedina.solar.lineduotone.arrows.RestartSquare
import com.chiksmedina.solar.lineduotone.arrows.RoundAltArrowDown
import com.chiksmedina.solar.lineduotone.arrows.RoundAltArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.RoundAltArrowRight
import com.chiksmedina.solar.lineduotone.arrows.RoundAltArrowUp
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowDown
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowLeftDown
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowLeftUp
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowRight
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowRightDown
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowRightUp
import com.chiksmedina.solar.lineduotone.arrows.RoundArrowUp
import com.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowDown
import com.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowRight
import com.chiksmedina.solar.lineduotone.arrows.RoundDoubleAltArrowUp
import com.chiksmedina.solar.lineduotone.arrows.RoundSortHorizontal
import com.chiksmedina.solar.lineduotone.arrows.RoundSortVertical
import com.chiksmedina.solar.lineduotone.arrows.RoundTransferDiagonal
import com.chiksmedina.solar.lineduotone.arrows.RoundTransferHorizontal
import com.chiksmedina.solar.lineduotone.arrows.RoundTransferVertical
import com.chiksmedina.solar.lineduotone.arrows.SortHorizontal
import com.chiksmedina.solar.lineduotone.arrows.SortVertical
import com.chiksmedina.solar.lineduotone.arrows.SquareAltArrowDown
import com.chiksmedina.solar.lineduotone.arrows.SquareAltArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.SquareAltArrowRight
import com.chiksmedina.solar.lineduotone.arrows.SquareAltArrowUp
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowDown
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowLeftDown
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowLeftUp
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowRight
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowRightDown
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowRightUp
import com.chiksmedina.solar.lineduotone.arrows.SquareArrowUp
import com.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowDown
import com.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowLeft
import com.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowRight
import com.chiksmedina.solar.lineduotone.arrows.SquareDoubleAltArrowUp
import com.chiksmedina.solar.lineduotone.arrows.SquareSortHorizontal
import com.chiksmedina.solar.lineduotone.arrows.SquareSortVertical
import com.chiksmedina.solar.lineduotone.arrows.SquareTransferHorizontal
import com.chiksmedina.solar.lineduotone.arrows.SquareTransferVertical
import com.chiksmedina.solar.lineduotone.arrows.TransferHorizontal
import com.chiksmedina.solar.lineduotone.arrows.TransferVertical
import kotlin.collections.List as ____KtList

public object ArrowsGroup

public val LineduotoneGroup.Arrows: ArrowsGroup
  get() = ArrowsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ArrowsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(AltArrowDown, AltArrowLeft, AltArrowRight, AltArrowUp, ArrowDown, ArrowLeft,
        ArrowLeftDown, ArrowLeftUp, ArrowRight, ArrowRightDown, ArrowRightUp, ArrowUp,
        DoubleAltArrowDown, DoubleAltArrowLeft, DoubleAltArrowRight, DoubleAltArrowUp, Refresh,
        RefreshCircle, RefreshSquare, Restart, RestartCircle, RestartSquare, RoundAltArrowDown,
        RoundAltArrowLeft, RoundAltArrowRight, RoundAltArrowUp, RoundArrowDown, RoundArrowLeft,
        RoundArrowLeftDown, RoundArrowLeftUp, RoundArrowRight, RoundArrowRightDown,
        RoundArrowRightUp, RoundArrowUp, RoundDoubleAltArrowDown, RoundDoubleAltArrowLeft,
        RoundDoubleAltArrowRight, RoundDoubleAltArrowUp, RoundSortHorizontal, RoundSortVertical,
        RoundTransferDiagonal, RoundTransferHorizontal, RoundTransferVertical, SortHorizontal,
        SortVertical, SquareAltArrowLeft, SquareAltArrowRight, SquareAltArrowUp, SquareAltArrowDown,
        SquareArrowDown, SquareArrowLeft, SquareArrowLeftDown, SquareArrowLeftUp, SquareArrowRight,
        SquareArrowRightDown, SquareArrowRightUp, SquareArrowUp, SquareDoubleAltArrowDown,
        SquareDoubleAltArrowLeft, SquareDoubleAltArrowUp, SquareDoubleAltArrowRight,
        SquareSortHorizontal, SquareSortVertical, SquareTransferHorizontal, SquareTransferVertical,
        TransferHorizontal, TransferVertical)
    return __AllIcons!!
  }
