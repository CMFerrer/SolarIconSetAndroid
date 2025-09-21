package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.time.Alarm
import dev.chiksmedina.solar.broken.time.AlarmAdd
import dev.chiksmedina.solar.broken.time.AlarmPause
import dev.chiksmedina.solar.broken.time.AlarmPlay
import dev.chiksmedina.solar.broken.time.AlarmRemove
import dev.chiksmedina.solar.broken.time.AlarmSleep
import dev.chiksmedina.solar.broken.time.AlarmTurnOff
import dev.chiksmedina.solar.broken.time.Calendar
import dev.chiksmedina.solar.broken.time.CalendarAdd
import dev.chiksmedina.solar.broken.time.CalendarDate
import dev.chiksmedina.solar.broken.time.CalendarMark
import dev.chiksmedina.solar.broken.time.CalendarMinimalistic
import dev.chiksmedina.solar.broken.time.CalendarSearch
import dev.chiksmedina.solar.broken.time.ClockCircle
import dev.chiksmedina.solar.broken.time.ClockSquare
import dev.chiksmedina.solar.broken.time.History
import dev.chiksmedina.solar.broken.time.History2
import dev.chiksmedina.solar.broken.time.History3
import dev.chiksmedina.solar.broken.time.Hourglass
import dev.chiksmedina.solar.broken.time.HourglassLine
import dev.chiksmedina.solar.broken.time.Stopwatch
import dev.chiksmedina.solar.broken.time.StopwatchPause
import dev.chiksmedina.solar.broken.time.StopwatchPlay
import dev.chiksmedina.solar.broken.time.WatchRound
import dev.chiksmedina.solar.broken.time.WatchSquare
import dev.chiksmedina.solar.broken.time.WatchSquareMinimalistic
import dev.chiksmedina.solar.broken.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as KtList

object TimeGroup

val BrokenSolar.Time: TimeGroup
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
