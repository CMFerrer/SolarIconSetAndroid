package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.list.Bill
import com.chiksmedina.solar.linear.list.Checklist
import com.chiksmedina.solar.linear.list.ChecklistMinimalistic
import com.chiksmedina.solar.linear.list.List
import com.chiksmedina.solar.linear.list.ListArrowDown
import com.chiksmedina.solar.linear.list.ListArrowDownMinimalistic
import com.chiksmedina.solar.linear.list.ListArrowUp
import com.chiksmedina.solar.linear.list.ListArrowUpMinimalistic
import com.chiksmedina.solar.linear.list.ListCheck
import com.chiksmedina.solar.linear.list.ListCheckMinimalistic
import com.chiksmedina.solar.linear.list.ListCross
import com.chiksmedina.solar.linear.list.ListCrossMinimalistic
import com.chiksmedina.solar.linear.list.ListDown
import com.chiksmedina.solar.linear.list.ListDownMinimalistic
import com.chiksmedina.solar.linear.list.ListHeart
import com.chiksmedina.solar.linear.list.ListHeartMinimalistic
import com.chiksmedina.solar.linear.list.ListUp
import com.chiksmedina.solar.linear.list.ListUpMinimalistic
import com.chiksmedina.solar.linear.list.PlaaylistMinimalistic
import com.chiksmedina.solar.linear.list.Playlist
import com.chiksmedina.solar.linear.list.Playlist2
import com.chiksmedina.solar.linear.list.PlaylistMinimalistic2
import com.chiksmedina.solar.linear.list.PlaylistMinimalistic3
import com.chiksmedina.solar.linear.list.SortByAlphabet
import com.chiksmedina.solar.linear.list.SortByTime
import com.chiksmedina.solar.linear.list.SortFromBottomToTop
import com.chiksmedina.solar.linear.list.SortFromTopToBottom
import com.chiksmedina.solar.linear.list.`List-1`
import kotlin.collections.List as ____KtList

public object ListGroup

public val LinearGroup.List: ListGroup
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
