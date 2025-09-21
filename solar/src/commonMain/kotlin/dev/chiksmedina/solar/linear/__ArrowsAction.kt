package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.arrowsaction.ArrowToDownLeft
import dev.chiksmedina.solar.linear.arrowsaction.ArrowToDownRight
import dev.chiksmedina.solar.linear.arrowsaction.ArrowToTopLeft
import dev.chiksmedina.solar.linear.arrowsaction.ArrowToTopRight
import dev.chiksmedina.solar.linear.arrowsaction.CircleBottomDown
import dev.chiksmedina.solar.linear.arrowsaction.CircleBottomUp
import dev.chiksmedina.solar.linear.arrowsaction.CircleTopDown
import dev.chiksmedina.solar.linear.arrowsaction.CircleTopUp
import dev.chiksmedina.solar.linear.arrowsaction.Download
import dev.chiksmedina.solar.linear.arrowsaction.DownloadMinimalistic
import dev.chiksmedina.solar.linear.arrowsaction.DownloadSquare
import dev.chiksmedina.solar.linear.arrowsaction.DownloadTwiceSquare
import dev.chiksmedina.solar.linear.arrowsaction.Exit
import dev.chiksmedina.solar.linear.arrowsaction.Export
import dev.chiksmedina.solar.linear.arrowsaction.Forward
import dev.chiksmedina.solar.linear.arrowsaction.Forward2
import dev.chiksmedina.solar.linear.arrowsaction.Import
import dev.chiksmedina.solar.linear.arrowsaction.Login
import dev.chiksmedina.solar.linear.arrowsaction.Login2
import dev.chiksmedina.solar.linear.arrowsaction.Login3
import dev.chiksmedina.solar.linear.arrowsaction.Logout
import dev.chiksmedina.solar.linear.arrowsaction.Logout2
import dev.chiksmedina.solar.linear.arrowsaction.Logout3
import dev.chiksmedina.solar.linear.arrowsaction.Maximize
import dev.chiksmedina.solar.linear.arrowsaction.MaximizeSquare
import dev.chiksmedina.solar.linear.arrowsaction.MaximizeSquare2
import dev.chiksmedina.solar.linear.arrowsaction.MaximizeSquare3
import dev.chiksmedina.solar.linear.arrowsaction.MaximizeSquareMinimalistic
import dev.chiksmedina.solar.linear.arrowsaction.Minimize
import dev.chiksmedina.solar.linear.arrowsaction.MinimizeSquare
import dev.chiksmedina.solar.linear.arrowsaction.MinimizeSquare2
import dev.chiksmedina.solar.linear.arrowsaction.MinimizeSquare3
import dev.chiksmedina.solar.linear.arrowsaction.MinimizeSquareMinimalistic
import dev.chiksmedina.solar.linear.arrowsaction.ReciveSquare
import dev.chiksmedina.solar.linear.arrowsaction.ReciveTwiceSquare
import dev.chiksmedina.solar.linear.arrowsaction.Reorder
import dev.chiksmedina.solar.linear.arrowsaction.Reply
import dev.chiksmedina.solar.linear.arrowsaction.Reply2
import dev.chiksmedina.solar.linear.arrowsaction.Scale
import dev.chiksmedina.solar.linear.arrowsaction.ScreenShare
import dev.chiksmedina.solar.linear.arrowsaction.SendSquare
import dev.chiksmedina.solar.linear.arrowsaction.SendTwiceSquare
import dev.chiksmedina.solar.linear.arrowsaction.SquareBottomDown
import dev.chiksmedina.solar.linear.arrowsaction.SquareBottomUp
import dev.chiksmedina.solar.linear.arrowsaction.SquareTopDown
import dev.chiksmedina.solar.linear.arrowsaction.SquareTopUp
import dev.chiksmedina.solar.linear.arrowsaction.UndoLeft
import dev.chiksmedina.solar.linear.arrowsaction.UndoLeftRound
import dev.chiksmedina.solar.linear.arrowsaction.UndoLeftRoundSquare
import dev.chiksmedina.solar.linear.arrowsaction.UndoLeftSquare
import dev.chiksmedina.solar.linear.arrowsaction.UndoRight
import dev.chiksmedina.solar.linear.arrowsaction.UndoRightRound
import dev.chiksmedina.solar.linear.arrowsaction.UndoRightRoundSquare
import dev.chiksmedina.solar.linear.arrowsaction.UndoRightSquare
import dev.chiksmedina.solar.linear.arrowsaction.Upload
import dev.chiksmedina.solar.linear.arrowsaction.UploadMinimalistic
import dev.chiksmedina.solar.linear.arrowsaction.UploadSquare
import dev.chiksmedina.solar.linear.arrowsaction.UploadTwiceSquare
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
