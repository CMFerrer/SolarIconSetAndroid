package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.list.Bill
import com.chiksmedina.solar.boldduotone.list.Checklist
import com.chiksmedina.solar.boldduotone.list.ChecklistMinimalistic
import com.chiksmedina.solar.boldduotone.list.List
import com.chiksmedina.solar.boldduotone.list.List1
import com.chiksmedina.solar.boldduotone.list.ListArrowDown
import com.chiksmedina.solar.boldduotone.list.ListArrowDownMinimalistic
import com.chiksmedina.solar.boldduotone.list.ListArrowUp
import com.chiksmedina.solar.boldduotone.list.ListArrowUpMinimalistic
import com.chiksmedina.solar.boldduotone.list.ListCheck
import com.chiksmedina.solar.boldduotone.list.ListCheckMinimalistic
import com.chiksmedina.solar.boldduotone.list.ListCross
import com.chiksmedina.solar.boldduotone.list.ListCrossMinimalistic
import com.chiksmedina.solar.boldduotone.list.ListDown
import com.chiksmedina.solar.boldduotone.list.ListDownMinimalistic
import com.chiksmedina.solar.boldduotone.list.ListHeart
import com.chiksmedina.solar.boldduotone.list.ListHeartMinimalistic
import com.chiksmedina.solar.boldduotone.list.ListUp
import com.chiksmedina.solar.boldduotone.list.ListUpMinimalistic
import com.chiksmedina.solar.boldduotone.list.PlaaylistMinimalistic
import com.chiksmedina.solar.boldduotone.list.Playlist
import com.chiksmedina.solar.boldduotone.list.Playlist2
import com.chiksmedina.solar.boldduotone.list.PlaylistMinimalistic2
import com.chiksmedina.solar.boldduotone.list.PlaylistMinimalistic3
import com.chiksmedina.solar.boldduotone.list.SortByAlphabet
import com.chiksmedina.solar.boldduotone.list.SortByTime
import com.chiksmedina.solar.boldduotone.list.SortFromBottomToTop
import com.chiksmedina.solar.boldduotone.list.SortFromTopToBottom
import kotlin.collections.List as KtList

object ListGroup

val BoldDuotoneSolar.List: ListGroup
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
