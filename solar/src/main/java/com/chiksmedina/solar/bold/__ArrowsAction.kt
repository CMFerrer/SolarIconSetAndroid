package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.arrowsaction.ArrowToDownLeft
import com.chiksmedina.solar.bold.arrowsaction.ArrowToDownRight
import com.chiksmedina.solar.bold.arrowsaction.ArrowToTopLeft
import com.chiksmedina.solar.bold.arrowsaction.ArrowToTopRight
import com.chiksmedina.solar.bold.arrowsaction.CircleBottomDown
import com.chiksmedina.solar.bold.arrowsaction.CircleBottomUp
import com.chiksmedina.solar.bold.arrowsaction.CircleTopDown
import com.chiksmedina.solar.bold.arrowsaction.CircleTopUp
import com.chiksmedina.solar.bold.arrowsaction.Download
import com.chiksmedina.solar.bold.arrowsaction.DownloadMinimalistic
import com.chiksmedina.solar.bold.arrowsaction.DownloadSquare
import com.chiksmedina.solar.bold.arrowsaction.DownloadTwiceSquare
import com.chiksmedina.solar.bold.arrowsaction.Exit
import com.chiksmedina.solar.bold.arrowsaction.Export
import com.chiksmedina.solar.bold.arrowsaction.Forward
import com.chiksmedina.solar.bold.arrowsaction.Forward2
import com.chiksmedina.solar.bold.arrowsaction.Import
import com.chiksmedina.solar.bold.arrowsaction.Login
import com.chiksmedina.solar.bold.arrowsaction.Login2
import com.chiksmedina.solar.bold.arrowsaction.Login3
import com.chiksmedina.solar.bold.arrowsaction.Maximize
import com.chiksmedina.solar.bold.arrowsaction.MaximizeSquare
import com.chiksmedina.solar.bold.arrowsaction.MaximizeSquare2
import com.chiksmedina.solar.bold.arrowsaction.MaximizeSquare3
import com.chiksmedina.solar.bold.arrowsaction.MaximizeSquareMinimalistic
import com.chiksmedina.solar.bold.arrowsaction.Minimize
import com.chiksmedina.solar.bold.arrowsaction.MinimizeSquare
import com.chiksmedina.solar.bold.arrowsaction.MinimizeSquare2
import com.chiksmedina.solar.bold.arrowsaction.MinimizeSquare3
import com.chiksmedina.solar.bold.arrowsaction.MinimizeSquareMinimalistic
import com.chiksmedina.solar.bold.arrowsaction.ReciveSquare
import com.chiksmedina.solar.bold.arrowsaction.ReciveTwiceSquare
import com.chiksmedina.solar.bold.arrowsaction.Reorder
import com.chiksmedina.solar.bold.arrowsaction.Reply
import com.chiksmedina.solar.bold.arrowsaction.Reply2
import com.chiksmedina.solar.bold.arrowsaction.Scale
import com.chiksmedina.solar.bold.arrowsaction.ScreenShare
import com.chiksmedina.solar.bold.arrowsaction.SendSquare
import com.chiksmedina.solar.bold.arrowsaction.SendTwiceSquare
import com.chiksmedina.solar.bold.arrowsaction.SquareBottomDown
import com.chiksmedina.solar.bold.arrowsaction.SquareBottomUp
import com.chiksmedina.solar.bold.arrowsaction.SquareTopDown
import com.chiksmedina.solar.bold.arrowsaction.SquareTopUp
import com.chiksmedina.solar.bold.arrowsaction.UndoLeft
import com.chiksmedina.solar.bold.arrowsaction.UndoLeftRound
import com.chiksmedina.solar.bold.arrowsaction.UndoLeftRoundSquare
import com.chiksmedina.solar.bold.arrowsaction.UndoLeftSquare
import com.chiksmedina.solar.bold.arrowsaction.UndoRight
import com.chiksmedina.solar.bold.arrowsaction.UndoRightRound
import com.chiksmedina.solar.bold.arrowsaction.UndoRightRoundSquare
import com.chiksmedina.solar.bold.arrowsaction.UndoRightSquare
import com.chiksmedina.solar.bold.arrowsaction.Upload
import com.chiksmedina.solar.bold.arrowsaction.UploadMinimalistic
import com.chiksmedina.solar.bold.arrowsaction.UploadSquare
import com.chiksmedina.solar.bold.arrowsaction.UploadTwiceSquare

public object ArrowsActionGroup

public val BoldGroup.ArrowsAction: ArrowsActionGroup
    get() = ArrowsActionGroup

private var __AllIcons: List<ImageVector>? = null

public val ArrowsActionGroup.AllIcons: List<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons= listOf(ArrowToDownLeft, ArrowToDownRight, ArrowToTopLeft, ArrowToTopRight,
            CircleBottomDown, CircleBottomUp, CircleTopDown, CircleTopUp, Download,
            DownloadMinimalistic, DownloadSquare, DownloadTwiceSquare, Exit, Export, Forward,
            Forward2, Import, Login, Login2, Login3, Maximize, MaximizeSquare, MaximizeSquare2, MaximizeSquare3,
            MaximizeSquareMinimalistic, Minimize, MinimizeSquare, MinimizeSquare2, MinimizeSquare3,
            MinimizeSquareMinimalistic, ReciveSquare, ReciveTwiceSquare, Reorder, Reply, Reply2, Scale,
            ScreenShare, SendSquare, SendTwiceSquare, SquareBottomDown, SquareBottomUp, SquareTopDown,
            SquareTopUp, UndoLeft, UndoLeftRound, UndoLeftRoundSquare, UndoLeftSquare, UndoRight,
            UndoRightRound, UndoRightRoundSquare, UndoRightSquare, Upload, UploadMinimalistic,
            UploadSquare, UploadTwiceSquare)
        return __AllIcons!!
    }
