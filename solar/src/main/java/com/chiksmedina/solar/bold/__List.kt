package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.list.Bill
import com.chiksmedina.solar.bold.list.Checklist
import com.chiksmedina.solar.bold.list.ChecklistMinimalistic
import com.chiksmedina.solar.bold.list.List
import com.chiksmedina.solar.bold.list.ListArrowDown
import com.chiksmedina.solar.bold.list.ListArrowDownMinimalistic
import com.chiksmedina.solar.bold.list.ListArrowUp
import com.chiksmedina.solar.bold.list.ListArrowUpMinimalistic
import com.chiksmedina.solar.bold.list.ListCheck
import com.chiksmedina.solar.bold.list.ListCheckMinimalistic
import com.chiksmedina.solar.bold.list.ListCross
import com.chiksmedina.solar.bold.list.ListCrossMinimalistic
import com.chiksmedina.solar.bold.list.ListDown
import com.chiksmedina.solar.bold.list.ListDownMinimalistic
import com.chiksmedina.solar.bold.list.ListHeart
import com.chiksmedina.solar.bold.list.ListHeartMinimalistic
import com.chiksmedina.solar.bold.list.ListUp
import com.chiksmedina.solar.bold.list.ListUpMinimalistic
import com.chiksmedina.solar.bold.list.PlaaylistMinimalistic
import com.chiksmedina.solar.bold.list.Playlist
import com.chiksmedina.solar.bold.list.Playlist2
import com.chiksmedina.solar.bold.list.PlaylistMinimalistic2
import com.chiksmedina.solar.bold.list.PlaylistMinimalistic3
import com.chiksmedina.solar.bold.list.SortByAlphabet
import com.chiksmedina.solar.bold.list.SortByTime
import com.chiksmedina.solar.bold.list.SortFromBottomToTop
import com.chiksmedina.solar.bold.list.SortFromTopToBottom
import com.chiksmedina.solar.bold.list.`List-1`
import kotlin.collections.List as ____KtList

public object ListGroup

public val BoldGroup.List: ListGroup
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
