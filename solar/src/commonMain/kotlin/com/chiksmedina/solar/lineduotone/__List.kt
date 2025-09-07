package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.list.Bill
import com.chiksmedina.solar.lineduotone.list.Checklist
import com.chiksmedina.solar.lineduotone.list.ChecklistMinimalistic
import com.chiksmedina.solar.lineduotone.list.List
import com.chiksmedina.solar.lineduotone.list.List1
import com.chiksmedina.solar.lineduotone.list.ListArrowDown
import com.chiksmedina.solar.lineduotone.list.ListArrowDownMinimalistic
import com.chiksmedina.solar.lineduotone.list.ListArrowUp
import com.chiksmedina.solar.lineduotone.list.ListArrowUpMinimalistic
import com.chiksmedina.solar.lineduotone.list.ListCheck
import com.chiksmedina.solar.lineduotone.list.ListCheckMinimalistic
import com.chiksmedina.solar.lineduotone.list.ListCross
import com.chiksmedina.solar.lineduotone.list.ListCrossMinimalistic
import com.chiksmedina.solar.lineduotone.list.ListDown
import com.chiksmedina.solar.lineduotone.list.ListDownMinimalistic
import com.chiksmedina.solar.lineduotone.list.ListHeart
import com.chiksmedina.solar.lineduotone.list.ListHeartMinimalistic
import com.chiksmedina.solar.lineduotone.list.ListUp
import com.chiksmedina.solar.lineduotone.list.ListUpMinimalistic
import com.chiksmedina.solar.lineduotone.list.PlaaylistMinimalistic
import com.chiksmedina.solar.lineduotone.list.Playlist
import com.chiksmedina.solar.lineduotone.list.Playlist2
import com.chiksmedina.solar.lineduotone.list.PlaylistMinimalistic2
import com.chiksmedina.solar.lineduotone.list.PlaylistMinimalistic3
import com.chiksmedina.solar.lineduotone.list.SortByAlphabet
import com.chiksmedina.solar.lineduotone.list.SortByTime
import com.chiksmedina.solar.lineduotone.list.SortFromBottomToTop
import com.chiksmedina.solar.lineduotone.list.SortFromTopToBottom
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
