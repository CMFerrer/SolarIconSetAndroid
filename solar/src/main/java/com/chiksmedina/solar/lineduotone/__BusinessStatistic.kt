package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.businessstatistic.Chart
import com.chiksmedina.solar.lineduotone.businessstatistic.Chart2
import com.chiksmedina.solar.lineduotone.businessstatistic.ChartSquare
import com.chiksmedina.solar.lineduotone.businessstatistic.ChatSquare2
import com.chiksmedina.solar.lineduotone.businessstatistic.CourseDown
import com.chiksmedina.solar.lineduotone.businessstatistic.CourseUp
import com.chiksmedina.solar.lineduotone.businessstatistic.DiagramDown
import com.chiksmedina.solar.lineduotone.businessstatistic.DiagramUp
import com.chiksmedina.solar.lineduotone.businessstatistic.Graph
import com.chiksmedina.solar.lineduotone.businessstatistic.GraphDown
import com.chiksmedina.solar.lineduotone.businessstatistic.GraphDownNew
import com.chiksmedina.solar.lineduotone.businessstatistic.GraphNew
import com.chiksmedina.solar.lineduotone.businessstatistic.GraphNewUp
import com.chiksmedina.solar.lineduotone.businessstatistic.GraphUp
import com.chiksmedina.solar.lineduotone.businessstatistic.PieChart
import com.chiksmedina.solar.lineduotone.businessstatistic.PieChart2
import com.chiksmedina.solar.lineduotone.businessstatistic.PieChart3
import com.chiksmedina.solar.lineduotone.businessstatistic.PresentationGraph
import com.chiksmedina.solar.lineduotone.businessstatistic.RoundGraph
import kotlin.collections.List as KtList

object BusinessStatisticGroup

val LineDuotoneSolar.BusinessStatistic: BusinessStatisticGroup
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
