package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.list.Bill
import com.chiksmedina.solar.lineduotone.list.Checklist
import com.chiksmedina.solar.lineduotone.list.ChecklistMinimalistic
import com.chiksmedina.solar.lineduotone.list.List
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
import com.chiksmedina.solar.lineduotone.list.`List-1`
import kotlin.collections.List as ____KtList

public object ListGroup

public val LineduotoneGroup.List: ListGroup
  get() = ListGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val ListGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bill, Checklist, ChecklistMinimalistic, `List-1`, List, ListArrowDown,
        ListArrowDownMinimalistic, ListArrowUp, ListArrowUpMinimalistic, ListCheck,
        ListCheckMinimalistic, ListCross, ListCrossMinimalistic, ListDown, ListDownMinimalistic,
        ListHeart, ListHeartMinimalistic, ListUp, ListUpMinimalistic, PlaaylistMinimalistic,
        Playlist, Playlist2, PlaylistMinimalistic2, PlaylistMinimalistic3, SortByAlphabet,
        SortByTime, SortFromBottomToTop, SortFromTopToBottom)
    return __AllIcons!!
  }
