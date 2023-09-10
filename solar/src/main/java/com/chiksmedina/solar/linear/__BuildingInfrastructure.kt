package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.buildinginfrastructure.Buildings
import com.chiksmedina.solar.linear.buildinginfrastructure.Buildings2
import com.chiksmedina.solar.linear.buildinginfrastructure.Buildings3
import com.chiksmedina.solar.linear.buildinginfrastructure.City
import com.chiksmedina.solar.linear.buildinginfrastructure.Garage
import com.chiksmedina.solar.linear.buildinginfrastructure.Home
import com.chiksmedina.solar.linear.buildinginfrastructure.Hospital
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
