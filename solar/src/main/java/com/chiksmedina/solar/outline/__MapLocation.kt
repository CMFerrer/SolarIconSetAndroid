package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.maplocation.BranchingPathsDown
import com.chiksmedina.solar.outline.maplocation.BranchingPathsUp
import com.chiksmedina.solar.outline.maplocation.Compass
import com.chiksmedina.solar.outline.maplocation.CompassBig
import com.chiksmedina.solar.outline.maplocation.CompassSquare
import com.chiksmedina.solar.outline.maplocation.Global
import com.chiksmedina.solar.outline.maplocation.Globus
import com.chiksmedina.solar.outline.maplocation.Gps
import com.chiksmedina.solar.outline.maplocation.Map
import com.chiksmedina.solar.outline.maplocation.MapArrowDown
import com.chiksmedina.solar.outline.maplocation.MapArrowLeft
import com.chiksmedina.solar.outline.maplocation.MapArrowRight
import com.chiksmedina.solar.outline.maplocation.MapArrowSquare
import com.chiksmedina.solar.outline.maplocation.MapArrowUp
import com.chiksmedina.solar.outline.maplocation.MapPoint
import com.chiksmedina.solar.outline.maplocation.MapPointAdd
import com.chiksmedina.solar.outline.maplocation.MapPointFavourite
import com.chiksmedina.solar.outline.maplocation.MapPointHospital
import com.chiksmedina.solar.outline.maplocation.MapPointRemove
import com.chiksmedina.solar.outline.maplocation.MapPointRotate
import com.chiksmedina.solar.outline.maplocation.MapPointSchool
import com.chiksmedina.solar.outline.maplocation.MapPointSearch
import com.chiksmedina.solar.outline.maplocation.MapPointWave
import com.chiksmedina.solar.outline.maplocation.PeopleNearby
import com.chiksmedina.solar.outline.maplocation.PointOnMap
import com.chiksmedina.solar.outline.maplocation.PointOnMapPerspective
import com.chiksmedina.solar.outline.maplocation.Radar
import com.chiksmedina.solar.outline.maplocation.Radar2
import com.chiksmedina.solar.outline.maplocation.Route
import com.chiksmedina.solar.outline.maplocation.Routing
import com.chiksmedina.solar.outline.maplocation.Routing2
import com.chiksmedina.solar.outline.maplocation.Routing3
import com.chiksmedina.solar.outline.maplocation.Signpost
import com.chiksmedina.solar.outline.maplocation.Signpost2
import com.chiksmedina.solar.outline.maplocation.Streets
import com.chiksmedina.solar.outline.maplocation.StreetsMapPoint
import com.chiksmedina.solar.outline.maplocation.StreetsNavigation
import kotlin.collections.List as ____KtList

public object MapLocationGroup

public val OutlineGroup.MapLocation: MapLocationGroup
  get() = MapLocationGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val MapLocationGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(BranchingPathsDown, BranchingPathsUp, Compass, CompassBig, CompassSquare,
        Global, Globus, Gps, Map, MapArrowDown, MapArrowLeft, MapArrowRight, MapArrowSquare,
        MapArrowUp, MapPoint, MapPointAdd, MapPointFavourite, MapPointHospital, MapPointRemove,
        MapPointRotate, MapPointSchool, MapPointSearch, MapPointWave, PeopleNearby, PointOnMap,
        PointOnMapPerspective, Radar, Radar2, Route, Routing, Routing2, Routing3, Signpost,
        Signpost2, Streets, StreetsMapPoint, StreetsNavigation)
    return __AllIcons!!
  }
