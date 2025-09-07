package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.arrowsaction.ArrowToDownLeft
import com.chiksmedina.solar.outline.arrowsaction.ArrowToDownRight
import com.chiksmedina.solar.outline.arrowsaction.ArrowToTopLeft
import com.chiksmedina.solar.outline.arrowsaction.ArrowToTopRight
import com.chiksmedina.solar.outline.arrowsaction.CircleBottomDown
import com.chiksmedina.solar.outline.arrowsaction.CircleBottomUp
import com.chiksmedina.solar.outline.arrowsaction.CircleTopDown
import com.chiksmedina.solar.outline.arrowsaction.CircleTopUp
import com.chiksmedina.solar.outline.arrowsaction.Download
import com.chiksmedina.solar.outline.arrowsaction.DownloadMinimalistic
import com.chiksmedina.solar.outline.arrowsaction.DownloadSquare
import com.chiksmedina.solar.outline.arrowsaction.DownloadTwiceSquare
import com.chiksmedina.solar.outline.arrowsaction.Exit
import com.chiksmedina.solar.outline.arrowsaction.Export
import com.chiksmedina.solar.outline.arrowsaction.Forward
import com.chiksmedina.solar.outline.arrowsaction.Forward2
import com.chiksmedina.solar.outline.arrowsaction.Import
import com.chiksmedina.solar.outline.arrowsaction.Login
import com.chiksmedina.solar.outline.arrowsaction.Login2
import com.chiksmedina.solar.outline.arrowsaction.Login3
import com.chiksmedina.solar.outline.arrowsaction.Logout
import com.chiksmedina.solar.outline.arrowsaction.Logout2
import com.chiksmedina.solar.outline.arrowsaction.Logout3
import com.chiksmedina.solar.outline.arrowsaction.Maximize
import com.chiksmedina.solar.outline.arrowsaction.MaximizeSquare
import com.chiksmedina.solar.outline.arrowsaction.MaximizeSquare2
import com.chiksmedina.solar.outline.arrowsaction.MaximizeSquare3
import com.chiksmedina.solar.outline.arrowsaction.MaximizeSquareMinimalistic
import com.chiksmedina.solar.outline.arrowsaction.Minimize
import com.chiksmedina.solar.outline.arrowsaction.MinimizeSquare
import com.chiksmedina.solar.outline.arrowsaction.MinimizeSquare2
import com.chiksmedina.solar.outline.arrowsaction.MinimizeSquare3
import com.chiksmedina.solar.outline.arrowsaction.MinimizeSquareMinimalistic
import com.chiksmedina.solar.outline.arrowsaction.ReciveSquare
import com.chiksmedina.solar.outline.arrowsaction.ReciveTwiceSquare
import com.chiksmedina.solar.outline.arrowsaction.Reorder
import com.chiksmedina.solar.outline.arrowsaction.Reply
import com.chiksmedina.solar.outline.arrowsaction.Reply2
import com.chiksmedina.solar.outline.arrowsaction.Scale
import com.chiksmedina.solar.outline.arrowsaction.ScreenShare
import com.chiksmedina.solar.outline.arrowsaction.SendSquare
import com.chiksmedina.solar.outline.arrowsaction.SendTwiceSquare
import com.chiksmedina.solar.outline.arrowsaction.SquareBottomDown
import com.chiksmedina.solar.outline.arrowsaction.SquareBottomUp
import com.chiksmedina.solar.outline.arrowsaction.SquareTopDown
import com.chiksmedina.solar.outline.arrowsaction.SquareTopUp
import com.chiksmedina.solar.outline.arrowsaction.UndoLeft
import com.chiksmedina.solar.outline.arrowsaction.UndoLeftRound
import com.chiksmedina.solar.outline.arrowsaction.UndoLeftRoundSquare
import com.chiksmedina.solar.outline.arrowsaction.UndoLeftSquare
import com.chiksmedina.solar.outline.arrowsaction.UndoRight
import com.chiksmedina.solar.outline.arrowsaction.UndoRightRound
import com.chiksmedina.solar.outline.arrowsaction.UndoRightRoundSquare
import com.chiksmedina.solar.outline.arrowsaction.UndoRightSquare
import com.chiksmedina.solar.outline.arrowsaction.Upload
import com.chiksmedina.solar.outline.arrowsaction.UploadMinimalistic
import com.chiksmedina.solar.outline.arrowsaction.UploadSquare
import com.chiksmedina.solar.outline.arrowsaction.UploadTwiceSquare
import kotlin.collections.List as KtList

object ArrowsActionGroup

val OutlineSolar.ArrowsAction: ArrowsActionGroup
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
