package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.arrowsaction.ArrowToDownLeft
import com.chiksmedina.solar.linear.arrowsaction.ArrowToDownRight
import com.chiksmedina.solar.linear.arrowsaction.ArrowToTopLeft
import com.chiksmedina.solar.linear.arrowsaction.ArrowToTopRight
import com.chiksmedina.solar.linear.arrowsaction.CircleBottomDown
import com.chiksmedina.solar.linear.arrowsaction.CircleBottomUp
import com.chiksmedina.solar.linear.arrowsaction.CircleTopDown
import com.chiksmedina.solar.linear.arrowsaction.CircleTopUp
import com.chiksmedina.solar.linear.arrowsaction.Download
import com.chiksmedina.solar.linear.arrowsaction.DownloadMinimalistic
import com.chiksmedina.solar.linear.arrowsaction.DownloadSquare
import com.chiksmedina.solar.linear.arrowsaction.DownloadTwiceSquare
import com.chiksmedina.solar.linear.arrowsaction.Exit
import com.chiksmedina.solar.linear.arrowsaction.Export
import com.chiksmedina.solar.linear.arrowsaction.Forward
import com.chiksmedina.solar.linear.arrowsaction.Forward2
import com.chiksmedina.solar.linear.arrowsaction.Import
import com.chiksmedina.solar.linear.arrowsaction.Login
import com.chiksmedina.solar.linear.arrowsaction.Login2
import com.chiksmedina.solar.linear.arrowsaction.Login3
import com.chiksmedina.solar.linear.arrowsaction.Logout
import com.chiksmedina.solar.linear.arrowsaction.Logout2
import com.chiksmedina.solar.linear.arrowsaction.Logout3
import com.chiksmedina.solar.linear.arrowsaction.Maximize
import com.chiksmedina.solar.linear.arrowsaction.MaximizeSquare
import com.chiksmedina.solar.linear.arrowsaction.MaximizeSquare2
import com.chiksmedina.solar.linear.arrowsaction.MaximizeSquare3
import com.chiksmedina.solar.linear.arrowsaction.MaximizeSquareMinimalistic
import com.chiksmedina.solar.linear.arrowsaction.Minimize
import com.chiksmedina.solar.linear.arrowsaction.MinimizeSquare
import com.chiksmedina.solar.linear.arrowsaction.MinimizeSquare2
import com.chiksmedina.solar.linear.arrowsaction.MinimizeSquare3
import com.chiksmedina.solar.linear.arrowsaction.MinimizeSquareMinimalistic
import com.chiksmedina.solar.linear.arrowsaction.ReciveSquare
import com.chiksmedina.solar.linear.arrowsaction.ReciveTwiceSquare
import com.chiksmedina.solar.linear.arrowsaction.Reorder
import com.chiksmedina.solar.linear.arrowsaction.Reply
import com.chiksmedina.solar.linear.arrowsaction.Reply2
import com.chiksmedina.solar.linear.arrowsaction.Scale
import com.chiksmedina.solar.linear.arrowsaction.ScreenShare
import com.chiksmedina.solar.linear.arrowsaction.SendSquare
import com.chiksmedina.solar.linear.arrowsaction.SendTwiceSquare
import com.chiksmedina.solar.linear.arrowsaction.SquareBottomDown
import com.chiksmedina.solar.linear.arrowsaction.SquareBottomUp
import com.chiksmedina.solar.linear.arrowsaction.SquareTopDown
import com.chiksmedina.solar.linear.arrowsaction.SquareTopUp
import com.chiksmedina.solar.linear.arrowsaction.UndoLeft
import com.chiksmedina.solar.linear.arrowsaction.UndoLeftRound
import com.chiksmedina.solar.linear.arrowsaction.UndoLeftRoundSquare
import com.chiksmedina.solar.linear.arrowsaction.UndoLeftSquare
import com.chiksmedina.solar.linear.arrowsaction.UndoRight
import com.chiksmedina.solar.linear.arrowsaction.UndoRightRound
import com.chiksmedina.solar.linear.arrowsaction.UndoRightRoundSquare
import com.chiksmedina.solar.linear.arrowsaction.UndoRightSquare
import com.chiksmedina.solar.linear.arrowsaction.Upload
import com.chiksmedina.solar.linear.arrowsaction.UploadMinimalistic
import com.chiksmedina.solar.linear.arrowsaction.UploadSquare
import com.chiksmedina.solar.linear.arrowsaction.UploadTwiceSquare
import kotlin.collections.List as KtList

object ArrowsActionGroup

val LinearSolar.ArrowsAction: ArrowsActionGroup
    get() = ArrowsActionGroup

private var _AllIcons: KtList<ImageVector>? = null

val ArrowsActionGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            ArrowToDownLeft,
            ArrowToDownRight,
            ArrowToTopLeft,
            ArrowToTopRight,
            CircleBottomDown,
            CircleBottomUp,
            CircleTopDown,
            CircleTopUp,
            Download,
            DownloadMinimalistic,
            DownloadSquare,
            DownloadTwiceSquare,
            Exit,
            Export,
            Forward,
            Forward2,
            Import,
            Login,
            Login2,
            Login3,
            Logout,
            Logout2,
            Logout3,
            Maximize,
            MaximizeSquare,
            MaximizeSquare2,
            MaximizeSquare3,
            MaximizeSquareMinimalistic,
            Minimize,
            MinimizeSquare,
            MinimizeSquare2,
            MinimizeSquare3,
            MinimizeSquareMinimalistic,
            ReciveSquare,
            ReciveTwiceSquare,
            Reorder,
            Reply,
            Reply2,
            Scale,
            ScreenShare,
            SendSquare,
            SendTwiceSquare,
            SquareBottomDown,
            SquareBottomUp,
            SquareTopDown,
            SquareTopUp,
            UndoLeft,
            UndoLeftRound,
            UndoLeftRoundSquare,
            UndoLeftSquare,
            UndoRight,
            UndoRightRound,
            UndoRightRoundSquare,
            UndoRightSquare,
            Upload,
            UploadMinimalistic,
            UploadSquare,
            UploadTwiceSquare
        )
        return _AllIcons!!
    }
