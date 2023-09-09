package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.maplocation.BranchingPathsDown
import com.chiksmedina.solar.broken.maplocation.BranchingPathsUp
import com.chiksmedina.solar.broken.maplocation.Compass
import com.chiksmedina.solar.broken.maplocation.CompassBig
import com.chiksmedina.solar.broken.maplocation.CompassSquare
import com.chiksmedina.solar.broken.maplocation.Global
import com.chiksmedina.solar.broken.maplocation.Globus
import com.chiksmedina.solar.broken.maplocation.Gps
import com.chiksmedina.solar.broken.maplocation.Map
import com.chiksmedina.solar.broken.maplocation.MapArrowDown
import com.chiksmedina.solar.broken.maplocation.MapArrowLeft
import com.chiksmedina.solar.broken.maplocation.MapArrowRight
import com.chiksmedina.solar.broken.maplocation.MapArrowSquare
import com.chiksmedina.solar.broken.maplocation.MapArrowUp
import com.chiksmedina.solar.broken.maplocation.MapPoint
import com.chiksmedina.solar.broken.maplocation.MapPointAdd
import com.chiksmedina.solar.broken.maplocation.MapPointFavourite
import com.chiksmedina.solar.broken.maplocation.MapPointHospital
import com.chiksmedina.solar.broken.maplocation.MapPointRemove
import com.chiksmedina.solar.broken.maplocation.MapPointRotate
import com.chiksmedina.solar.broken.maplocation.MapPointSchool
import com.chiksmedina.solar.broken.maplocation.MapPointSearch
import com.chiksmedina.solar.broken.maplocation.MapPointWave
import com.chiksmedina.solar.broken.maplocation.PeopleNearby
import com.chiksmedina.solar.broken.maplocation.PointOnMap
import com.chiksmedina.solar.broken.maplocation.PointOnMapPerspective
import com.chiksmedina.solar.broken.maplocation.Radar
import com.chiksmedina.solar.broken.maplocation.Radar2
import com.chiksmedina.solar.broken.maplocation.Route
import com.chiksmedina.solar.broken.maplocation.Routing
import com.chiksmedina.solar.broken.maplocation.Routing2
import com.chiksmedina.solar.broken.maplocation.Routing3
import com.chiksmedina.solar.broken.maplocation.Signpost
import com.chiksmedina.solar.broken.maplocation.Signpost2
import com.chiksmedina.solar.broken.maplocation.Streets
import com.chiksmedina.solar.broken.maplocation.StreetsMapPoint
import com.chiksmedina.solar.broken.maplocation.StreetsNavigation
import kotlin.collections.List as ____KtList

public object MapLocationGroup

public val BrokenGroup.MapLocation: MapLocationGroup
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
