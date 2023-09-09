package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.time.Alarm
import com.chiksmedina.solar.bold.time.AlarmAdd
import com.chiksmedina.solar.bold.time.AlarmPause
import com.chiksmedina.solar.bold.time.AlarmPlay
import com.chiksmedina.solar.bold.time.AlarmRemove
import com.chiksmedina.solar.bold.time.AlarmSleep
import com.chiksmedina.solar.bold.time.AlarmTurnOff
import com.chiksmedina.solar.bold.time.Calendar
import com.chiksmedina.solar.bold.time.CalendarAdd
import com.chiksmedina.solar.bold.time.CalendarDate
import com.chiksmedina.solar.bold.time.CalendarMark
import com.chiksmedina.solar.bold.time.CalendarMinimalistic
import com.chiksmedina.solar.bold.time.CalendarSearch
import com.chiksmedina.solar.bold.time.ClockCircle
import com.chiksmedina.solar.bold.time.ClockSquare
import com.chiksmedina.solar.bold.time.History
import com.chiksmedina.solar.bold.time.History2
import com.chiksmedina.solar.bold.time.History3
import com.chiksmedina.solar.bold.time.Hourglass
import com.chiksmedina.solar.bold.time.HourglassLine
import com.chiksmedina.solar.bold.time.Stopwatch
import com.chiksmedina.solar.bold.time.StopwatchPause
import com.chiksmedina.solar.bold.time.StopwatchPlay
import com.chiksmedina.solar.bold.time.WatchRound
import com.chiksmedina.solar.bold.time.WatchSquare
import com.chiksmedina.solar.bold.time.WatchSquareMinimalistic
import com.chiksmedina.solar.bold.time.WatchSquareMinimalisticCharge
import kotlin.collections.List as ____KtList

public object TimeGroup

public val BoldGroup.Time: TimeGroup
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
