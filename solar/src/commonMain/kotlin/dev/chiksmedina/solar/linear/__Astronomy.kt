package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.astronomy.Asteroid
import dev.chiksmedina.solar.linear.astronomy.Atom
import dev.chiksmedina.solar.linear.astronomy.BlackHole
import dev.chiksmedina.solar.linear.astronomy.BlackHole2
import dev.chiksmedina.solar.linear.astronomy.BlackHole3
import dev.chiksmedina.solar.linear.astronomy.Earth
import dev.chiksmedina.solar.linear.astronomy.Infinity
import dev.chiksmedina.solar.linear.astronomy.Men
import dev.chiksmedina.solar.linear.astronomy.Planet
import dev.chiksmedina.solar.linear.astronomy.Planet2
import dev.chiksmedina.solar.linear.astronomy.Planet3
import dev.chiksmedina.solar.linear.astronomy.Planet4
import dev.chiksmedina.solar.linear.astronomy.Rocket
import dev.chiksmedina.solar.linear.astronomy.Rocket2
import dev.chiksmedina.solar.linear.astronomy.Satellite
import dev.chiksmedina.solar.linear.astronomy.Star
import dev.chiksmedina.solar.linear.astronomy.StarAngle
import dev.chiksmedina.solar.linear.astronomy.StarCircle
import dev.chiksmedina.solar.linear.astronomy.StarFall
import dev.chiksmedina.solar.linear.astronomy.StarFall2
import dev.chiksmedina.solar.linear.astronomy.StarFallMinimalistic
import dev.chiksmedina.solar.linear.astronomy.StarFallMinimalistic2
import dev.chiksmedina.solar.linear.astronomy.StarRainbow
import dev.chiksmedina.solar.linear.astronomy.StarRing
import dev.chiksmedina.solar.linear.astronomy.StarRings
import dev.chiksmedina.solar.linear.astronomy.Stars
import dev.chiksmedina.solar.linear.astronomy.StarsLine
import dev.chiksmedina.solar.linear.astronomy.StarsMinimalistic
import dev.chiksmedina.solar.linear.astronomy.Ufo
import dev.chiksmedina.solar.linear.astronomy.Ufo2
import dev.chiksmedina.solar.linear.astronomy.Ufo3
import dev.chiksmedina.solar.linear.astronomy.Women
import kotlin.collections.List as KtList

object AstronomyGroup

val LinearSolar.Astronomy: AstronomyGroup
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
