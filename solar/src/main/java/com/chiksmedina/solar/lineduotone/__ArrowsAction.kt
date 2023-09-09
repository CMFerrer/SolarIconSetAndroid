package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.arrowsaction.ArrowToDownLeft
import com.chiksmedina.solar.lineduotone.arrowsaction.ArrowToDownRight
import com.chiksmedina.solar.lineduotone.arrowsaction.ArrowToTopLeft
import com.chiksmedina.solar.lineduotone.arrowsaction.ArrowToTopRight
import com.chiksmedina.solar.lineduotone.arrowsaction.CircleBottomDown
import com.chiksmedina.solar.lineduotone.arrowsaction.CircleBottomUp
import com.chiksmedina.solar.lineduotone.arrowsaction.CircleTopDown
import com.chiksmedina.solar.lineduotone.arrowsaction.CircleTopUp
import com.chiksmedina.solar.lineduotone.arrowsaction.Download
import com.chiksmedina.solar.lineduotone.arrowsaction.DownloadMinimalistic
import com.chiksmedina.solar.lineduotone.arrowsaction.DownloadSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.DownloadTwiceSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.Exit
import com.chiksmedina.solar.lineduotone.arrowsaction.Export
import com.chiksmedina.solar.lineduotone.arrowsaction.Forward
import com.chiksmedina.solar.lineduotone.arrowsaction.Forward2
import com.chiksmedina.solar.lineduotone.arrowsaction.Import
import com.chiksmedina.solar.lineduotone.arrowsaction.Login
import com.chiksmedina.solar.lineduotone.arrowsaction.Login2
import com.chiksmedina.solar.lineduotone.arrowsaction.Login3
import com.chiksmedina.solar.lineduotone.arrowsaction.Logout
import com.chiksmedina.solar.lineduotone.arrowsaction.Logout2
import com.chiksmedina.solar.lineduotone.arrowsaction.Logout3
import com.chiksmedina.solar.lineduotone.arrowsaction.Maximize
import com.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquare2
import com.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquare3
import com.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquareMinimalistic
import com.chiksmedina.solar.lineduotone.arrowsaction.Minimize
import com.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquare2
import com.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquare3
import com.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquareMinimalistic
import com.chiksmedina.solar.lineduotone.arrowsaction.ReciveSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.ReciveTwiceSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.Reorder
import com.chiksmedina.solar.lineduotone.arrowsaction.Reply
import com.chiksmedina.solar.lineduotone.arrowsaction.Reply2
import com.chiksmedina.solar.lineduotone.arrowsaction.Scale
import com.chiksmedina.solar.lineduotone.arrowsaction.ScreenShare
import com.chiksmedina.solar.lineduotone.arrowsaction.SendSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.SendTwiceSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.SquareBottomDown
import com.chiksmedina.solar.lineduotone.arrowsaction.SquareBottomUp
import com.chiksmedina.solar.lineduotone.arrowsaction.SquareTopDown
import com.chiksmedina.solar.lineduotone.arrowsaction.SquareTopUp
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoLeft
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoLeftRound
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoLeftRoundSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoLeftSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoRight
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoRightRound
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoRightRoundSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.UndoRightSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.Upload
import com.chiksmedina.solar.lineduotone.arrowsaction.UploadMinimalistic
import com.chiksmedina.solar.lineduotone.arrowsaction.UploadSquare
import com.chiksmedina.solar.lineduotone.arrowsaction.UploadTwiceSquare
import kotlin.collections.List as ____KtList

public object ArrowsActionGroup

public val LineduotoneGroup.ArrowsAction: ArrowsActionGroup
  get() = ArrowsActionGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ArrowsActionGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(ArrowToDownLeft, ArrowToDownRight, ArrowToTopLeft, ArrowToTopRight,
        CircleBottomDown, CircleBottomUp, CircleTopDown, CircleTopUp, Download,
        DownloadMinimalistic, DownloadSquare, DownloadTwiceSquare, Exit, Export, Forward, Forward2,
        Import, Login, Login2, Login3, Logout, Logout2, Logout3, Maximize, MaximizeSquare,
        MaximizeSquare2, MaximizeSquare3, MaximizeSquareMinimalistic, Minimize, MinimizeSquare,
        MinimizeSquare2, MinimizeSquare3, MinimizeSquareMinimalistic, ReciveSquare,
        ReciveTwiceSquare, Reorder, Reply, Reply2, Scale, ScreenShare, SendSquare, SendTwiceSquare,
        SquareBottomDown, SquareBottomUp, SquareTopDown, SquareTopUp, UndoLeft, UndoLeftRound,
        UndoLeftRoundSquare, UndoLeftSquare, UndoRight, UndoRightRound, UndoRightRoundSquare,
        UndoRightSquare, Upload, UploadMinimalistic, UploadSquare, UploadTwiceSquare)
    return __AllIcons!!
  }
