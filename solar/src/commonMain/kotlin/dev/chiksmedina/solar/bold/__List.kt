package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.list.Bill
import dev.chiksmedina.solar.bold.list.Checklist
import dev.chiksmedina.solar.bold.list.ChecklistMinimalistic
import dev.chiksmedina.solar.bold.list.List
import dev.chiksmedina.solar.bold.list.List1
import dev.chiksmedina.solar.bold.list.ListArrowDown
import dev.chiksmedina.solar.bold.list.ListArrowDownMinimalistic
import dev.chiksmedina.solar.bold.list.ListArrowUp
import dev.chiksmedina.solar.bold.list.ListArrowUpMinimalistic
import dev.chiksmedina.solar.bold.list.ListCheck
import dev.chiksmedina.solar.bold.list.ListCheckMinimalistic
import dev.chiksmedina.solar.bold.list.ListCross
import dev.chiksmedina.solar.bold.list.ListCrossMinimalistic
import dev.chiksmedina.solar.bold.list.ListDown
import dev.chiksmedina.solar.bold.list.ListDownMinimalistic
import dev.chiksmedina.solar.bold.list.ListHeart
import dev.chiksmedina.solar.bold.list.ListHeartMinimalistic
import dev.chiksmedina.solar.bold.list.ListUp
import dev.chiksmedina.solar.bold.list.ListUpMinimalistic
import dev.chiksmedina.solar.bold.list.PlaaylistMinimalistic
import dev.chiksmedina.solar.bold.list.Playlist
import dev.chiksmedina.solar.bold.list.Playlist2
import dev.chiksmedina.solar.bold.list.PlaylistMinimalistic2
import dev.chiksmedina.solar.bold.list.PlaylistMinimalistic3
import dev.chiksmedina.solar.bold.list.SortByAlphabet
import dev.chiksmedina.solar.bold.list.SortByTime
import dev.chiksmedina.solar.bold.list.SortFromBottomToTop
import dev.chiksmedina.solar.bold.list.SortFromTopToBottom
import kotlin.collections.List as KtList

object ListGroup

val BoldSolar.List: ListGroup
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
