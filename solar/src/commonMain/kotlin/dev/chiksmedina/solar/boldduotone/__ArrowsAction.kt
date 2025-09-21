package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.arrowsaction.ArrowToDownLeft
import dev.chiksmedina.solar.boldduotone.arrowsaction.ArrowToDownRight
import dev.chiksmedina.solar.boldduotone.arrowsaction.ArrowToTopLeft
import dev.chiksmedina.solar.boldduotone.arrowsaction.ArrowToTopRight
import dev.chiksmedina.solar.boldduotone.arrowsaction.CircleBottomDown
import dev.chiksmedina.solar.boldduotone.arrowsaction.CircleBottomUp
import dev.chiksmedina.solar.boldduotone.arrowsaction.CircleTopDown
import dev.chiksmedina.solar.boldduotone.arrowsaction.CircleTopUp
import dev.chiksmedina.solar.boldduotone.arrowsaction.Download
import dev.chiksmedina.solar.boldduotone.arrowsaction.DownloadMinimalistic
import dev.chiksmedina.solar.boldduotone.arrowsaction.DownloadSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.DownloadTwiceSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.Exit
import dev.chiksmedina.solar.boldduotone.arrowsaction.Export
import dev.chiksmedina.solar.boldduotone.arrowsaction.Forward
import dev.chiksmedina.solar.boldduotone.arrowsaction.Forward2
import dev.chiksmedina.solar.boldduotone.arrowsaction.Import
import dev.chiksmedina.solar.boldduotone.arrowsaction.Login
import dev.chiksmedina.solar.boldduotone.arrowsaction.Login2
import dev.chiksmedina.solar.boldduotone.arrowsaction.Login3
import dev.chiksmedina.solar.boldduotone.arrowsaction.Logout
import dev.chiksmedina.solar.boldduotone.arrowsaction.Logout2
import dev.chiksmedina.solar.boldduotone.arrowsaction.Logout3
import dev.chiksmedina.solar.boldduotone.arrowsaction.Maximize
import dev.chiksmedina.solar.boldduotone.arrowsaction.MaximizeSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.MaximizeSquare2
import dev.chiksmedina.solar.boldduotone.arrowsaction.MaximizeSquare3
import dev.chiksmedina.solar.boldduotone.arrowsaction.MaximizeSquareMinimalistic
import dev.chiksmedina.solar.boldduotone.arrowsaction.Minimize
import dev.chiksmedina.solar.boldduotone.arrowsaction.MinimizeSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.MinimizeSquare2
import dev.chiksmedina.solar.boldduotone.arrowsaction.MinimizeSquare3
import dev.chiksmedina.solar.boldduotone.arrowsaction.MinimizeSquareMinimalistic
import dev.chiksmedina.solar.boldduotone.arrowsaction.ReciveSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.ReciveTwiceSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.Reorder
import dev.chiksmedina.solar.boldduotone.arrowsaction.Reply
import dev.chiksmedina.solar.boldduotone.arrowsaction.Reply2
import dev.chiksmedina.solar.boldduotone.arrowsaction.Scale
import dev.chiksmedina.solar.boldduotone.arrowsaction.ScreenShare
import dev.chiksmedina.solar.boldduotone.arrowsaction.SendSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.SendTwiceSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.SquareBottomDown
import dev.chiksmedina.solar.boldduotone.arrowsaction.SquareBottomUp
import dev.chiksmedina.solar.boldduotone.arrowsaction.SquareTopDown
import dev.chiksmedina.solar.boldduotone.arrowsaction.SquareTopUp
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoLeft
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoLeftRound
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoLeftRoundSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoLeftSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoRight
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoRightRound
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoRightRoundSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.UndoRightSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.Upload
import dev.chiksmedina.solar.boldduotone.arrowsaction.UploadMinimalistic
import dev.chiksmedina.solar.boldduotone.arrowsaction.UploadSquare
import dev.chiksmedina.solar.boldduotone.arrowsaction.UploadTwiceSquare
import kotlin.collections.List as KtList

object ArrowsActionGroup

val BoldDuotoneSolar.ArrowsAction: ArrowsActionGroup
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
