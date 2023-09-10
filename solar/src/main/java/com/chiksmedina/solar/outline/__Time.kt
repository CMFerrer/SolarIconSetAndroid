package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.time.Alarm
import com.chiksmedina.solar.outline.time.AlarmAdd
import com.chiksmedina.solar.outline.time.AlarmPause
import com.chiksmedina.solar.outline.time.AlarmPlay
import com.chiksmedina.solar.outline.time.AlarmRemove
import com.chiksmedina.solar.outline.time.AlarmSleep
import com.chiksmedina.solar.outline.time.AlarmTurnOff
import com.chiksmedina.solar.outline.time.Calendar
import com.chiksmedina.solar.outline.time.CalendarAdd
import com.chiksmedina.solar.outline.time.CalendarDate
import com.chiksmedina.solar.outline.time.CalendarMark
import com.chiksmedina.solar.outline.time.CalendarMinimalistic
import com.chiksmedina.solar.outline.time.CalendarSearch
import com.chiksmedina.solar.outline.time.ClockCircle
import com.chiksmedina.solar.outline.time.ClockSquare
import com.chiksmedina.solar.outline.time.History
import com.chiksmedina.solar.outline.time.History2
import com.chiksmedina.solar.outline.time.History3
import com.chiksmedina.solar.outline.time.Hourglass
import com.chiksmedina.solar.outline.time.HourglassLine
import com.chiksmedina.solar.outline.time.Stopwatch
import com.chiksmedina.solar.outline.time.StopwatchPause
import com.chiksmedina.solar.outline.time.StopwatchPlay
import com.chiksmedina.solar.outline.time.WatchRound
import com.chiksmedina.solar.outline.time.WatchSquare
import com.chiksmedina.solar.outline.time.WatchSquareMinimalistic
import com.chiksmedina.solar.outline.time.WatchSquareMinimalisticCharge
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
