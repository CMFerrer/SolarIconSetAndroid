package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.arrowsaction.ArrowToDownLeft
import dev.chiksmedina.solar.bold.arrowsaction.ArrowToDownRight
import dev.chiksmedina.solar.bold.arrowsaction.ArrowToTopLeft
import dev.chiksmedina.solar.bold.arrowsaction.ArrowToTopRight
import dev.chiksmedina.solar.bold.arrowsaction.CircleBottomDown
import dev.chiksmedina.solar.bold.arrowsaction.CircleBottomUp
import dev.chiksmedina.solar.bold.arrowsaction.CircleTopDown
import dev.chiksmedina.solar.bold.arrowsaction.CircleTopUp
import dev.chiksmedina.solar.bold.arrowsaction.Download
import dev.chiksmedina.solar.bold.arrowsaction.DownloadMinimalistic
import dev.chiksmedina.solar.bold.arrowsaction.DownloadSquare
import dev.chiksmedina.solar.bold.arrowsaction.DownloadTwiceSquare
import dev.chiksmedina.solar.bold.arrowsaction.Exit
import dev.chiksmedina.solar.bold.arrowsaction.Export
import dev.chiksmedina.solar.bold.arrowsaction.Forward
import dev.chiksmedina.solar.bold.arrowsaction.Forward2
import dev.chiksmedina.solar.bold.arrowsaction.Import
import dev.chiksmedina.solar.bold.arrowsaction.Login
import dev.chiksmedina.solar.bold.arrowsaction.Login2
import dev.chiksmedina.solar.bold.arrowsaction.Login3
import dev.chiksmedina.solar.bold.arrowsaction.Maximize
import dev.chiksmedina.solar.bold.arrowsaction.MaximizeSquare
import dev.chiksmedina.solar.bold.arrowsaction.MaximizeSquare2
import dev.chiksmedina.solar.bold.arrowsaction.MaximizeSquare3
import dev.chiksmedina.solar.bold.arrowsaction.MaximizeSquareMinimalistic
import dev.chiksmedina.solar.bold.arrowsaction.Minimize
import dev.chiksmedina.solar.bold.arrowsaction.MinimizeSquare
import dev.chiksmedina.solar.bold.arrowsaction.MinimizeSquare2
import dev.chiksmedina.solar.bold.arrowsaction.MinimizeSquare3
import dev.chiksmedina.solar.bold.arrowsaction.MinimizeSquareMinimalistic
import dev.chiksmedina.solar.bold.arrowsaction.ReciveSquare
import dev.chiksmedina.solar.bold.arrowsaction.ReciveTwiceSquare
import dev.chiksmedina.solar.bold.arrowsaction.Reorder
import dev.chiksmedina.solar.bold.arrowsaction.Reply
import dev.chiksmedina.solar.bold.arrowsaction.Reply2
import dev.chiksmedina.solar.bold.arrowsaction.Scale
import dev.chiksmedina.solar.bold.arrowsaction.ScreenShare
import dev.chiksmedina.solar.bold.arrowsaction.SendSquare
import dev.chiksmedina.solar.bold.arrowsaction.SendTwiceSquare
import dev.chiksmedina.solar.bold.arrowsaction.SquareBottomDown
import dev.chiksmedina.solar.bold.arrowsaction.SquareBottomUp
import dev.chiksmedina.solar.bold.arrowsaction.SquareTopDown
import dev.chiksmedina.solar.bold.arrowsaction.SquareTopUp
import dev.chiksmedina.solar.bold.arrowsaction.UndoLeft
import dev.chiksmedina.solar.bold.arrowsaction.UndoLeftRound
import dev.chiksmedina.solar.bold.arrowsaction.UndoLeftRoundSquare
import dev.chiksmedina.solar.bold.arrowsaction.UndoLeftSquare
import dev.chiksmedina.solar.bold.arrowsaction.UndoRight
import dev.chiksmedina.solar.bold.arrowsaction.UndoRightRound
import dev.chiksmedina.solar.bold.arrowsaction.UndoRightRoundSquare
import dev.chiksmedina.solar.bold.arrowsaction.UndoRightSquare
import dev.chiksmedina.solar.bold.arrowsaction.Upload
import dev.chiksmedina.solar.bold.arrowsaction.UploadMinimalistic
import dev.chiksmedina.solar.bold.arrowsaction.UploadSquare
import dev.chiksmedina.solar.bold.arrowsaction.UploadTwiceSquare

object ArrowsActionGroup

val BoldSolar.ArrowsAction: ArrowsActionGroup
    get() = ArrowsActionGroup

private var _AllIcons: List<ImageVector>? = null

val ArrowsActionGroup.AllIcons: List<ImageVector>
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
