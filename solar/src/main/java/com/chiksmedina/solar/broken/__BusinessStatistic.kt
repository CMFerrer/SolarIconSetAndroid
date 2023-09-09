package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.businessstatistic.Chart
import com.chiksmedina.solar.broken.businessstatistic.Chart2
import com.chiksmedina.solar.broken.businessstatistic.ChartSquare
import com.chiksmedina.solar.broken.businessstatistic.ChatSquare2
import com.chiksmedina.solar.broken.businessstatistic.CourseDown
import com.chiksmedina.solar.broken.businessstatistic.CourseUp
import com.chiksmedina.solar.broken.businessstatistic.DiagramDown
import com.chiksmedina.solar.broken.businessstatistic.DiagramUp
import com.chiksmedina.solar.broken.businessstatistic.Graph
import com.chiksmedina.solar.broken.businessstatistic.GraphDown
import com.chiksmedina.solar.broken.businessstatistic.GraphDownNew
import com.chiksmedina.solar.broken.businessstatistic.GraphNew
import com.chiksmedina.solar.broken.businessstatistic.GraphNewUp
import com.chiksmedina.solar.broken.businessstatistic.GraphUp
import com.chiksmedina.solar.broken.businessstatistic.PieChart
import com.chiksmedina.solar.broken.businessstatistic.PieChart2
import com.chiksmedina.solar.broken.businessstatistic.PieChart3
import com.chiksmedina.solar.broken.businessstatistic.PresentationGraph
import com.chiksmedina.solar.broken.businessstatistic.RoundGraph
import kotlin.collections.List as ____KtList

public object BusinessStatisticGroup

public val BrokenGroup.BusinessStatistic: BusinessStatisticGroup
  get() = BusinessStatisticGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BusinessStatisticGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Chart, Chart2, ChartSquare, ChatSquare2, CourseDown, CourseUp, DiagramDown,
        DiagramUp, Graph, GraphDown, GraphDownNew, GraphNew, GraphNewUp, GraphUp, PieChart,
        PieChart2, PieChart3, PresentationGraph, RoundGraph)
    return __AllIcons!!
  }
