package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.astronomy.Asteroid
import dev.chiksmedina.solar.outline.astronomy.Atom
import dev.chiksmedina.solar.outline.astronomy.BlackHole
import dev.chiksmedina.solar.outline.astronomy.BlackHole2
import dev.chiksmedina.solar.outline.astronomy.BlackHole3
import dev.chiksmedina.solar.outline.astronomy.Earth
import dev.chiksmedina.solar.outline.astronomy.Infinity
import dev.chiksmedina.solar.outline.astronomy.Men
import dev.chiksmedina.solar.outline.astronomy.Planet
import dev.chiksmedina.solar.outline.astronomy.Planet2
import dev.chiksmedina.solar.outline.astronomy.Planet3
import dev.chiksmedina.solar.outline.astronomy.Planet4
import dev.chiksmedina.solar.outline.astronomy.Rocket
import dev.chiksmedina.solar.outline.astronomy.Rocket2
import dev.chiksmedina.solar.outline.astronomy.Satellite
import dev.chiksmedina.solar.outline.astronomy.Star
import dev.chiksmedina.solar.outline.astronomy.StarAngle
import dev.chiksmedina.solar.outline.astronomy.StarCircle
import dev.chiksmedina.solar.outline.astronomy.StarFall
import dev.chiksmedina.solar.outline.astronomy.StarFall2
import dev.chiksmedina.solar.outline.astronomy.StarFallMinimalistic
import dev.chiksmedina.solar.outline.astronomy.StarFallMinimalistic2
import dev.chiksmedina.solar.outline.astronomy.StarRainbow
import dev.chiksmedina.solar.outline.astronomy.StarRing
import dev.chiksmedina.solar.outline.astronomy.StarRings
import dev.chiksmedina.solar.outline.astronomy.Stars
import dev.chiksmedina.solar.outline.astronomy.StarsLine
import dev.chiksmedina.solar.outline.astronomy.StarsMinimalistic
import dev.chiksmedina.solar.outline.astronomy.Ufo
import dev.chiksmedina.solar.outline.astronomy.Ufo2
import dev.chiksmedina.solar.outline.astronomy.Ufo3
import dev.chiksmedina.solar.outline.astronomy.Women
import kotlin.collections.List as KtList

object AstronomyGroup

val OutlineSolar.Astronomy: AstronomyGroup
    get() = AstronomyGroup

private var _AllIcons: KtList<ImageVector>? = null

val AstronomyGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Asteroid, Atom, BlackHole, BlackHole2, BlackHole3, Earth, Infinity, Men,
            Planet, Planet2, Planet3, Planet4, Rocket, Rocket2, Satellite, Star, Stars, StarsLine,
            StarsMinimalistic, StarAngle, StarCircle, StarFall, StarFall2, StarFallMinimalistic,
            StarFallMinimalistic2, StarRainbow, StarRing, StarRings, Ufo, Ufo2, Ufo3, Women
        )
        return _AllIcons!!
    }
