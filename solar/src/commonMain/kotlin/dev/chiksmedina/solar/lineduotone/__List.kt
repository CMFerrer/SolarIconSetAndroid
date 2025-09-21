package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.list.Bill
import dev.chiksmedina.solar.lineduotone.list.Checklist
import dev.chiksmedina.solar.lineduotone.list.ChecklistMinimalistic
import dev.chiksmedina.solar.lineduotone.list.List
import dev.chiksmedina.solar.lineduotone.list.List1
import dev.chiksmedina.solar.lineduotone.list.ListArrowDown
import dev.chiksmedina.solar.lineduotone.list.ListArrowDownMinimalistic
import dev.chiksmedina.solar.lineduotone.list.ListArrowUp
import dev.chiksmedina.solar.lineduotone.list.ListArrowUpMinimalistic
import dev.chiksmedina.solar.lineduotone.list.ListCheck
import dev.chiksmedina.solar.lineduotone.list.ListCheckMinimalistic
import dev.chiksmedina.solar.lineduotone.list.ListCross
import dev.chiksmedina.solar.lineduotone.list.ListCrossMinimalistic
import dev.chiksmedina.solar.lineduotone.list.ListDown
import dev.chiksmedina.solar.lineduotone.list.ListDownMinimalistic
import dev.chiksmedina.solar.lineduotone.list.ListHeart
import dev.chiksmedina.solar.lineduotone.list.ListHeartMinimalistic
import dev.chiksmedina.solar.lineduotone.list.ListUp
import dev.chiksmedina.solar.lineduotone.list.ListUpMinimalistic
import dev.chiksmedina.solar.lineduotone.list.PlaaylistMinimalistic
import dev.chiksmedina.solar.lineduotone.list.Playlist
import dev.chiksmedina.solar.lineduotone.list.Playlist2
import dev.chiksmedina.solar.lineduotone.list.PlaylistMinimalistic2
import dev.chiksmedina.solar.lineduotone.list.PlaylistMinimalistic3
import dev.chiksmedina.solar.lineduotone.list.SortByAlphabet
import dev.chiksmedina.solar.lineduotone.list.SortByTime
import dev.chiksmedina.solar.lineduotone.list.SortFromBottomToTop
import dev.chiksmedina.solar.lineduotone.list.SortFromTopToBottom
import kotlin.collections.List as KtList

object ListGroup

val LineDuotoneSolar.List: ListGroup
    get() = ListGroup

private var _AllIcons: KtList<ImageVector>? = null

val ListGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bill, Checklist, ChecklistMinimalistic, List1, List, ListArrowDown,
            ListArrowDownMinimalistic, ListArrowUp, ListArrowUpMinimalistic, ListCheck,
            ListCheckMinimalistic, ListCross, ListCrossMinimalistic, ListDown, ListDownMinimalistic,
            ListHeart, ListHeartMinimalistic, ListUp, ListUpMinimalistic, PlaaylistMinimalistic,
            Playlist, Playlist2, PlaylistMinimalistic2, PlaylistMinimalistic3, SortByAlphabet,
            SortByTime, SortFromBottomToTop, SortFromTopToBottom
        )
        return _AllIcons!!
    }
