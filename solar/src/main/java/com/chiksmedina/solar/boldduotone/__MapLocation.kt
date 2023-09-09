package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.maplocation.BranchingPathsDown
import com.chiksmedina.solar.boldduotone.maplocation.BranchingPathsUp
import com.chiksmedina.solar.boldduotone.maplocation.Compass
import com.chiksmedina.solar.boldduotone.maplocation.CompassBig
import com.chiksmedina.solar.boldduotone.maplocation.CompassSquare
import com.chiksmedina.solar.boldduotone.maplocation.Global
import com.chiksmedina.solar.boldduotone.maplocation.Globus
import com.chiksmedina.solar.boldduotone.maplocation.Gps
import com.chiksmedina.solar.boldduotone.maplocation.Map
import com.chiksmedina.solar.boldduotone.maplocation.MapArrowDown
import com.chiksmedina.solar.boldduotone.maplocation.MapArrowLeft
import com.chiksmedina.solar.boldduotone.maplocation.MapArrowRight
import com.chiksmedina.solar.boldduotone.maplocation.MapArrowSquare
import com.chiksmedina.solar.boldduotone.maplocation.MapArrowUp
import com.chiksmedina.solar.boldduotone.maplocation.MapPoint
import com.chiksmedina.solar.boldduotone.maplocation.MapPointAdd
import com.chiksmedina.solar.boldduotone.maplocation.MapPointFavourite
import com.chiksmedina.solar.boldduotone.maplocation.MapPointHospital
import com.chiksmedina.solar.boldduotone.maplocation.MapPointRemove
import com.chiksmedina.solar.boldduotone.maplocation.MapPointRotate
import com.chiksmedina.solar.boldduotone.maplocation.MapPointSchool
import com.chiksmedina.solar.boldduotone.maplocation.MapPointSearch
import com.chiksmedina.solar.boldduotone.maplocation.MapPointWave
import com.chiksmedina.solar.boldduotone.maplocation.PeopleNearby
import com.chiksmedina.solar.boldduotone.maplocation.PointOnMap
import com.chiksmedina.solar.boldduotone.maplocation.PointOnMapPerspective
import com.chiksmedina.solar.boldduotone.maplocation.Radar
import com.chiksmedina.solar.boldduotone.maplocation.Radar2
import com.chiksmedina.solar.boldduotone.maplocation.Route
import com.chiksmedina.solar.boldduotone.maplocation.Routing
import com.chiksmedina.solar.boldduotone.maplocation.Routing2
import com.chiksmedina.solar.boldduotone.maplocation.Routing3
import com.chiksmedina.solar.boldduotone.maplocation.Signpost
import com.chiksmedina.solar.boldduotone.maplocation.Signpost2
import com.chiksmedina.solar.boldduotone.maplocation.Streets
import com.chiksmedina.solar.boldduotone.maplocation.StreetsMapPoint
import com.chiksmedina.solar.boldduotone.maplocation.StreetsNavigation
import kotlin.collections.List as ____KtList

public object MapLocationGroup

public val BoldduotoneGroup.MapLocation: MapLocationGroup
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
