package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.maplocation.BranchingPathsDown
import com.chiksmedina.solar.lineduotone.maplocation.BranchingPathsUp
import com.chiksmedina.solar.lineduotone.maplocation.Compass
import com.chiksmedina.solar.lineduotone.maplocation.CompassBig
import com.chiksmedina.solar.lineduotone.maplocation.CompassSquare
import com.chiksmedina.solar.lineduotone.maplocation.Global
import com.chiksmedina.solar.lineduotone.maplocation.Globus
import com.chiksmedina.solar.lineduotone.maplocation.Gps
import com.chiksmedina.solar.lineduotone.maplocation.Map
import com.chiksmedina.solar.lineduotone.maplocation.MapArrowDown
import com.chiksmedina.solar.lineduotone.maplocation.MapArrowLeft
import com.chiksmedina.solar.lineduotone.maplocation.MapArrowRight
import com.chiksmedina.solar.lineduotone.maplocation.MapArrowSquare
import com.chiksmedina.solar.lineduotone.maplocation.MapArrowUp
import com.chiksmedina.solar.lineduotone.maplocation.MapPoint
import com.chiksmedina.solar.lineduotone.maplocation.MapPointAdd
import com.chiksmedina.solar.lineduotone.maplocation.MapPointFavourite
import com.chiksmedina.solar.lineduotone.maplocation.MapPointHospital
import com.chiksmedina.solar.lineduotone.maplocation.MapPointRemove
import com.chiksmedina.solar.lineduotone.maplocation.MapPointRotate
import com.chiksmedina.solar.lineduotone.maplocation.MapPointSchool
import com.chiksmedina.solar.lineduotone.maplocation.MapPointSearch
import com.chiksmedina.solar.lineduotone.maplocation.MapPointWave
import com.chiksmedina.solar.lineduotone.maplocation.PeopleNearby
import com.chiksmedina.solar.lineduotone.maplocation.PointOnMap
import com.chiksmedina.solar.lineduotone.maplocation.PointOnMapPerspective
import com.chiksmedina.solar.lineduotone.maplocation.Radar
import com.chiksmedina.solar.lineduotone.maplocation.Radar2
import com.chiksmedina.solar.lineduotone.maplocation.Route
import com.chiksmedina.solar.lineduotone.maplocation.Routing
import com.chiksmedina.solar.lineduotone.maplocation.Routing2
import com.chiksmedina.solar.lineduotone.maplocation.Routing3
import com.chiksmedina.solar.lineduotone.maplocation.Signpost
import com.chiksmedina.solar.lineduotone.maplocation.Signpost2
import com.chiksmedina.solar.lineduotone.maplocation.Streets
import com.chiksmedina.solar.lineduotone.maplocation.StreetsMapPoint
import com.chiksmedina.solar.lineduotone.maplocation.StreetsNavigation
import kotlin.collections.List as ____KtList

public object MapLocationGroup

public val LineduotoneGroup.MapLocation: MapLocationGroup
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
