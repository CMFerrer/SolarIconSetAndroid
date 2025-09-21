package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.buildinginfrastructure.Buildings
import dev.chiksmedina.solar.linear.buildinginfrastructure.Buildings2
import dev.chiksmedina.solar.linear.buildinginfrastructure.Buildings3
import dev.chiksmedina.solar.linear.buildinginfrastructure.City
import dev.chiksmedina.solar.linear.buildinginfrastructure.Garage
import dev.chiksmedina.solar.linear.buildinginfrastructure.Home
import dev.chiksmedina.solar.linear.buildinginfrastructure.Hospital
import kotlin.collections.List as KtList

object BuildingInfrastructureGroup

val LinearSolar.BuildingInfrastructure: BuildingInfrastructureGroup
    get() = BuildingInfrastructureGroup

private var _AllIcons: KtList<ImageVector>? = null

val BuildingInfrastructureGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(Buildings, Buildings2, Buildings3, City, Garage, Home, Hospital)
        return _AllIcons!!
    }
