package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.maplocation.BranchingPathsDown
import dev.chiksmedina.solar.lineduotone.maplocation.BranchingPathsUp
import dev.chiksmedina.solar.lineduotone.maplocation.Compass
import dev.chiksmedina.solar.lineduotone.maplocation.CompassBig
import dev.chiksmedina.solar.lineduotone.maplocation.CompassSquare
import dev.chiksmedina.solar.lineduotone.maplocation.Global
import dev.chiksmedina.solar.lineduotone.maplocation.Globus
import dev.chiksmedina.solar.lineduotone.maplocation.Gps
import dev.chiksmedina.solar.lineduotone.maplocation.Map
import dev.chiksmedina.solar.lineduotone.maplocation.MapArrowDown
import dev.chiksmedina.solar.lineduotone.maplocation.MapArrowLeft
import dev.chiksmedina.solar.lineduotone.maplocation.MapArrowRight
import dev.chiksmedina.solar.lineduotone.maplocation.MapArrowSquare
import dev.chiksmedina.solar.lineduotone.maplocation.MapArrowUp
import dev.chiksmedina.solar.lineduotone.maplocation.MapPoint
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointAdd
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointFavourite
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointHospital
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointRemove
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointRotate
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointSchool
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointSearch
import dev.chiksmedina.solar.lineduotone.maplocation.MapPointWave
import dev.chiksmedina.solar.lineduotone.maplocation.PeopleNearby
import dev.chiksmedina.solar.lineduotone.maplocation.PointOnMap
import dev.chiksmedina.solar.lineduotone.maplocation.PointOnMapPerspective
import dev.chiksmedina.solar.lineduotone.maplocation.Radar
import dev.chiksmedina.solar.lineduotone.maplocation.Radar2
import dev.chiksmedina.solar.lineduotone.maplocation.Route
import dev.chiksmedina.solar.lineduotone.maplocation.Routing
import dev.chiksmedina.solar.lineduotone.maplocation.Routing2
import dev.chiksmedina.solar.lineduotone.maplocation.Routing3
import dev.chiksmedina.solar.lineduotone.maplocation.Signpost
import dev.chiksmedina.solar.lineduotone.maplocation.Signpost2
import dev.chiksmedina.solar.lineduotone.maplocation.Streets
import dev.chiksmedina.solar.lineduotone.maplocation.StreetsMapPoint
import dev.chiksmedina.solar.lineduotone.maplocation.StreetsNavigation
import kotlin.collections.List as KtList

object MapLocationGroup

val LineDuotoneSolar.MapLocation: MapLocationGroup
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
