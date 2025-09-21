package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.businessstatistic.Chart
import dev.chiksmedina.solar.bold.businessstatistic.Chart2
import dev.chiksmedina.solar.bold.businessstatistic.ChartSquare
import dev.chiksmedina.solar.bold.businessstatistic.ChatSquare2
import dev.chiksmedina.solar.bold.businessstatistic.CourseDown
import dev.chiksmedina.solar.bold.businessstatistic.CourseUp
import dev.chiksmedina.solar.bold.businessstatistic.DiagramDown
import dev.chiksmedina.solar.bold.businessstatistic.DiagramUp
import dev.chiksmedina.solar.bold.businessstatistic.Graph
import dev.chiksmedina.solar.bold.businessstatistic.GraphDown
import dev.chiksmedina.solar.bold.businessstatistic.GraphDownNew
import dev.chiksmedina.solar.bold.businessstatistic.GraphNew
import dev.chiksmedina.solar.bold.businessstatistic.GraphNewUp
import dev.chiksmedina.solar.bold.businessstatistic.GraphUp
import dev.chiksmedina.solar.bold.businessstatistic.PieChart
import dev.chiksmedina.solar.bold.businessstatistic.PieChart2
import dev.chiksmedina.solar.bold.businessstatistic.PieChart3
import dev.chiksmedina.solar.bold.businessstatistic.PresentationGraph
import dev.chiksmedina.solar.bold.businessstatistic.RoundGraph
import kotlin.collections.List as KtList

object BusinessStatisticGroup

val BoldSolar.BusinessStatistic: BusinessStatisticGroup
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
