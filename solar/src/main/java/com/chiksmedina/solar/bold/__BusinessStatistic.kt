package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.businessstatistic.Chart
import com.chiksmedina.solar.bold.businessstatistic.Chart2
import com.chiksmedina.solar.bold.businessstatistic.ChartSquare
import com.chiksmedina.solar.bold.businessstatistic.ChatSquare2
import com.chiksmedina.solar.bold.businessstatistic.CourseDown
import com.chiksmedina.solar.bold.businessstatistic.CourseUp
import com.chiksmedina.solar.bold.businessstatistic.DiagramDown
import com.chiksmedina.solar.bold.businessstatistic.DiagramUp
import com.chiksmedina.solar.bold.businessstatistic.Graph
import com.chiksmedina.solar.bold.businessstatistic.GraphDown
import com.chiksmedina.solar.bold.businessstatistic.GraphDownNew
import com.chiksmedina.solar.bold.businessstatistic.GraphNew
import com.chiksmedina.solar.bold.businessstatistic.GraphNewUp
import com.chiksmedina.solar.bold.businessstatistic.GraphUp
import com.chiksmedina.solar.bold.businessstatistic.PieChart
import com.chiksmedina.solar.bold.businessstatistic.PieChart2
import com.chiksmedina.solar.bold.businessstatistic.PieChart3
import com.chiksmedina.solar.bold.businessstatistic.PresentationGraph
import com.chiksmedina.solar.bold.businessstatistic.RoundGraph
import kotlin.collections.List as ____KtList

public object BusinessStatisticGroup

public val BoldGroup.BusinessStatistic: BusinessStatisticGroup
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
