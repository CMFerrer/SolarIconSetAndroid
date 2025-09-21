package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.maplocation.BranchingPathsDown
import dev.chiksmedina.solar.bold.maplocation.BranchingPathsUp
import dev.chiksmedina.solar.bold.maplocation.Compass
import dev.chiksmedina.solar.bold.maplocation.CompassBig
import dev.chiksmedina.solar.bold.maplocation.CompassSquare
import dev.chiksmedina.solar.bold.maplocation.Global
import dev.chiksmedina.solar.bold.maplocation.Globus
import dev.chiksmedina.solar.bold.maplocation.Gps
import dev.chiksmedina.solar.bold.maplocation.Map
import dev.chiksmedina.solar.bold.maplocation.MapArrowDown
import dev.chiksmedina.solar.bold.maplocation.MapArrowLeft
import dev.chiksmedina.solar.bold.maplocation.MapArrowRight
import dev.chiksmedina.solar.bold.maplocation.MapArrowSquare
import dev.chiksmedina.solar.bold.maplocation.MapArrowUp
import dev.chiksmedina.solar.bold.maplocation.MapPoint
import dev.chiksmedina.solar.bold.maplocation.MapPointAdd
import dev.chiksmedina.solar.bold.maplocation.MapPointFavourite
import dev.chiksmedina.solar.bold.maplocation.MapPointHospital
import dev.chiksmedina.solar.bold.maplocation.MapPointRemove
import dev.chiksmedina.solar.bold.maplocation.MapPointRotate
import dev.chiksmedina.solar.bold.maplocation.MapPointSchool
import dev.chiksmedina.solar.bold.maplocation.MapPointSearch
import dev.chiksmedina.solar.bold.maplocation.MapPointWave
import dev.chiksmedina.solar.bold.maplocation.PeopleNearby
import dev.chiksmedina.solar.bold.maplocation.PointOnMap
import dev.chiksmedina.solar.bold.maplocation.PointOnMapPerspective
import dev.chiksmedina.solar.bold.maplocation.Radar
import dev.chiksmedina.solar.bold.maplocation.Radar2
import dev.chiksmedina.solar.bold.maplocation.Route
import dev.chiksmedina.solar.bold.maplocation.Routing
import dev.chiksmedina.solar.bold.maplocation.Routing2
import dev.chiksmedina.solar.bold.maplocation.Routing3
import dev.chiksmedina.solar.bold.maplocation.Signpost
import dev.chiksmedina.solar.bold.maplocation.Signpost2
import dev.chiksmedina.solar.bold.maplocation.Streets
import dev.chiksmedina.solar.bold.maplocation.StreetsMapPoint
import dev.chiksmedina.solar.bold.maplocation.StreetsNavigation
import kotlin.collections.List as KtList

object MapLocationGroup

val BoldSolar.MapLocation: MapLocationGroup
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
