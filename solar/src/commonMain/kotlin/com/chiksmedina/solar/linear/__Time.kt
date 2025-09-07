package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.time.Alarm
import com.chiksmedina.solar.linear.time.AlarmAdd
import com.chiksmedina.solar.linear.time.AlarmPause
import com.chiksmedina.solar.linear.time.AlarmPlay
import com.chiksmedina.solar.linear.time.AlarmRemove
import com.chiksmedina.solar.linear.time.AlarmSleep
import com.chiksmedina.solar.linear.time.AlarmTurnOff
import com.chiksmedina.solar.linear.time.Calendar
import com.chiksmedina.solar.linear.time.CalendarAdd
import com.chiksmedina.solar.linear.time.CalendarDate
import com.chiksmedina.solar.linear.time.CalendarMark
import com.chiksmedina.solar.linear.time.CalendarMinimalistic
import com.chiksmedina.solar.linear.time.CalendarSearch
import com.chiksmedina.solar.linear.time.ClockCircle
import com.chiksmedina.solar.linear.time.ClockSquare
import com.chiksmedina.solar.linear.time.History
import com.chiksmedina.solar.linear.time.History2
import com.chiksmedina.solar.linear.time.History3
import com.chiksmedina.solar.linear.time.Hourglass
import com.chiksmedina.solar.linear.time.HourglassLine
import com.chiksmedina.solar.linear.time.Stopwatch
import com.chiksmedina.solar.linear.time.StopwatchPause
import com.chiksmedina.solar.linear.time.StopwatchPlay
import com.chiksmedina.solar.linear.time.WatchRound
import com.chiksmedina.solar.linear.time.WatchSquare
import com.chiksmedina.solar.linear.time.WatchSquareMinimalistic
import com.chiksmedina.solar.linear.time.WatchSquareMinimalisticCharge
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
