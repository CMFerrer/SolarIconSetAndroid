package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.time.Alarm
import dev.chiksmedina.solar.bold.time.AlarmAdd
import dev.chiksmedina.solar.bold.time.AlarmPause
import dev.chiksmedina.solar.bold.time.AlarmPlay
import dev.chiksmedina.solar.bold.time.AlarmRemove
import dev.chiksmedina.solar.bold.time.AlarmSleep
import dev.chiksmedina.solar.bold.time.AlarmTurnOff
import dev.chiksmedina.solar.bold.time.Calendar
import dev.chiksmedina.solar.bold.time.CalendarAdd
import dev.chiksmedina.solar.bold.time.CalendarDate
import dev.chiksmedina.solar.bold.time.CalendarMark
import dev.chiksmedina.solar.bold.time.CalendarMinimalistic
import dev.chiksmedina.solar.bold.time.CalendarSearch
import dev.chiksmedina.solar.bold.time.ClockCircle
import dev.chiksmedina.solar.bold.time.ClockSquare
import dev.chiksmedina.solar.bold.time.History
import dev.chiksmedina.solar.bold.time.History2
import dev.chiksmedina.solar.bold.time.History3
import dev.chiksmedina.solar.bold.time.Hourglass
import dev.chiksmedina.solar.bold.time.HourglassLine
import dev.chiksmedina.solar.bold.time.Stopwatch
import dev.chiksmedina.solar.bold.time.StopwatchPause
import dev.chiksmedina.solar.bold.time.StopwatchPlay
import dev.chiksmedina.solar.bold.time.WatchRound
import dev.chiksmedina.solar.bold.time.WatchSquare
import dev.chiksmedina.solar.bold.time.WatchSquareMinimalistic
import dev.chiksmedina.solar.bold.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as KtList

object TimeGroup

val BoldSolar.Time: TimeGroup
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
