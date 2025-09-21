package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.businessstatistic.Chart
import dev.chiksmedina.solar.outline.businessstatistic.Chart2
import dev.chiksmedina.solar.outline.businessstatistic.ChartSquare
import dev.chiksmedina.solar.outline.businessstatistic.ChatSquare2
import dev.chiksmedina.solar.outline.businessstatistic.CourseDown
import dev.chiksmedina.solar.outline.businessstatistic.CourseUp
import dev.chiksmedina.solar.outline.businessstatistic.DiagramDown
import dev.chiksmedina.solar.outline.businessstatistic.DiagramUp
import dev.chiksmedina.solar.outline.businessstatistic.Graph
import dev.chiksmedina.solar.outline.businessstatistic.GraphDown
import dev.chiksmedina.solar.outline.businessstatistic.GraphDownNew
import dev.chiksmedina.solar.outline.businessstatistic.GraphNew
import dev.chiksmedina.solar.outline.businessstatistic.GraphNewUp
import dev.chiksmedina.solar.outline.businessstatistic.GraphUp
import dev.chiksmedina.solar.outline.businessstatistic.PieChart
import dev.chiksmedina.solar.outline.businessstatistic.PieChart2
import dev.chiksmedina.solar.outline.businessstatistic.PieChart3
import dev.chiksmedina.solar.outline.businessstatistic.PresentationGraph
import dev.chiksmedina.solar.outline.businessstatistic.RoundGraph
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
