package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.maplocation.BranchingPathsDown
import dev.chiksmedina.solar.outline.maplocation.BranchingPathsUp
import dev.chiksmedina.solar.outline.maplocation.Compass
import dev.chiksmedina.solar.outline.maplocation.CompassBig
import dev.chiksmedina.solar.outline.maplocation.CompassSquare
import dev.chiksmedina.solar.outline.maplocation.Global
import dev.chiksmedina.solar.outline.maplocation.Globus
import dev.chiksmedina.solar.outline.maplocation.Gps
import dev.chiksmedina.solar.outline.maplocation.Map
import dev.chiksmedina.solar.outline.maplocation.MapArrowDown
import dev.chiksmedina.solar.outline.maplocation.MapArrowLeft
import dev.chiksmedina.solar.outline.maplocation.MapArrowRight
import dev.chiksmedina.solar.outline.maplocation.MapArrowSquare
import dev.chiksmedina.solar.outline.maplocation.MapArrowUp
import dev.chiksmedina.solar.outline.maplocation.MapPoint
import dev.chiksmedina.solar.outline.maplocation.MapPointAdd
import dev.chiksmedina.solar.outline.maplocation.MapPointFavourite
import dev.chiksmedina.solar.outline.maplocation.MapPointHospital
import dev.chiksmedina.solar.outline.maplocation.MapPointRemove
import dev.chiksmedina.solar.outline.maplocation.MapPointRotate
import dev.chiksmedina.solar.outline.maplocation.MapPointSchool
import dev.chiksmedina.solar.outline.maplocation.MapPointSearch
import dev.chiksmedina.solar.outline.maplocation.MapPointWave
import dev.chiksmedina.solar.outline.maplocation.PeopleNearby
import dev.chiksmedina.solar.outline.maplocation.PointOnMap
import dev.chiksmedina.solar.outline.maplocation.PointOnMapPerspective
import dev.chiksmedina.solar.outline.maplocation.Radar
import dev.chiksmedina.solar.outline.maplocation.Radar2
import dev.chiksmedina.solar.outline.maplocation.Route
import dev.chiksmedina.solar.outline.maplocation.Routing
import dev.chiksmedina.solar.outline.maplocation.Routing2
import dev.chiksmedina.solar.outline.maplocation.Routing3
import dev.chiksmedina.solar.outline.maplocation.Signpost
import dev.chiksmedina.solar.outline.maplocation.Signpost2
import dev.chiksmedina.solar.outline.maplocation.Streets
import dev.chiksmedina.solar.outline.maplocation.StreetsMapPoint
import dev.chiksmedina.solar.outline.maplocation.StreetsNavigation
import kotlin.collections.List as KtList

object MapLocationGroup

val OutlineSolar.MapLocation: MapLocationGroup
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
