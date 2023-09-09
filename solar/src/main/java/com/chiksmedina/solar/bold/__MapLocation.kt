package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.maplocation.BranchingPathsDown
import com.chiksmedina.solar.bold.maplocation.BranchingPathsUp
import com.chiksmedina.solar.bold.maplocation.Compass
import com.chiksmedina.solar.bold.maplocation.CompassBig
import com.chiksmedina.solar.bold.maplocation.CompassSquare
import com.chiksmedina.solar.bold.maplocation.Global
import com.chiksmedina.solar.bold.maplocation.Globus
import com.chiksmedina.solar.bold.maplocation.Gps
import com.chiksmedina.solar.bold.maplocation.Map
import com.chiksmedina.solar.bold.maplocation.MapArrowDown
import com.chiksmedina.solar.bold.maplocation.MapArrowLeft
import com.chiksmedina.solar.bold.maplocation.MapArrowRight
import com.chiksmedina.solar.bold.maplocation.MapArrowSquare
import com.chiksmedina.solar.bold.maplocation.MapArrowUp
import com.chiksmedina.solar.bold.maplocation.MapPoint
import com.chiksmedina.solar.bold.maplocation.MapPointAdd
import com.chiksmedina.solar.bold.maplocation.MapPointFavourite
import com.chiksmedina.solar.bold.maplocation.MapPointHospital
import com.chiksmedina.solar.bold.maplocation.MapPointRemove
import com.chiksmedina.solar.bold.maplocation.MapPointRotate
import com.chiksmedina.solar.bold.maplocation.MapPointSchool
import com.chiksmedina.solar.bold.maplocation.MapPointSearch
import com.chiksmedina.solar.bold.maplocation.MapPointWave
import com.chiksmedina.solar.bold.maplocation.PeopleNearby
import com.chiksmedina.solar.bold.maplocation.PointOnMap
import com.chiksmedina.solar.bold.maplocation.PointOnMapPerspective
import com.chiksmedina.solar.bold.maplocation.Radar
import com.chiksmedina.solar.bold.maplocation.Radar2
import com.chiksmedina.solar.bold.maplocation.Route
import com.chiksmedina.solar.bold.maplocation.Routing
import com.chiksmedina.solar.bold.maplocation.Routing2
import com.chiksmedina.solar.bold.maplocation.Routing3
import com.chiksmedina.solar.bold.maplocation.Signpost
import com.chiksmedina.solar.bold.maplocation.Signpost2
import com.chiksmedina.solar.bold.maplocation.Streets
import com.chiksmedina.solar.bold.maplocation.StreetsMapPoint
import com.chiksmedina.solar.bold.maplocation.StreetsNavigation
import kotlin.collections.List as ____KtList

public object MapLocationGroup

public val BoldGroup.MapLocation: MapLocationGroup
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
