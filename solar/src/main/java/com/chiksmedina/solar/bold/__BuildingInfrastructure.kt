package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.buildinginfrastructure.Buildings
import com.chiksmedina.solar.bold.buildinginfrastructure.Buildings2
import com.chiksmedina.solar.bold.buildinginfrastructure.Buildings3
import com.chiksmedina.solar.bold.buildinginfrastructure.City
import com.chiksmedina.solar.bold.buildinginfrastructure.Garage
import com.chiksmedina.solar.bold.buildinginfrastructure.Home
import com.chiksmedina.solar.bold.buildinginfrastructure.Hospital
import kotlin.collections.List as KtList

object BuildingInfrastructureGroup

val BoldSolar.BuildingInfrastructure: BuildingInfrastructureGroup
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
