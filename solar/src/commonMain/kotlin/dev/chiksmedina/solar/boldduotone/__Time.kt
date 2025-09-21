package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.time.Alarm
import dev.chiksmedina.solar.boldduotone.time.AlarmAdd
import dev.chiksmedina.solar.boldduotone.time.AlarmPause
import dev.chiksmedina.solar.boldduotone.time.AlarmPlay
import dev.chiksmedina.solar.boldduotone.time.AlarmRemove
import dev.chiksmedina.solar.boldduotone.time.AlarmSleep
import dev.chiksmedina.solar.boldduotone.time.AlarmTurnOff
import dev.chiksmedina.solar.boldduotone.time.Calendar
import dev.chiksmedina.solar.boldduotone.time.CalendarAdd
import dev.chiksmedina.solar.boldduotone.time.CalendarDate
import dev.chiksmedina.solar.boldduotone.time.CalendarMark
import dev.chiksmedina.solar.boldduotone.time.CalendarMinimalistic
import dev.chiksmedina.solar.boldduotone.time.CalendarSearch
import dev.chiksmedina.solar.boldduotone.time.ClockCircle
import dev.chiksmedina.solar.boldduotone.time.ClockSquare
import dev.chiksmedina.solar.boldduotone.time.History
import dev.chiksmedina.solar.boldduotone.time.History2
import dev.chiksmedina.solar.boldduotone.time.History3
import dev.chiksmedina.solar.boldduotone.time.Hourglass
import dev.chiksmedina.solar.boldduotone.time.HourglassLine
import dev.chiksmedina.solar.boldduotone.time.Stopwatch
import dev.chiksmedina.solar.boldduotone.time.StopwatchPause
import dev.chiksmedina.solar.boldduotone.time.StopwatchPlay
import dev.chiksmedina.solar.boldduotone.time.WatchRound
import dev.chiksmedina.solar.boldduotone.time.WatchSquare
import dev.chiksmedina.solar.boldduotone.time.WatchSquareMinimalistic
import dev.chiksmedina.solar.boldduotone.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as KtList

object TimeGroup

val BoldDuotoneSolar.Time: TimeGroup
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
