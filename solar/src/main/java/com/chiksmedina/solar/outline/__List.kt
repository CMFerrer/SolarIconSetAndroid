package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.list.Bill
import com.chiksmedina.solar.outline.list.Checklist
import com.chiksmedina.solar.outline.list.ChecklistMinimalistic
import com.chiksmedina.solar.outline.list.List
import com.chiksmedina.solar.outline.list.ListArrowDown
import com.chiksmedina.solar.outline.list.ListArrowDownMinimalistic
import com.chiksmedina.solar.outline.list.ListArrowUp
import com.chiksmedina.solar.outline.list.ListArrowUpMinimalistic
import com.chiksmedina.solar.outline.list.ListCheck
import com.chiksmedina.solar.outline.list.ListCheckMinimalistic
import com.chiksmedina.solar.outline.list.ListCross
import com.chiksmedina.solar.outline.list.ListCrossMinimalistic
import com.chiksmedina.solar.outline.list.ListDown
import com.chiksmedina.solar.outline.list.ListDownMinimalistic
import com.chiksmedina.solar.outline.list.ListHeart
import com.chiksmedina.solar.outline.list.ListHeartMinimalistic
import com.chiksmedina.solar.outline.list.ListUp
import com.chiksmedina.solar.outline.list.ListUpMinimalistic
import com.chiksmedina.solar.outline.list.PlaaylistMinimalistic
import com.chiksmedina.solar.outline.list.Playlist
import com.chiksmedina.solar.outline.list.Playlist2
import com.chiksmedina.solar.outline.list.PlaylistMinimalistic2
import com.chiksmedina.solar.outline.list.PlaylistMinimalistic3
import com.chiksmedina.solar.outline.list.SortByAlphabet
import com.chiksmedina.solar.outline.list.SortByTime
import com.chiksmedina.solar.outline.list.SortFromBottomToTop
import com.chiksmedina.solar.outline.list.SortFromTopToBottom
import com.chiksmedina.solar.outline.list.`List-1`
import kotlin.collections.List as ____KtList

public object ListGroup

public val OutlineGroup.List: ListGroup
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
