package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.list.Bill
import dev.chiksmedina.solar.outline.list.Checklist
import dev.chiksmedina.solar.outline.list.ChecklistMinimalistic
import dev.chiksmedina.solar.outline.list.List
import dev.chiksmedina.solar.outline.list.List1
import dev.chiksmedina.solar.outline.list.ListArrowDown
import dev.chiksmedina.solar.outline.list.ListArrowDownMinimalistic
import dev.chiksmedina.solar.outline.list.ListArrowUp
import dev.chiksmedina.solar.outline.list.ListArrowUpMinimalistic
import dev.chiksmedina.solar.outline.list.ListCheck
import dev.chiksmedina.solar.outline.list.ListCheckMinimalistic
import dev.chiksmedina.solar.outline.list.ListCross
import dev.chiksmedina.solar.outline.list.ListCrossMinimalistic
import dev.chiksmedina.solar.outline.list.ListDown
import dev.chiksmedina.solar.outline.list.ListDownMinimalistic
import dev.chiksmedina.solar.outline.list.ListHeart
import dev.chiksmedina.solar.outline.list.ListHeartMinimalistic
import dev.chiksmedina.solar.outline.list.ListUp
import dev.chiksmedina.solar.outline.list.ListUpMinimalistic
import dev.chiksmedina.solar.outline.list.PlaaylistMinimalistic
import dev.chiksmedina.solar.outline.list.Playlist
import dev.chiksmedina.solar.outline.list.Playlist2
import dev.chiksmedina.solar.outline.list.PlaylistMinimalistic2
import dev.chiksmedina.solar.outline.list.PlaylistMinimalistic3
import dev.chiksmedina.solar.outline.list.SortByAlphabet
import dev.chiksmedina.solar.outline.list.SortByTime
import dev.chiksmedina.solar.outline.list.SortFromBottomToTop
import dev.chiksmedina.solar.outline.list.SortFromTopToBottom
import kotlin.collections.List as KtList

object ListGroup

val OutlineSolar.List: ListGroup
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
