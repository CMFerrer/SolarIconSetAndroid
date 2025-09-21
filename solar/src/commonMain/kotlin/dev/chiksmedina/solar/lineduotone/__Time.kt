package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.time.Alarm
import dev.chiksmedina.solar.lineduotone.time.AlarmAdd
import dev.chiksmedina.solar.lineduotone.time.AlarmPause
import dev.chiksmedina.solar.lineduotone.time.AlarmPlay
import dev.chiksmedina.solar.lineduotone.time.AlarmRemove
import dev.chiksmedina.solar.lineduotone.time.AlarmSleep
import dev.chiksmedina.solar.lineduotone.time.AlarmTurnOff
import dev.chiksmedina.solar.lineduotone.time.Calendar
import dev.chiksmedina.solar.lineduotone.time.CalendarAdd
import dev.chiksmedina.solar.lineduotone.time.CalendarDate
import dev.chiksmedina.solar.lineduotone.time.CalendarMark
import dev.chiksmedina.solar.lineduotone.time.CalendarMinimalistic
import dev.chiksmedina.solar.lineduotone.time.CalendarSearch
import dev.chiksmedina.solar.lineduotone.time.ClockCircle
import dev.chiksmedina.solar.lineduotone.time.ClockSquare
import dev.chiksmedina.solar.lineduotone.time.History
import dev.chiksmedina.solar.lineduotone.time.History2
import dev.chiksmedina.solar.lineduotone.time.History3
import dev.chiksmedina.solar.lineduotone.time.Hourglass
import dev.chiksmedina.solar.lineduotone.time.HourglassLine
import dev.chiksmedina.solar.lineduotone.time.Stopwatch
import dev.chiksmedina.solar.lineduotone.time.StopwatchPause
import dev.chiksmedina.solar.lineduotone.time.StopwatchPlay
import dev.chiksmedina.solar.lineduotone.time.WatchRound
import dev.chiksmedina.solar.lineduotone.time.WatchSquare
import dev.chiksmedina.solar.lineduotone.time.WatchSquareMinimalistic
import dev.chiksmedina.solar.lineduotone.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as KtList

object TimeGroup

val LineDuotoneSolar.Time: TimeGroup
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
