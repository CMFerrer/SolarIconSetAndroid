package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.arrowsaction.ArrowToDownLeft
import dev.chiksmedina.solar.broken.arrowsaction.ArrowToDownRight
import dev.chiksmedina.solar.broken.arrowsaction.ArrowToTopLeft
import dev.chiksmedina.solar.broken.arrowsaction.ArrowToTopRight
import dev.chiksmedina.solar.broken.arrowsaction.CircleBottomDown
import dev.chiksmedina.solar.broken.arrowsaction.CircleBottomUp
import dev.chiksmedina.solar.broken.arrowsaction.CircleTopDown
import dev.chiksmedina.solar.broken.arrowsaction.CircleTopUp
import dev.chiksmedina.solar.broken.arrowsaction.Download
import dev.chiksmedina.solar.broken.arrowsaction.DownloadMinimalistic
import dev.chiksmedina.solar.broken.arrowsaction.DownloadSquare
import dev.chiksmedina.solar.broken.arrowsaction.DownloadTwiceSquare
import dev.chiksmedina.solar.broken.arrowsaction.Exit
import dev.chiksmedina.solar.broken.arrowsaction.Export
import dev.chiksmedina.solar.broken.arrowsaction.Forward
import dev.chiksmedina.solar.broken.arrowsaction.Forward2
import dev.chiksmedina.solar.broken.arrowsaction.Import
import dev.chiksmedina.solar.broken.arrowsaction.Login
import dev.chiksmedina.solar.broken.arrowsaction.Login2
import dev.chiksmedina.solar.broken.arrowsaction.Login3
import dev.chiksmedina.solar.broken.arrowsaction.Logout
import dev.chiksmedina.solar.broken.arrowsaction.Logout2
import dev.chiksmedina.solar.broken.arrowsaction.Logout3
import dev.chiksmedina.solar.broken.arrowsaction.Maximize
import dev.chiksmedina.solar.broken.arrowsaction.MaximizeSquare
import dev.chiksmedina.solar.broken.arrowsaction.MaximizeSquare2
import dev.chiksmedina.solar.broken.arrowsaction.MaximizeSquare3
import dev.chiksmedina.solar.broken.arrowsaction.MaximizeSquareMinimalistic
import dev.chiksmedina.solar.broken.arrowsaction.Minimize
import dev.chiksmedina.solar.broken.arrowsaction.MinimizeSquare
import dev.chiksmedina.solar.broken.arrowsaction.MinimizeSquare2
import dev.chiksmedina.solar.broken.arrowsaction.MinimizeSquare3
import dev.chiksmedina.solar.broken.arrowsaction.MinimizeSquareMinimalistic
import dev.chiksmedina.solar.broken.arrowsaction.ReciveSquare
import dev.chiksmedina.solar.broken.arrowsaction.ReciveTwiceSquare
import dev.chiksmedina.solar.broken.arrowsaction.Reorder
import dev.chiksmedina.solar.broken.arrowsaction.Reply
import dev.chiksmedina.solar.broken.arrowsaction.Reply2
import dev.chiksmedina.solar.broken.arrowsaction.Scale
import dev.chiksmedina.solar.broken.arrowsaction.ScreenShare
import dev.chiksmedina.solar.broken.arrowsaction.SendSquare
import dev.chiksmedina.solar.broken.arrowsaction.SendTwiceSquare
import dev.chiksmedina.solar.broken.arrowsaction.SquareBottomDown
import dev.chiksmedina.solar.broken.arrowsaction.SquareBottomUp
import dev.chiksmedina.solar.broken.arrowsaction.SquareTopDown
import dev.chiksmedina.solar.broken.arrowsaction.SquareTopUp
import dev.chiksmedina.solar.broken.arrowsaction.UndoLeft
import dev.chiksmedina.solar.broken.arrowsaction.UndoLeftRound
import dev.chiksmedina.solar.broken.arrowsaction.UndoLeftRoundSquare
import dev.chiksmedina.solar.broken.arrowsaction.UndoLeftSquare
import dev.chiksmedina.solar.broken.arrowsaction.UndoRight
import dev.chiksmedina.solar.broken.arrowsaction.UndoRightRound
import dev.chiksmedina.solar.broken.arrowsaction.UndoRightRoundSquare
import dev.chiksmedina.solar.broken.arrowsaction.UndoRightSquare
import dev.chiksmedina.solar.broken.arrowsaction.Upload
import dev.chiksmedina.solar.broken.arrowsaction.UploadMinimalistic
import dev.chiksmedina.solar.broken.arrowsaction.UploadSquare
import dev.chiksmedina.solar.broken.arrowsaction.UploadTwiceSquare
import kotlin.collections.List as KtList

object ArrowsActionGroup

val BrokenSolar.ArrowsAction: ArrowsActionGroup
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
