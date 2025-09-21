package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.businessstatistic.Chart
import dev.chiksmedina.solar.lineduotone.businessstatistic.Chart2
import dev.chiksmedina.solar.lineduotone.businessstatistic.ChartSquare
import dev.chiksmedina.solar.lineduotone.businessstatistic.ChatSquare2
import dev.chiksmedina.solar.lineduotone.businessstatistic.CourseDown
import dev.chiksmedina.solar.lineduotone.businessstatistic.CourseUp
import dev.chiksmedina.solar.lineduotone.businessstatistic.DiagramDown
import dev.chiksmedina.solar.lineduotone.businessstatistic.DiagramUp
import dev.chiksmedina.solar.lineduotone.businessstatistic.Graph
import dev.chiksmedina.solar.lineduotone.businessstatistic.GraphDown
import dev.chiksmedina.solar.lineduotone.businessstatistic.GraphDownNew
import dev.chiksmedina.solar.lineduotone.businessstatistic.GraphNew
import dev.chiksmedina.solar.lineduotone.businessstatistic.GraphNewUp
import dev.chiksmedina.solar.lineduotone.businessstatistic.GraphUp
import dev.chiksmedina.solar.lineduotone.businessstatistic.PieChart
import dev.chiksmedina.solar.lineduotone.businessstatistic.PieChart2
import dev.chiksmedina.solar.lineduotone.businessstatistic.PieChart3
import dev.chiksmedina.solar.lineduotone.businessstatistic.PresentationGraph
import dev.chiksmedina.solar.lineduotone.businessstatistic.RoundGraph
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
