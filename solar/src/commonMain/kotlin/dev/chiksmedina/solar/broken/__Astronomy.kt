package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.astronomy.Asteroid
import dev.chiksmedina.solar.broken.astronomy.Atom
import dev.chiksmedina.solar.broken.astronomy.BlackHole
import dev.chiksmedina.solar.broken.astronomy.BlackHole2
import dev.chiksmedina.solar.broken.astronomy.BlackHole3
import dev.chiksmedina.solar.broken.astronomy.Earth
import dev.chiksmedina.solar.broken.astronomy.Infinity
import dev.chiksmedina.solar.broken.astronomy.Men
import dev.chiksmedina.solar.broken.astronomy.Planet
import dev.chiksmedina.solar.broken.astronomy.Planet2
import dev.chiksmedina.solar.broken.astronomy.Planet3
import dev.chiksmedina.solar.broken.astronomy.Planet4
import dev.chiksmedina.solar.broken.astronomy.Rocket
import dev.chiksmedina.solar.broken.astronomy.Rocket2
import dev.chiksmedina.solar.broken.astronomy.Satellite
import dev.chiksmedina.solar.broken.astronomy.Star
import dev.chiksmedina.solar.broken.astronomy.StarAngle
import dev.chiksmedina.solar.broken.astronomy.StarCircle
import dev.chiksmedina.solar.broken.astronomy.StarFall
import dev.chiksmedina.solar.broken.astronomy.StarFall2
import dev.chiksmedina.solar.broken.astronomy.StarFallMinimalistic
import dev.chiksmedina.solar.broken.astronomy.StarFallMinimalistic2
import dev.chiksmedina.solar.broken.astronomy.StarRainbow
import dev.chiksmedina.solar.broken.astronomy.StarRing
import dev.chiksmedina.solar.broken.astronomy.StarRings
import dev.chiksmedina.solar.broken.astronomy.Stars
import dev.chiksmedina.solar.broken.astronomy.StarsLine
import dev.chiksmedina.solar.broken.astronomy.StarsMinimalistic
import dev.chiksmedina.solar.broken.astronomy.Ufo
import dev.chiksmedina.solar.broken.astronomy.Ufo2
import dev.chiksmedina.solar.broken.astronomy.Ufo3
import dev.chiksmedina.solar.broken.astronomy.Women
import kotlin.collections.List as KtList

object AstronomyGroup

val BrokenSolar.Astronomy: AstronomyGroup
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
