package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.maplocation.BranchingPathsDown
import dev.chiksmedina.solar.linear.maplocation.BranchingPathsUp
import dev.chiksmedina.solar.linear.maplocation.Compass
import dev.chiksmedina.solar.linear.maplocation.CompassBig
import dev.chiksmedina.solar.linear.maplocation.CompassSquare
import dev.chiksmedina.solar.linear.maplocation.Global
import dev.chiksmedina.solar.linear.maplocation.Globus
import dev.chiksmedina.solar.linear.maplocation.Gps
import dev.chiksmedina.solar.linear.maplocation.Map
import dev.chiksmedina.solar.linear.maplocation.MapArrowDown
import dev.chiksmedina.solar.linear.maplocation.MapArrowLeft
import dev.chiksmedina.solar.linear.maplocation.MapArrowRight
import dev.chiksmedina.solar.linear.maplocation.MapArrowSquare
import dev.chiksmedina.solar.linear.maplocation.MapArrowUp
import dev.chiksmedina.solar.linear.maplocation.MapPoint
import dev.chiksmedina.solar.linear.maplocation.MapPointAdd
import dev.chiksmedina.solar.linear.maplocation.MapPointFavourite
import dev.chiksmedina.solar.linear.maplocation.MapPointHospital
import dev.chiksmedina.solar.linear.maplocation.MapPointRemove
import dev.chiksmedina.solar.linear.maplocation.MapPointRotate
import dev.chiksmedina.solar.linear.maplocation.MapPointSchool
import dev.chiksmedina.solar.linear.maplocation.MapPointSearch
import dev.chiksmedina.solar.linear.maplocation.MapPointWave
import dev.chiksmedina.solar.linear.maplocation.PeopleNearby
import dev.chiksmedina.solar.linear.maplocation.PointOnMap
import dev.chiksmedina.solar.linear.maplocation.PointOnMapPerspective
import dev.chiksmedina.solar.linear.maplocation.Radar
import dev.chiksmedina.solar.linear.maplocation.Radar2
import dev.chiksmedina.solar.linear.maplocation.Route
import dev.chiksmedina.solar.linear.maplocation.Routing
import dev.chiksmedina.solar.linear.maplocation.Routing2
import dev.chiksmedina.solar.linear.maplocation.Routing3
import dev.chiksmedina.solar.linear.maplocation.Signpost
import dev.chiksmedina.solar.linear.maplocation.Signpost2
import dev.chiksmedina.solar.linear.maplocation.Streets
import dev.chiksmedina.solar.linear.maplocation.StreetsMapPoint
import dev.chiksmedina.solar.linear.maplocation.StreetsNavigation
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
