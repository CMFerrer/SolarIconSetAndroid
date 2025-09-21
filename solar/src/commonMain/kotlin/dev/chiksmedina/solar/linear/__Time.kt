package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.time.Alarm
import dev.chiksmedina.solar.linear.time.AlarmAdd
import dev.chiksmedina.solar.linear.time.AlarmPause
import dev.chiksmedina.solar.linear.time.AlarmPlay
import dev.chiksmedina.solar.linear.time.AlarmRemove
import dev.chiksmedina.solar.linear.time.AlarmSleep
import dev.chiksmedina.solar.linear.time.AlarmTurnOff
import dev.chiksmedina.solar.linear.time.Calendar
import dev.chiksmedina.solar.linear.time.CalendarAdd
import dev.chiksmedina.solar.linear.time.CalendarDate
import dev.chiksmedina.solar.linear.time.CalendarMark
import dev.chiksmedina.solar.linear.time.CalendarMinimalistic
import dev.chiksmedina.solar.linear.time.CalendarSearch
import dev.chiksmedina.solar.linear.time.ClockCircle
import dev.chiksmedina.solar.linear.time.ClockSquare
import dev.chiksmedina.solar.linear.time.History
import dev.chiksmedina.solar.linear.time.History2
import dev.chiksmedina.solar.linear.time.History3
import dev.chiksmedina.solar.linear.time.Hourglass
import dev.chiksmedina.solar.linear.time.HourglassLine
import dev.chiksmedina.solar.linear.time.Stopwatch
import dev.chiksmedina.solar.linear.time.StopwatchPause
import dev.chiksmedina.solar.linear.time.StopwatchPlay
import dev.chiksmedina.solar.linear.time.WatchRound
import dev.chiksmedina.solar.linear.time.WatchSquare
import dev.chiksmedina.solar.linear.time.WatchSquareMinimalistic
import dev.chiksmedina.solar.linear.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as KtList

object TimeGroup

val LinearSolar.Time: TimeGroup
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
