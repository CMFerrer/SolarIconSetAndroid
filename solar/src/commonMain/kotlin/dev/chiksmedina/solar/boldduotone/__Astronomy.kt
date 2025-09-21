package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.astronomy.Asteroid
import dev.chiksmedina.solar.boldduotone.astronomy.Atom
import dev.chiksmedina.solar.boldduotone.astronomy.BlackHole
import dev.chiksmedina.solar.boldduotone.astronomy.BlackHole2
import dev.chiksmedina.solar.boldduotone.astronomy.BlackHole3
import dev.chiksmedina.solar.boldduotone.astronomy.Earth
import dev.chiksmedina.solar.boldduotone.astronomy.Infinity
import dev.chiksmedina.solar.boldduotone.astronomy.Men
import dev.chiksmedina.solar.boldduotone.astronomy.Planet
import dev.chiksmedina.solar.boldduotone.astronomy.Planet2
import dev.chiksmedina.solar.boldduotone.astronomy.Planet3
import dev.chiksmedina.solar.boldduotone.astronomy.Planet4
import dev.chiksmedina.solar.boldduotone.astronomy.Rocket
import dev.chiksmedina.solar.boldduotone.astronomy.Rocket2
import dev.chiksmedina.solar.boldduotone.astronomy.Satellite
import dev.chiksmedina.solar.boldduotone.astronomy.Star
import dev.chiksmedina.solar.boldduotone.astronomy.StarAngle
import dev.chiksmedina.solar.boldduotone.astronomy.StarCircle
import dev.chiksmedina.solar.boldduotone.astronomy.StarFall
import dev.chiksmedina.solar.boldduotone.astronomy.StarFall2
import dev.chiksmedina.solar.boldduotone.astronomy.StarFallMinimalistic
import dev.chiksmedina.solar.boldduotone.astronomy.StarFallMinimalistic2
import dev.chiksmedina.solar.boldduotone.astronomy.StarRainbow
import dev.chiksmedina.solar.boldduotone.astronomy.StarRing
import dev.chiksmedina.solar.boldduotone.astronomy.StarRings
import dev.chiksmedina.solar.boldduotone.astronomy.Stars
import dev.chiksmedina.solar.boldduotone.astronomy.StarsLine
import dev.chiksmedina.solar.boldduotone.astronomy.StarsMinimalistic
import dev.chiksmedina.solar.boldduotone.astronomy.Ufo
import dev.chiksmedina.solar.boldduotone.astronomy.Ufo2
import dev.chiksmedina.solar.boldduotone.astronomy.Ufo3
import dev.chiksmedina.solar.boldduotone.astronomy.Women
import kotlin.collections.List as KtList

object AstronomyGroup

val BoldDuotoneSolar.Astronomy: AstronomyGroup
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
