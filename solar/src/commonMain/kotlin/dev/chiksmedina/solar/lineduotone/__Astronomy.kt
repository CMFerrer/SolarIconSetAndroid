package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.astronomy.Asteroid
import dev.chiksmedina.solar.lineduotone.astronomy.Atom
import dev.chiksmedina.solar.lineduotone.astronomy.BlackHole
import dev.chiksmedina.solar.lineduotone.astronomy.BlackHole2
import dev.chiksmedina.solar.lineduotone.astronomy.BlackHole3
import dev.chiksmedina.solar.lineduotone.astronomy.Earth
import dev.chiksmedina.solar.lineduotone.astronomy.Infinity
import dev.chiksmedina.solar.lineduotone.astronomy.Men
import dev.chiksmedina.solar.lineduotone.astronomy.Planet
import dev.chiksmedina.solar.lineduotone.astronomy.Planet2
import dev.chiksmedina.solar.lineduotone.astronomy.Planet3
import dev.chiksmedina.solar.lineduotone.astronomy.Planet4
import dev.chiksmedina.solar.lineduotone.astronomy.Rocket
import dev.chiksmedina.solar.lineduotone.astronomy.Rocket2
import dev.chiksmedina.solar.lineduotone.astronomy.Satellite
import dev.chiksmedina.solar.lineduotone.astronomy.Star
import dev.chiksmedina.solar.lineduotone.astronomy.StarAngle
import dev.chiksmedina.solar.lineduotone.astronomy.StarCircle
import dev.chiksmedina.solar.lineduotone.astronomy.StarFall
import dev.chiksmedina.solar.lineduotone.astronomy.StarFall2
import dev.chiksmedina.solar.lineduotone.astronomy.StarFallMinimalistic
import dev.chiksmedina.solar.lineduotone.astronomy.StarFallMinimalistic2
import dev.chiksmedina.solar.lineduotone.astronomy.StarRainbow
import dev.chiksmedina.solar.lineduotone.astronomy.StarRing
import dev.chiksmedina.solar.lineduotone.astronomy.StarRings
import dev.chiksmedina.solar.lineduotone.astronomy.Stars
import dev.chiksmedina.solar.lineduotone.astronomy.StarsLine
import dev.chiksmedina.solar.lineduotone.astronomy.StarsMinimalistic
import dev.chiksmedina.solar.lineduotone.astronomy.Ufo
import dev.chiksmedina.solar.lineduotone.astronomy.Ufo2
import dev.chiksmedina.solar.lineduotone.astronomy.Ufo3
import dev.chiksmedina.solar.lineduotone.astronomy.Women
import kotlin.collections.List as KtList

object AstronomyGroup

val LineDuotoneSolar.Astronomy: AstronomyGroup
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
