package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.time.Alarm
import com.chiksmedina.solar.boldduotone.time.AlarmAdd
import com.chiksmedina.solar.boldduotone.time.AlarmPause
import com.chiksmedina.solar.boldduotone.time.AlarmPlay
import com.chiksmedina.solar.boldduotone.time.AlarmRemove
import com.chiksmedina.solar.boldduotone.time.AlarmSleep
import com.chiksmedina.solar.boldduotone.time.AlarmTurnOff
import com.chiksmedina.solar.boldduotone.time.Calendar
import com.chiksmedina.solar.boldduotone.time.CalendarAdd
import com.chiksmedina.solar.boldduotone.time.CalendarDate
import com.chiksmedina.solar.boldduotone.time.CalendarMark
import com.chiksmedina.solar.boldduotone.time.CalendarMinimalistic
import com.chiksmedina.solar.boldduotone.time.CalendarSearch
import com.chiksmedina.solar.boldduotone.time.ClockCircle
import com.chiksmedina.solar.boldduotone.time.ClockSquare
import com.chiksmedina.solar.boldduotone.time.History
import com.chiksmedina.solar.boldduotone.time.History2
import com.chiksmedina.solar.boldduotone.time.History3
import com.chiksmedina.solar.boldduotone.time.Hourglass
import com.chiksmedina.solar.boldduotone.time.HourglassLine
import com.chiksmedina.solar.boldduotone.time.Stopwatch
import com.chiksmedina.solar.boldduotone.time.StopwatchPause
import com.chiksmedina.solar.boldduotone.time.StopwatchPlay
import com.chiksmedina.solar.boldduotone.time.WatchRound
import com.chiksmedina.solar.boldduotone.time.WatchSquare
import com.chiksmedina.solar.boldduotone.time.WatchSquareMinimalistic
import com.chiksmedina.solar.boldduotone.time.WatchSquareMinimalisticCharge
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
