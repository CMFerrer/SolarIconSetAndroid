package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.list.Bill
import dev.chiksmedina.solar.broken.list.Checklist
import dev.chiksmedina.solar.broken.list.ChecklistMinimalistic
import dev.chiksmedina.solar.broken.list.List
import dev.chiksmedina.solar.broken.list.List1
import dev.chiksmedina.solar.broken.list.ListArrowDown
import dev.chiksmedina.solar.broken.list.ListArrowDownMinimalistic
import dev.chiksmedina.solar.broken.list.ListArrowUp
import dev.chiksmedina.solar.broken.list.ListArrowUpMinimalistic
import dev.chiksmedina.solar.broken.list.ListCheck
import dev.chiksmedina.solar.broken.list.ListCheckMinimalistic
import dev.chiksmedina.solar.broken.list.ListCross
import dev.chiksmedina.solar.broken.list.ListCrossMinimalistic
import dev.chiksmedina.solar.broken.list.ListDown
import dev.chiksmedina.solar.broken.list.ListDownMinimalistic
import dev.chiksmedina.solar.broken.list.ListHeart
import dev.chiksmedina.solar.broken.list.ListHeartMinimalistic
import dev.chiksmedina.solar.broken.list.ListUp
import dev.chiksmedina.solar.broken.list.ListUpMinimalistic
import dev.chiksmedina.solar.broken.list.PlaaylistMinimalistic
import dev.chiksmedina.solar.broken.list.Playlist
import dev.chiksmedina.solar.broken.list.Playlist2
import dev.chiksmedina.solar.broken.list.PlaylistMinimalistic2
import dev.chiksmedina.solar.broken.list.PlaylistMinimalistic3
import dev.chiksmedina.solar.broken.list.SortByAlphabet
import dev.chiksmedina.solar.broken.list.SortByTime
import dev.chiksmedina.solar.broken.list.SortFromBottomToTop
import dev.chiksmedina.solar.broken.list.SortFromTopToBottom
import kotlin.collections.List as KtList

object ListGroup

val BrokenSolar.List: ListGroup
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
