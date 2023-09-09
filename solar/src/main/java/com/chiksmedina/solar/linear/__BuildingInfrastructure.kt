package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.buildinginfrastructure.Buildings
import com.chiksmedina.solar.linear.buildinginfrastructure.Buildings2
import com.chiksmedina.solar.linear.buildinginfrastructure.Buildings3
import com.chiksmedina.solar.linear.buildinginfrastructure.City
import com.chiksmedina.solar.linear.buildinginfrastructure.Garage
import com.chiksmedina.solar.linear.buildinginfrastructure.Home
import com.chiksmedina.solar.linear.buildinginfrastructure.Hospital
import kotlin.collections.List as ____KtList

public object BuildingInfrastructureGroup

public val LinearGroup.BuildingInfrastructure: BuildingInfrastructureGroup
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
