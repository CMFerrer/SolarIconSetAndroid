package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.time.Alarm
import dev.chiksmedina.solar.outline.time.AlarmAdd
import dev.chiksmedina.solar.outline.time.AlarmPause
import dev.chiksmedina.solar.outline.time.AlarmPlay
import dev.chiksmedina.solar.outline.time.AlarmRemove
import dev.chiksmedina.solar.outline.time.AlarmSleep
import dev.chiksmedina.solar.outline.time.AlarmTurnOff
import dev.chiksmedina.solar.outline.time.Calendar
import dev.chiksmedina.solar.outline.time.CalendarAdd
import dev.chiksmedina.solar.outline.time.CalendarDate
import dev.chiksmedina.solar.outline.time.CalendarMark
import dev.chiksmedina.solar.outline.time.CalendarMinimalistic
import dev.chiksmedina.solar.outline.time.CalendarSearch
import dev.chiksmedina.solar.outline.time.ClockCircle
import dev.chiksmedina.solar.outline.time.ClockSquare
import dev.chiksmedina.solar.outline.time.History
import dev.chiksmedina.solar.outline.time.History2
import dev.chiksmedina.solar.outline.time.History3
import dev.chiksmedina.solar.outline.time.Hourglass
import dev.chiksmedina.solar.outline.time.HourglassLine
import dev.chiksmedina.solar.outline.time.Stopwatch
import dev.chiksmedina.solar.outline.time.StopwatchPause
import dev.chiksmedina.solar.outline.time.StopwatchPlay
import dev.chiksmedina.solar.outline.time.WatchRound
import dev.chiksmedina.solar.outline.time.WatchSquare
import dev.chiksmedina.solar.outline.time.WatchSquareMinimalistic
import dev.chiksmedina.solar.outline.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as KtList

object TimeGroup

val OutlineSolar.Time: TimeGroup
    get() = TimeGroup

private var _AllIcons: KtList<ImageVector>? = null

val TimeGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Alarm, AlarmAdd, AlarmPause, AlarmPlay, AlarmRemove, AlarmSleep,
            AlarmTurnOff, Calendar, CalendarAdd, CalendarDate, CalendarMark, CalendarMinimalistic,
            CalendarSearch, ClockCircle, ClockSquare, History, History2, History3, Hourglass,
            HourglassLine, Stopwatch, StopwatchPause, StopwatchPlay, WatchRound, WatchSquare,
            WatchSquareMinimalistic, WatchSquareMinimalisticCharge
        )
        return _AllIcons!!
    }
