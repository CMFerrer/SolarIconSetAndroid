package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.time.Alarm
import com.chiksmedina.solar.broken.time.AlarmAdd
import com.chiksmedina.solar.broken.time.AlarmPause
import com.chiksmedina.solar.broken.time.AlarmPlay
import com.chiksmedina.solar.broken.time.AlarmRemove
import com.chiksmedina.solar.broken.time.AlarmSleep
import com.chiksmedina.solar.broken.time.AlarmTurnOff
import com.chiksmedina.solar.broken.time.Calendar
import com.chiksmedina.solar.broken.time.CalendarAdd
import com.chiksmedina.solar.broken.time.CalendarDate
import com.chiksmedina.solar.broken.time.CalendarMark
import com.chiksmedina.solar.broken.time.CalendarMinimalistic
import com.chiksmedina.solar.broken.time.CalendarSearch
import com.chiksmedina.solar.broken.time.ClockCircle
import com.chiksmedina.solar.broken.time.ClockSquare
import com.chiksmedina.solar.broken.time.History
import com.chiksmedina.solar.broken.time.History2
import com.chiksmedina.solar.broken.time.History3
import com.chiksmedina.solar.broken.time.Hourglass
import com.chiksmedina.solar.broken.time.HourglassLine
import com.chiksmedina.solar.broken.time.Stopwatch
import com.chiksmedina.solar.broken.time.StopwatchPause
import com.chiksmedina.solar.broken.time.StopwatchPlay
import com.chiksmedina.solar.broken.time.WatchRound
import com.chiksmedina.solar.broken.time.WatchSquare
import com.chiksmedina.solar.broken.time.WatchSquareMinimalistic
import com.chiksmedina.solar.broken.time.WatchSquareMinimalisticCharge
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
