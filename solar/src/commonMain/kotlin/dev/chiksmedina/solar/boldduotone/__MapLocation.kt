package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.maplocation.BranchingPathsDown
import dev.chiksmedina.solar.boldduotone.maplocation.BranchingPathsUp
import dev.chiksmedina.solar.boldduotone.maplocation.Compass
import dev.chiksmedina.solar.boldduotone.maplocation.CompassBig
import dev.chiksmedina.solar.boldduotone.maplocation.CompassSquare
import dev.chiksmedina.solar.boldduotone.maplocation.Global
import dev.chiksmedina.solar.boldduotone.maplocation.Globus
import dev.chiksmedina.solar.boldduotone.maplocation.Gps
import dev.chiksmedina.solar.boldduotone.maplocation.Map
import dev.chiksmedina.solar.boldduotone.maplocation.MapArrowDown
import dev.chiksmedina.solar.boldduotone.maplocation.MapArrowLeft
import dev.chiksmedina.solar.boldduotone.maplocation.MapArrowRight
import dev.chiksmedina.solar.boldduotone.maplocation.MapArrowSquare
import dev.chiksmedina.solar.boldduotone.maplocation.MapArrowUp
import dev.chiksmedina.solar.boldduotone.maplocation.MapPoint
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointAdd
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointFavourite
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointHospital
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointRemove
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointRotate
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointSchool
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointSearch
import dev.chiksmedina.solar.boldduotone.maplocation.MapPointWave
import dev.chiksmedina.solar.boldduotone.maplocation.PeopleNearby
import dev.chiksmedina.solar.boldduotone.maplocation.PointOnMap
import dev.chiksmedina.solar.boldduotone.maplocation.PointOnMapPerspective
import dev.chiksmedina.solar.boldduotone.maplocation.Radar
import dev.chiksmedina.solar.boldduotone.maplocation.Radar2
import dev.chiksmedina.solar.boldduotone.maplocation.Route
import dev.chiksmedina.solar.boldduotone.maplocation.Routing
import dev.chiksmedina.solar.boldduotone.maplocation.Routing2
import dev.chiksmedina.solar.boldduotone.maplocation.Routing3
import dev.chiksmedina.solar.boldduotone.maplocation.Signpost
import dev.chiksmedina.solar.boldduotone.maplocation.Signpost2
import dev.chiksmedina.solar.boldduotone.maplocation.Streets
import dev.chiksmedina.solar.boldduotone.maplocation.StreetsMapPoint
import dev.chiksmedina.solar.boldduotone.maplocation.StreetsNavigation
import kotlin.collections.List as KtList

object MapLocationGroup

val BoldDuotoneSolar.MapLocation: MapLocationGroup
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
