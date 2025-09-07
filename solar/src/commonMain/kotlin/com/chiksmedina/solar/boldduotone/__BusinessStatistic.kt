package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.businessstatistic.Chart
import com.chiksmedina.solar.boldduotone.businessstatistic.Chart2
import com.chiksmedina.solar.boldduotone.businessstatistic.ChartSquare
import com.chiksmedina.solar.boldduotone.businessstatistic.ChatSquare2
import com.chiksmedina.solar.boldduotone.businessstatistic.CourseDown
import com.chiksmedina.solar.boldduotone.businessstatistic.CourseUp
import com.chiksmedina.solar.boldduotone.businessstatistic.DiagramDown
import com.chiksmedina.solar.boldduotone.businessstatistic.DiagramUp
import com.chiksmedina.solar.boldduotone.businessstatistic.Graph
import com.chiksmedina.solar.boldduotone.businessstatistic.GraphDown
import com.chiksmedina.solar.boldduotone.businessstatistic.GraphDownNew
import com.chiksmedina.solar.boldduotone.businessstatistic.GraphNew
import com.chiksmedina.solar.boldduotone.businessstatistic.GraphNewUp
import com.chiksmedina.solar.boldduotone.businessstatistic.GraphUp
import com.chiksmedina.solar.boldduotone.businessstatistic.PieChart
import com.chiksmedina.solar.boldduotone.businessstatistic.PieChart2
import com.chiksmedina.solar.boldduotone.businessstatistic.PieChart3
import com.chiksmedina.solar.boldduotone.businessstatistic.PresentationGraph
import com.chiksmedina.solar.boldduotone.businessstatistic.RoundGraph
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
