package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.arrowsaction.ArrowToDownLeft
import dev.chiksmedina.solar.lineduotone.arrowsaction.ArrowToDownRight
import dev.chiksmedina.solar.lineduotone.arrowsaction.ArrowToTopLeft
import dev.chiksmedina.solar.lineduotone.arrowsaction.ArrowToTopRight
import dev.chiksmedina.solar.lineduotone.arrowsaction.CircleBottomDown
import dev.chiksmedina.solar.lineduotone.arrowsaction.CircleBottomUp
import dev.chiksmedina.solar.lineduotone.arrowsaction.CircleTopDown
import dev.chiksmedina.solar.lineduotone.arrowsaction.CircleTopUp
import dev.chiksmedina.solar.lineduotone.arrowsaction.Download
import dev.chiksmedina.solar.lineduotone.arrowsaction.DownloadMinimalistic
import dev.chiksmedina.solar.lineduotone.arrowsaction.DownloadSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.DownloadTwiceSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.Exit
import dev.chiksmedina.solar.lineduotone.arrowsaction.Export
import dev.chiksmedina.solar.lineduotone.arrowsaction.Forward
import dev.chiksmedina.solar.lineduotone.arrowsaction.Forward2
import dev.chiksmedina.solar.lineduotone.arrowsaction.Import
import dev.chiksmedina.solar.lineduotone.arrowsaction.Login
import dev.chiksmedina.solar.lineduotone.arrowsaction.Login2
import dev.chiksmedina.solar.lineduotone.arrowsaction.Login3
import dev.chiksmedina.solar.lineduotone.arrowsaction.Logout
import dev.chiksmedina.solar.lineduotone.arrowsaction.Logout2
import dev.chiksmedina.solar.lineduotone.arrowsaction.Logout3
import dev.chiksmedina.solar.lineduotone.arrowsaction.Maximize
import dev.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquare2
import dev.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquare3
import dev.chiksmedina.solar.lineduotone.arrowsaction.MaximizeSquareMinimalistic
import dev.chiksmedina.solar.lineduotone.arrowsaction.Minimize
import dev.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquare2
import dev.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquare3
import dev.chiksmedina.solar.lineduotone.arrowsaction.MinimizeSquareMinimalistic
import dev.chiksmedina.solar.lineduotone.arrowsaction.ReciveSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.ReciveTwiceSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.Reorder
import dev.chiksmedina.solar.lineduotone.arrowsaction.Reply
import dev.chiksmedina.solar.lineduotone.arrowsaction.Reply2
import dev.chiksmedina.solar.lineduotone.arrowsaction.Scale
import dev.chiksmedina.solar.lineduotone.arrowsaction.ScreenShare
import dev.chiksmedina.solar.lineduotone.arrowsaction.SendSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.SendTwiceSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.SquareBottomDown
import dev.chiksmedina.solar.lineduotone.arrowsaction.SquareBottomUp
import dev.chiksmedina.solar.lineduotone.arrowsaction.SquareTopDown
import dev.chiksmedina.solar.lineduotone.arrowsaction.SquareTopUp
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoLeft
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoLeftRound
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoLeftRoundSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoLeftSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoRight
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoRightRound
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoRightRoundSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.UndoRightSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.Upload
import dev.chiksmedina.solar.lineduotone.arrowsaction.UploadMinimalistic
import dev.chiksmedina.solar.lineduotone.arrowsaction.UploadSquare
import dev.chiksmedina.solar.lineduotone.arrowsaction.UploadTwiceSquare
import kotlin.collections.List as KtList

object ArrowsActionGroup

val LineDuotoneSolar.ArrowsAction: ArrowsActionGroup
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
