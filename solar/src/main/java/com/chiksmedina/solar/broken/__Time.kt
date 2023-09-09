package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
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
import kotlin.collections.List as ____KtList

public object TimeGroup

public val BrokenGroup.Time: TimeGroup
  get() = TimeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val TimeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Alarm, AlarmAdd, AlarmPause, AlarmPlay, AlarmRemove, AlarmSleep,
        AlarmTurnOff, Calendar, CalendarAdd, CalendarDate, CalendarMark, CalendarMinimalistic,
        CalendarSearch, ClockCircle, ClockSquare, History, History2, History3, Hourglass,
        HourglassLine, Stopwatch, StopwatchPause, StopwatchPlay, WatchRound, WatchSquare,
        WatchSquareMinimalistic, WatchSquareMinimalisticCharge)
    return __AllIcons!!
  }
