package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.maplocation.BranchingPathsDown
import com.chiksmedina.solar.linear.maplocation.BranchingPathsUp
import com.chiksmedina.solar.linear.maplocation.Compass
import com.chiksmedina.solar.linear.maplocation.CompassBig
import com.chiksmedina.solar.linear.maplocation.CompassSquare
import com.chiksmedina.solar.linear.maplocation.Global
import com.chiksmedina.solar.linear.maplocation.Globus
import com.chiksmedina.solar.linear.maplocation.Gps
import com.chiksmedina.solar.linear.maplocation.Map
import com.chiksmedina.solar.linear.maplocation.MapArrowDown
import com.chiksmedina.solar.linear.maplocation.MapArrowLeft
import com.chiksmedina.solar.linear.maplocation.MapArrowRight
import com.chiksmedina.solar.linear.maplocation.MapArrowSquare
import com.chiksmedina.solar.linear.maplocation.MapArrowUp
import com.chiksmedina.solar.linear.maplocation.MapPoint
import com.chiksmedina.solar.linear.maplocation.MapPointAdd
import com.chiksmedina.solar.linear.maplocation.MapPointFavourite
import com.chiksmedina.solar.linear.maplocation.MapPointHospital
import com.chiksmedina.solar.linear.maplocation.MapPointRemove
import com.chiksmedina.solar.linear.maplocation.MapPointRotate
import com.chiksmedina.solar.linear.maplocation.MapPointSchool
import com.chiksmedina.solar.linear.maplocation.MapPointSearch
import com.chiksmedina.solar.linear.maplocation.MapPointWave
import com.chiksmedina.solar.linear.maplocation.PeopleNearby
import com.chiksmedina.solar.linear.maplocation.PointOnMap
import com.chiksmedina.solar.linear.maplocation.PointOnMapPerspective
import com.chiksmedina.solar.linear.maplocation.Radar
import com.chiksmedina.solar.linear.maplocation.Radar2
import com.chiksmedina.solar.linear.maplocation.Route
import com.chiksmedina.solar.linear.maplocation.Routing
import com.chiksmedina.solar.linear.maplocation.Routing2
import com.chiksmedina.solar.linear.maplocation.Routing3
import com.chiksmedina.solar.linear.maplocation.Signpost
import com.chiksmedina.solar.linear.maplocation.Signpost2
import com.chiksmedina.solar.linear.maplocation.Streets
import com.chiksmedina.solar.linear.maplocation.StreetsMapPoint
import com.chiksmedina.solar.linear.maplocation.StreetsNavigation
import kotlin.collections.List as KtList

object MapLocationGroup

val LinearSolar.MapLocation: MapLocationGroup
    get() = MapLocationGroup

private var _AllIcons: KtList<ImageVector>? = null

val MapLocationGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            BranchingPathsDown, BranchingPathsUp, Compass, CompassBig, CompassSquare,
            Global, Globus, Gps, Map, MapArrowDown, MapArrowLeft, MapArrowRight, MapArrowSquare,
            MapArrowUp, MapPoint, MapPointAdd, MapPointFavourite, MapPointHospital, MapPointRemove,
            MapPointRotate, MapPointSchool, MapPointSearch, MapPointWave, PeopleNearby, PointOnMap,
            PointOnMapPerspective, Radar, Radar2, Route, Routing, Routing2, Routing3, Signpost,
            Signpost2, Streets, StreetsMapPoint, StreetsNavigation
        )
        return _AllIcons!!
    }
