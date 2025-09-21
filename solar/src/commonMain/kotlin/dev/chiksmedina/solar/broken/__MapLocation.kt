package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.maplocation.BranchingPathsDown
import dev.chiksmedina.solar.broken.maplocation.BranchingPathsUp
import dev.chiksmedina.solar.broken.maplocation.Compass
import dev.chiksmedina.solar.broken.maplocation.CompassBig
import dev.chiksmedina.solar.broken.maplocation.CompassSquare
import dev.chiksmedina.solar.broken.maplocation.Global
import dev.chiksmedina.solar.broken.maplocation.Globus
import dev.chiksmedina.solar.broken.maplocation.Gps
import dev.chiksmedina.solar.broken.maplocation.Map
import dev.chiksmedina.solar.broken.maplocation.MapArrowDown
import dev.chiksmedina.solar.broken.maplocation.MapArrowLeft
import dev.chiksmedina.solar.broken.maplocation.MapArrowRight
import dev.chiksmedina.solar.broken.maplocation.MapArrowSquare
import dev.chiksmedina.solar.broken.maplocation.MapArrowUp
import dev.chiksmedina.solar.broken.maplocation.MapPoint
import dev.chiksmedina.solar.broken.maplocation.MapPointAdd
import dev.chiksmedina.solar.broken.maplocation.MapPointFavourite
import dev.chiksmedina.solar.broken.maplocation.MapPointHospital
import dev.chiksmedina.solar.broken.maplocation.MapPointRemove
import dev.chiksmedina.solar.broken.maplocation.MapPointRotate
import dev.chiksmedina.solar.broken.maplocation.MapPointSchool
import dev.chiksmedina.solar.broken.maplocation.MapPointSearch
import dev.chiksmedina.solar.broken.maplocation.MapPointWave
import dev.chiksmedina.solar.broken.maplocation.PeopleNearby
import dev.chiksmedina.solar.broken.maplocation.PointOnMap
import dev.chiksmedina.solar.broken.maplocation.PointOnMapPerspective
import dev.chiksmedina.solar.broken.maplocation.Radar
import dev.chiksmedina.solar.broken.maplocation.Radar2
import dev.chiksmedina.solar.broken.maplocation.Route
import dev.chiksmedina.solar.broken.maplocation.Routing
import dev.chiksmedina.solar.broken.maplocation.Routing2
import dev.chiksmedina.solar.broken.maplocation.Routing3
import dev.chiksmedina.solar.broken.maplocation.Signpost
import dev.chiksmedina.solar.broken.maplocation.Signpost2
import dev.chiksmedina.solar.broken.maplocation.Streets
import dev.chiksmedina.solar.broken.maplocation.StreetsMapPoint
import dev.chiksmedina.solar.broken.maplocation.StreetsNavigation
import kotlin.collections.List as KtList

object MapLocationGroup

val BrokenSolar.MapLocation: MapLocationGroup
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
