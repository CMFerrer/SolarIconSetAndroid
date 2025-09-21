package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.list.Bill
import dev.chiksmedina.solar.linear.list.Checklist
import dev.chiksmedina.solar.linear.list.ChecklistMinimalistic
import dev.chiksmedina.solar.linear.list.List
import dev.chiksmedina.solar.linear.list.List1
import dev.chiksmedina.solar.linear.list.ListArrowDown
import dev.chiksmedina.solar.linear.list.ListArrowDownMinimalistic
import dev.chiksmedina.solar.linear.list.ListArrowUp
import dev.chiksmedina.solar.linear.list.ListArrowUpMinimalistic
import dev.chiksmedina.solar.linear.list.ListCheck
import dev.chiksmedina.solar.linear.list.ListCheckMinimalistic
import dev.chiksmedina.solar.linear.list.ListCross
import dev.chiksmedina.solar.linear.list.ListCrossMinimalistic
import dev.chiksmedina.solar.linear.list.ListDown
import dev.chiksmedina.solar.linear.list.ListDownMinimalistic
import dev.chiksmedina.solar.linear.list.ListHeart
import dev.chiksmedina.solar.linear.list.ListHeartMinimalistic
import dev.chiksmedina.solar.linear.list.ListUp
import dev.chiksmedina.solar.linear.list.ListUpMinimalistic
import dev.chiksmedina.solar.linear.list.PlaaylistMinimalistic
import dev.chiksmedina.solar.linear.list.Playlist
import dev.chiksmedina.solar.linear.list.Playlist2
import dev.chiksmedina.solar.linear.list.PlaylistMinimalistic2
import dev.chiksmedina.solar.linear.list.PlaylistMinimalistic3
import dev.chiksmedina.solar.linear.list.SortByAlphabet
import dev.chiksmedina.solar.linear.list.SortByTime
import dev.chiksmedina.solar.linear.list.SortFromBottomToTop
import dev.chiksmedina.solar.linear.list.SortFromTopToBottom
import kotlin.collections.List as KtList

object ListGroup

val LinearSolar.List: ListGroup
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
