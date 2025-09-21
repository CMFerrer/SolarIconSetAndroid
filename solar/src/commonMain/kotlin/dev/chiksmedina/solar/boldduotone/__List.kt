package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.list.Bill
import dev.chiksmedina.solar.boldduotone.list.Checklist
import dev.chiksmedina.solar.boldduotone.list.ChecklistMinimalistic
import dev.chiksmedina.solar.boldduotone.list.List
import dev.chiksmedina.solar.boldduotone.list.List1
import dev.chiksmedina.solar.boldduotone.list.ListArrowDown
import dev.chiksmedina.solar.boldduotone.list.ListArrowDownMinimalistic
import dev.chiksmedina.solar.boldduotone.list.ListArrowUp
import dev.chiksmedina.solar.boldduotone.list.ListArrowUpMinimalistic
import dev.chiksmedina.solar.boldduotone.list.ListCheck
import dev.chiksmedina.solar.boldduotone.list.ListCheckMinimalistic
import dev.chiksmedina.solar.boldduotone.list.ListCross
import dev.chiksmedina.solar.boldduotone.list.ListCrossMinimalistic
import dev.chiksmedina.solar.boldduotone.list.ListDown
import dev.chiksmedina.solar.boldduotone.list.ListDownMinimalistic
import dev.chiksmedina.solar.boldduotone.list.ListHeart
import dev.chiksmedina.solar.boldduotone.list.ListHeartMinimalistic
import dev.chiksmedina.solar.boldduotone.list.ListUp
import dev.chiksmedina.solar.boldduotone.list.ListUpMinimalistic
import dev.chiksmedina.solar.boldduotone.list.PlaaylistMinimalistic
import dev.chiksmedina.solar.boldduotone.list.Playlist
import dev.chiksmedina.solar.boldduotone.list.Playlist2
import dev.chiksmedina.solar.boldduotone.list.PlaylistMinimalistic2
import dev.chiksmedina.solar.boldduotone.list.PlaylistMinimalistic3
import dev.chiksmedina.solar.boldduotone.list.SortByAlphabet
import dev.chiksmedina.solar.boldduotone.list.SortByTime
import dev.chiksmedina.solar.boldduotone.list.SortFromBottomToTop
import dev.chiksmedina.solar.boldduotone.list.SortFromTopToBottom
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
