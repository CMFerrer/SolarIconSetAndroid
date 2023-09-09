package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.buildinginfrastructure.Buildings
import com.chiksmedina.solar.bold.buildinginfrastructure.Buildings2
import com.chiksmedina.solar.bold.buildinginfrastructure.Buildings3
import com.chiksmedina.solar.bold.buildinginfrastructure.City
import com.chiksmedina.solar.bold.buildinginfrastructure.Garage
import com.chiksmedina.solar.bold.buildinginfrastructure.Home
import com.chiksmedina.solar.bold.buildinginfrastructure.Hospital
import kotlin.collections.List as ____KtList

public object BuildingInfrastructureGroup

public val BoldGroup.BuildingInfrastructure: BuildingInfrastructureGroup
  get() = BuildingInfrastructureGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val BuildingInfrastructureGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Buildings, Buildings2, Buildings3, City, Garage, Home, Hospital)
    return __AllIcons!!
  }
