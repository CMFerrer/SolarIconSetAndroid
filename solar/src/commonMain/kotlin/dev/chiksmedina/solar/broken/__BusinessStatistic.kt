package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.businessstatistic.Chart
import dev.chiksmedina.solar.broken.businessstatistic.Chart2
import dev.chiksmedina.solar.broken.businessstatistic.ChartSquare
import dev.chiksmedina.solar.broken.businessstatistic.ChatSquare2
import dev.chiksmedina.solar.broken.businessstatistic.CourseDown
import dev.chiksmedina.solar.broken.businessstatistic.CourseUp
import dev.chiksmedina.solar.broken.businessstatistic.DiagramDown
import dev.chiksmedina.solar.broken.businessstatistic.DiagramUp
import dev.chiksmedina.solar.broken.businessstatistic.Graph
import dev.chiksmedina.solar.broken.businessstatistic.GraphDown
import dev.chiksmedina.solar.broken.businessstatistic.GraphDownNew
import dev.chiksmedina.solar.broken.businessstatistic.GraphNew
import dev.chiksmedina.solar.broken.businessstatistic.GraphNewUp
import dev.chiksmedina.solar.broken.businessstatistic.GraphUp
import dev.chiksmedina.solar.broken.businessstatistic.PieChart
import dev.chiksmedina.solar.broken.businessstatistic.PieChart2
import dev.chiksmedina.solar.broken.businessstatistic.PieChart3
import dev.chiksmedina.solar.broken.businessstatistic.PresentationGraph
import dev.chiksmedina.solar.broken.businessstatistic.RoundGraph
import kotlin.collections.List as KtList

object BusinessStatisticGroup

val BrokenSolar.BusinessStatistic: BusinessStatisticGroup
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
