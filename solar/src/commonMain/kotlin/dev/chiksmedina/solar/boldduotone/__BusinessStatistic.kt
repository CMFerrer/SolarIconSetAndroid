package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.businessstatistic.Chart
import dev.chiksmedina.solar.boldduotone.businessstatistic.Chart2
import dev.chiksmedina.solar.boldduotone.businessstatistic.ChartSquare
import dev.chiksmedina.solar.boldduotone.businessstatistic.ChatSquare2
import dev.chiksmedina.solar.boldduotone.businessstatistic.CourseDown
import dev.chiksmedina.solar.boldduotone.businessstatistic.CourseUp
import dev.chiksmedina.solar.boldduotone.businessstatistic.DiagramDown
import dev.chiksmedina.solar.boldduotone.businessstatistic.DiagramUp
import dev.chiksmedina.solar.boldduotone.businessstatistic.Graph
import dev.chiksmedina.solar.boldduotone.businessstatistic.GraphDown
import dev.chiksmedina.solar.boldduotone.businessstatistic.GraphDownNew
import dev.chiksmedina.solar.boldduotone.businessstatistic.GraphNew
import dev.chiksmedina.solar.boldduotone.businessstatistic.GraphNewUp
import dev.chiksmedina.solar.boldduotone.businessstatistic.GraphUp
import dev.chiksmedina.solar.boldduotone.businessstatistic.PieChart
import dev.chiksmedina.solar.boldduotone.businessstatistic.PieChart2
import dev.chiksmedina.solar.boldduotone.businessstatistic.PieChart3
import dev.chiksmedina.solar.boldduotone.businessstatistic.PresentationGraph
import dev.chiksmedina.solar.boldduotone.businessstatistic.RoundGraph
import kotlin.collections.List as KtList

object BusinessStatisticGroup

val BoldDuotoneSolar.BusinessStatistic: BusinessStatisticGroup
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
