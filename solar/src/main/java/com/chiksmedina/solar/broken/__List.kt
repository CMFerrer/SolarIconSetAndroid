package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.list.Bill
import com.chiksmedina.solar.broken.list.Checklist
import com.chiksmedina.solar.broken.list.ChecklistMinimalistic
import com.chiksmedina.solar.broken.list.List
import com.chiksmedina.solar.broken.list.List1
import com.chiksmedina.solar.broken.list.ListArrowDown
import com.chiksmedina.solar.broken.list.ListArrowDownMinimalistic
import com.chiksmedina.solar.broken.list.ListArrowUp
import com.chiksmedina.solar.broken.list.ListArrowUpMinimalistic
import com.chiksmedina.solar.broken.list.ListCheck
import com.chiksmedina.solar.broken.list.ListCheckMinimalistic
import com.chiksmedina.solar.broken.list.ListCross
import com.chiksmedina.solar.broken.list.ListCrossMinimalistic
import com.chiksmedina.solar.broken.list.ListDown
import com.chiksmedina.solar.broken.list.ListDownMinimalistic
import com.chiksmedina.solar.broken.list.ListHeart
import com.chiksmedina.solar.broken.list.ListHeartMinimalistic
import com.chiksmedina.solar.broken.list.ListUp
import com.chiksmedina.solar.broken.list.ListUpMinimalistic
import com.chiksmedina.solar.broken.list.PlaaylistMinimalistic
import com.chiksmedina.solar.broken.list.Playlist
import com.chiksmedina.solar.broken.list.Playlist2
import com.chiksmedina.solar.broken.list.PlaylistMinimalistic2
import com.chiksmedina.solar.broken.list.PlaylistMinimalistic3
import com.chiksmedina.solar.broken.list.SortByAlphabet
import com.chiksmedina.solar.broken.list.SortByTime
import com.chiksmedina.solar.broken.list.SortFromBottomToTop
import com.chiksmedina.solar.broken.list.SortFromTopToBottom
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
