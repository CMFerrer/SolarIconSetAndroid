package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.astronomy.Asteroid
import dev.chiksmedina.solar.bold.astronomy.Atom
import dev.chiksmedina.solar.bold.astronomy.BlackHole
import dev.chiksmedina.solar.bold.astronomy.BlackHole2
import dev.chiksmedina.solar.bold.astronomy.BlackHole3
import dev.chiksmedina.solar.bold.astronomy.Earth
import dev.chiksmedina.solar.bold.astronomy.Infinity
import dev.chiksmedina.solar.bold.astronomy.Men
import dev.chiksmedina.solar.bold.astronomy.Planet
import dev.chiksmedina.solar.bold.astronomy.Planet2
import dev.chiksmedina.solar.bold.astronomy.Planet3
import dev.chiksmedina.solar.bold.astronomy.Planet4
import dev.chiksmedina.solar.bold.astronomy.Rocket
import dev.chiksmedina.solar.bold.astronomy.Rocket2
import dev.chiksmedina.solar.bold.astronomy.Satellite
import dev.chiksmedina.solar.bold.astronomy.Star
import dev.chiksmedina.solar.bold.astronomy.StarAngle
import dev.chiksmedina.solar.bold.astronomy.StarCircle
import dev.chiksmedina.solar.bold.astronomy.StarFall
import dev.chiksmedina.solar.bold.astronomy.StarFall2
import dev.chiksmedina.solar.bold.astronomy.StarFallMinimalistic
import dev.chiksmedina.solar.bold.astronomy.StarFallMinimalistic2
import dev.chiksmedina.solar.bold.astronomy.StarRainbow
import dev.chiksmedina.solar.bold.astronomy.StarRing
import dev.chiksmedina.solar.bold.astronomy.StarRings
import dev.chiksmedina.solar.bold.astronomy.Stars
import dev.chiksmedina.solar.bold.astronomy.StarsLine
import dev.chiksmedina.solar.bold.astronomy.StarsMinimalistic
import dev.chiksmedina.solar.bold.astronomy.Ufo
import dev.chiksmedina.solar.bold.astronomy.Ufo2
import dev.chiksmedina.solar.bold.astronomy.Ufo3
import dev.chiksmedina.solar.bold.astronomy.Women
import kotlin.collections.List as KtList

object AstronomyGroup

val BoldSolar.Astronomy: AstronomyGroup
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
