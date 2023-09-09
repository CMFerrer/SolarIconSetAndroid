package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.time.Alarm
import com.chiksmedina.solar.lineduotone.time.AlarmAdd
import com.chiksmedina.solar.lineduotone.time.AlarmPause
import com.chiksmedina.solar.lineduotone.time.AlarmPlay
import com.chiksmedina.solar.lineduotone.time.AlarmRemove
import com.chiksmedina.solar.lineduotone.time.AlarmSleep
import com.chiksmedina.solar.lineduotone.time.AlarmTurnOff
import com.chiksmedina.solar.lineduotone.time.Calendar
import com.chiksmedina.solar.lineduotone.time.CalendarAdd
import com.chiksmedina.solar.lineduotone.time.CalendarDate
import com.chiksmedina.solar.lineduotone.time.CalendarMark
import com.chiksmedina.solar.lineduotone.time.CalendarMinimalistic
import com.chiksmedina.solar.lineduotone.time.CalendarSearch
import com.chiksmedina.solar.lineduotone.time.ClockCircle
import com.chiksmedina.solar.lineduotone.time.ClockSquare
import com.chiksmedina.solar.lineduotone.time.History
import com.chiksmedina.solar.lineduotone.time.History2
import com.chiksmedina.solar.lineduotone.time.History3
import com.chiksmedina.solar.lineduotone.time.Hourglass
import com.chiksmedina.solar.lineduotone.time.HourglassLine
import com.chiksmedina.solar.lineduotone.time.Stopwatch
import com.chiksmedina.solar.lineduotone.time.StopwatchPause
import com.chiksmedina.solar.lineduotone.time.StopwatchPlay
import com.chiksmedina.solar.lineduotone.time.WatchRound
import com.chiksmedina.solar.lineduotone.time.WatchSquare
import com.chiksmedina.solar.lineduotone.time.WatchSquareMinimalistic
import com.chiksmedina.solar.lineduotone.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as ____KtList

public object TimeGroup

public val LineduotoneGroup.Time: TimeGroup
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
