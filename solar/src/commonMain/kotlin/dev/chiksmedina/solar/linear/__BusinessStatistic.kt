package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.businessstatistic.Chart
import dev.chiksmedina.solar.linear.businessstatistic.Chart2
import dev.chiksmedina.solar.linear.businessstatistic.ChartSquare
import dev.chiksmedina.solar.linear.businessstatistic.ChatSquare2
import dev.chiksmedina.solar.linear.businessstatistic.CourseDown
import dev.chiksmedina.solar.linear.businessstatistic.CourseUp
import dev.chiksmedina.solar.linear.businessstatistic.DiagramDown
import dev.chiksmedina.solar.linear.businessstatistic.DiagramUp
import dev.chiksmedina.solar.linear.businessstatistic.Graph
import dev.chiksmedina.solar.linear.businessstatistic.GraphDown
import dev.chiksmedina.solar.linear.businessstatistic.GraphDownNew
import dev.chiksmedina.solar.linear.businessstatistic.GraphNew
import dev.chiksmedina.solar.linear.businessstatistic.GraphNewUp
import dev.chiksmedina.solar.linear.businessstatistic.GraphUp
import dev.chiksmedina.solar.linear.businessstatistic.PieChart
import dev.chiksmedina.solar.linear.businessstatistic.PieChart2
import dev.chiksmedina.solar.linear.businessstatistic.PieChart3
import dev.chiksmedina.solar.linear.businessstatistic.PresentationGraph
import dev.chiksmedina.solar.linear.businessstatistic.RoundGraph
import kotlin.collections.List as KtList

object BusinessStatisticGroup

val LinearSolar.BusinessStatistic: BusinessStatisticGroup
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
