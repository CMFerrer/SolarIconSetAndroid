package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
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
import kotlin.collections.List as ____KtList

public object TimeGroup

public val OutlineGroup.Time: TimeGroup
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
