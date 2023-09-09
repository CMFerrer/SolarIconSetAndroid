package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.arrowsaction.ArrowToDownLeft
import com.chiksmedina.solar.broken.arrowsaction.ArrowToDownRight
import com.chiksmedina.solar.broken.arrowsaction.ArrowToTopLeft
import com.chiksmedina.solar.broken.arrowsaction.ArrowToTopRight
import com.chiksmedina.solar.broken.arrowsaction.CircleBottomDown
import com.chiksmedina.solar.broken.arrowsaction.CircleBottomUp
import com.chiksmedina.solar.broken.arrowsaction.CircleTopDown
import com.chiksmedina.solar.broken.arrowsaction.CircleTopUp
import com.chiksmedina.solar.broken.arrowsaction.Download
import com.chiksmedina.solar.broken.arrowsaction.DownloadMinimalistic
import com.chiksmedina.solar.broken.arrowsaction.DownloadSquare
import com.chiksmedina.solar.broken.arrowsaction.DownloadTwiceSquare
import com.chiksmedina.solar.broken.arrowsaction.Exit
import com.chiksmedina.solar.broken.arrowsaction.Export
import com.chiksmedina.solar.broken.arrowsaction.Forward
import com.chiksmedina.solar.broken.arrowsaction.Forward2
import com.chiksmedina.solar.broken.arrowsaction.Import
import com.chiksmedina.solar.broken.arrowsaction.Login
import com.chiksmedina.solar.broken.arrowsaction.Login2
import com.chiksmedina.solar.broken.arrowsaction.Login3
import com.chiksmedina.solar.broken.arrowsaction.Logout
import com.chiksmedina.solar.broken.arrowsaction.Logout2
import com.chiksmedina.solar.broken.arrowsaction.Logout3
import com.chiksmedina.solar.broken.arrowsaction.Maximize
import com.chiksmedina.solar.broken.arrowsaction.MaximizeSquare
import com.chiksmedina.solar.broken.arrowsaction.MaximizeSquare2
import com.chiksmedina.solar.broken.arrowsaction.MaximizeSquare3
import com.chiksmedina.solar.broken.arrowsaction.MaximizeSquareMinimalistic
import com.chiksmedina.solar.broken.arrowsaction.Minimize
import com.chiksmedina.solar.broken.arrowsaction.MinimizeSquare
import com.chiksmedina.solar.broken.arrowsaction.MinimizeSquare2
import com.chiksmedina.solar.broken.arrowsaction.MinimizeSquare3
import com.chiksmedina.solar.broken.arrowsaction.MinimizeSquareMinimalistic
import com.chiksmedina.solar.broken.arrowsaction.ReciveSquare
import com.chiksmedina.solar.broken.arrowsaction.ReciveTwiceSquare
import com.chiksmedina.solar.broken.arrowsaction.Reorder
import com.chiksmedina.solar.broken.arrowsaction.Reply
import com.chiksmedina.solar.broken.arrowsaction.Reply2
import com.chiksmedina.solar.broken.arrowsaction.Scale
import com.chiksmedina.solar.broken.arrowsaction.ScreenShare
import com.chiksmedina.solar.broken.arrowsaction.SendSquare
import com.chiksmedina.solar.broken.arrowsaction.SendTwiceSquare
import com.chiksmedina.solar.broken.arrowsaction.SquareBottomDown
import com.chiksmedina.solar.broken.arrowsaction.SquareBottomUp
import com.chiksmedina.solar.broken.arrowsaction.SquareTopDown
import com.chiksmedina.solar.broken.arrowsaction.SquareTopUp
import com.chiksmedina.solar.broken.arrowsaction.UndoLeft
import com.chiksmedina.solar.broken.arrowsaction.UndoLeftRound
import com.chiksmedina.solar.broken.arrowsaction.UndoLeftRoundSquare
import com.chiksmedina.solar.broken.arrowsaction.UndoLeftSquare
import com.chiksmedina.solar.broken.arrowsaction.UndoRight
import com.chiksmedina.solar.broken.arrowsaction.UndoRightRound
import com.chiksmedina.solar.broken.arrowsaction.UndoRightRoundSquare
import com.chiksmedina.solar.broken.arrowsaction.UndoRightSquare
import com.chiksmedina.solar.broken.arrowsaction.Upload
import com.chiksmedina.solar.broken.arrowsaction.UploadMinimalistic
import com.chiksmedina.solar.broken.arrowsaction.UploadSquare
import com.chiksmedina.solar.broken.arrowsaction.UploadTwiceSquare
import kotlin.collections.List as ____KtList

public object ArrowsActionGroup

public val BrokenGroup.ArrowsAction: ArrowsActionGroup
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
