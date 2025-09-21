package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.arrowsaction.ArrowToDownLeft
import dev.chiksmedina.solar.outline.arrowsaction.ArrowToDownRight
import dev.chiksmedina.solar.outline.arrowsaction.ArrowToTopLeft
import dev.chiksmedina.solar.outline.arrowsaction.ArrowToTopRight
import dev.chiksmedina.solar.outline.arrowsaction.CircleBottomDown
import dev.chiksmedina.solar.outline.arrowsaction.CircleBottomUp
import dev.chiksmedina.solar.outline.arrowsaction.CircleTopDown
import dev.chiksmedina.solar.outline.arrowsaction.CircleTopUp
import dev.chiksmedina.solar.outline.arrowsaction.Download
import dev.chiksmedina.solar.outline.arrowsaction.DownloadMinimalistic
import dev.chiksmedina.solar.outline.arrowsaction.DownloadSquare
import dev.chiksmedina.solar.outline.arrowsaction.DownloadTwiceSquare
import dev.chiksmedina.solar.outline.arrowsaction.Exit
import dev.chiksmedina.solar.outline.arrowsaction.Export
import dev.chiksmedina.solar.outline.arrowsaction.Forward
import dev.chiksmedina.solar.outline.arrowsaction.Forward2
import dev.chiksmedina.solar.outline.arrowsaction.Import
import dev.chiksmedina.solar.outline.arrowsaction.Login
import dev.chiksmedina.solar.outline.arrowsaction.Login2
import dev.chiksmedina.solar.outline.arrowsaction.Login3
import dev.chiksmedina.solar.outline.arrowsaction.Logout
import dev.chiksmedina.solar.outline.arrowsaction.Logout2
import dev.chiksmedina.solar.outline.arrowsaction.Logout3
import dev.chiksmedina.solar.outline.arrowsaction.Maximize
import dev.chiksmedina.solar.outline.arrowsaction.MaximizeSquare
import dev.chiksmedina.solar.outline.arrowsaction.MaximizeSquare2
import dev.chiksmedina.solar.outline.arrowsaction.MaximizeSquare3
import dev.chiksmedina.solar.outline.arrowsaction.MaximizeSquareMinimalistic
import dev.chiksmedina.solar.outline.arrowsaction.Minimize
import dev.chiksmedina.solar.outline.arrowsaction.MinimizeSquare
import dev.chiksmedina.solar.outline.arrowsaction.MinimizeSquare2
import dev.chiksmedina.solar.outline.arrowsaction.MinimizeSquare3
import dev.chiksmedina.solar.outline.arrowsaction.MinimizeSquareMinimalistic
import dev.chiksmedina.solar.outline.arrowsaction.ReciveSquare
import dev.chiksmedina.solar.outline.arrowsaction.ReciveTwiceSquare
import dev.chiksmedina.solar.outline.arrowsaction.Reorder
import dev.chiksmedina.solar.outline.arrowsaction.Reply
import dev.chiksmedina.solar.outline.arrowsaction.Reply2
import dev.chiksmedina.solar.outline.arrowsaction.Scale
import dev.chiksmedina.solar.outline.arrowsaction.ScreenShare
import dev.chiksmedina.solar.outline.arrowsaction.SendSquare
import dev.chiksmedina.solar.outline.arrowsaction.SendTwiceSquare
import dev.chiksmedina.solar.outline.arrowsaction.SquareBottomDown
import dev.chiksmedina.solar.outline.arrowsaction.SquareBottomUp
import dev.chiksmedina.solar.outline.arrowsaction.SquareTopDown
import dev.chiksmedina.solar.outline.arrowsaction.SquareTopUp
import dev.chiksmedina.solar.outline.arrowsaction.UndoLeft
import dev.chiksmedina.solar.outline.arrowsaction.UndoLeftRound
import dev.chiksmedina.solar.outline.arrowsaction.UndoLeftRoundSquare
import dev.chiksmedina.solar.outline.arrowsaction.UndoLeftSquare
import dev.chiksmedina.solar.outline.arrowsaction.UndoRight
import dev.chiksmedina.solar.outline.arrowsaction.UndoRightRound
import dev.chiksmedina.solar.outline.arrowsaction.UndoRightRoundSquare
import dev.chiksmedina.solar.outline.arrowsaction.UndoRightSquare
import dev.chiksmedina.solar.outline.arrowsaction.Upload
import dev.chiksmedina.solar.outline.arrowsaction.UploadMinimalistic
import dev.chiksmedina.solar.outline.arrowsaction.UploadSquare
import dev.chiksmedina.solar.outline.arrowsaction.UploadTwiceSquare
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
