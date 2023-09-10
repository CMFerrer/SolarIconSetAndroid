package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.businessstatistic.Chart
import com.chiksmedina.solar.outline.businessstatistic.Chart2
import com.chiksmedina.solar.outline.businessstatistic.ChartSquare
import com.chiksmedina.solar.outline.businessstatistic.ChatSquare2
import com.chiksmedina.solar.outline.businessstatistic.CourseDown
import com.chiksmedina.solar.outline.businessstatistic.CourseUp
import com.chiksmedina.solar.outline.businessstatistic.DiagramDown
import com.chiksmedina.solar.outline.businessstatistic.DiagramUp
import com.chiksmedina.solar.outline.businessstatistic.Graph
import com.chiksmedina.solar.outline.businessstatistic.GraphDown
import com.chiksmedina.solar.outline.businessstatistic.GraphDownNew
import com.chiksmedina.solar.outline.businessstatistic.GraphNew
import com.chiksmedina.solar.outline.businessstatistic.GraphNewUp
import com.chiksmedina.solar.outline.businessstatistic.GraphUp
import com.chiksmedina.solar.outline.businessstatistic.PieChart
import com.chiksmedina.solar.outline.businessstatistic.PieChart2
import com.chiksmedina.solar.outline.businessstatistic.PieChart3
import com.chiksmedina.solar.outline.businessstatistic.PresentationGraph
import com.chiksmedina.solar.outline.businessstatistic.RoundGraph
import kotlin.collections.List as KtList

object BusinessStatisticGroup

val OutlineSolar.BusinessStatistic: BusinessStatisticGroup
    get() = BusinessStatisticGroup

private var _AllIcons: KtList<ImageVector>? = null

val BusinessStatisticGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Chart, Chart2, ChartSquare, ChatSquare2, CourseDown, CourseUp, DiagramDown,
            DiagramUp, Graph, GraphDown, GraphDownNew, GraphNew, GraphNewUp, GraphUp, PieChart,
            PieChart2, PieChart3, PresentationGraph, RoundGraph
        )
        return _AllIcons!!
    }
