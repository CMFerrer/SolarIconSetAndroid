package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.businessstatistic.Chart
import com.chiksmedina.solar.linear.businessstatistic.Chart2
import com.chiksmedina.solar.linear.businessstatistic.ChartSquare
import com.chiksmedina.solar.linear.businessstatistic.ChatSquare2
import com.chiksmedina.solar.linear.businessstatistic.CourseDown
import com.chiksmedina.solar.linear.businessstatistic.CourseUp
import com.chiksmedina.solar.linear.businessstatistic.DiagramDown
import com.chiksmedina.solar.linear.businessstatistic.DiagramUp
import com.chiksmedina.solar.linear.businessstatistic.Graph
import com.chiksmedina.solar.linear.businessstatistic.GraphDown
import com.chiksmedina.solar.linear.businessstatistic.GraphDownNew
import com.chiksmedina.solar.linear.businessstatistic.GraphNew
import com.chiksmedina.solar.linear.businessstatistic.GraphNewUp
import com.chiksmedina.solar.linear.businessstatistic.GraphUp
import com.chiksmedina.solar.linear.businessstatistic.PieChart
import com.chiksmedina.solar.linear.businessstatistic.PieChart2
import com.chiksmedina.solar.linear.businessstatistic.PieChart3
import com.chiksmedina.solar.linear.businessstatistic.PresentationGraph
import com.chiksmedina.solar.linear.businessstatistic.RoundGraph
import kotlin.collections.List as ____KtList

public object BusinessStatisticGroup

public val LinearGroup.BusinessStatistic: BusinessStatisticGroup
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
