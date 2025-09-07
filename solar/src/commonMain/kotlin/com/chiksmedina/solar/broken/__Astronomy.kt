package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.astronomy.Asteroid
import com.chiksmedina.solar.broken.astronomy.Atom
import com.chiksmedina.solar.broken.astronomy.BlackHole
import com.chiksmedina.solar.broken.astronomy.BlackHole2
import com.chiksmedina.solar.broken.astronomy.BlackHole3
import com.chiksmedina.solar.broken.astronomy.Earth
import com.chiksmedina.solar.broken.astronomy.Infinity
import com.chiksmedina.solar.broken.astronomy.Men
import com.chiksmedina.solar.broken.astronomy.Planet
import com.chiksmedina.solar.broken.astronomy.Planet2
import com.chiksmedina.solar.broken.astronomy.Planet3
import com.chiksmedina.solar.broken.astronomy.Planet4
import com.chiksmedina.solar.broken.astronomy.Rocket
import com.chiksmedina.solar.broken.astronomy.Rocket2
import com.chiksmedina.solar.broken.astronomy.Satellite
import com.chiksmedina.solar.broken.astronomy.Star
import com.chiksmedina.solar.broken.astronomy.StarAngle
import com.chiksmedina.solar.broken.astronomy.StarCircle
import com.chiksmedina.solar.broken.astronomy.StarFall
import com.chiksmedina.solar.broken.astronomy.StarFall2
import com.chiksmedina.solar.broken.astronomy.StarFallMinimalistic
import com.chiksmedina.solar.broken.astronomy.StarFallMinimalistic2
import com.chiksmedina.solar.broken.astronomy.StarRainbow
import com.chiksmedina.solar.broken.astronomy.StarRing
import com.chiksmedina.solar.broken.astronomy.StarRings
import com.chiksmedina.solar.broken.astronomy.Stars
import com.chiksmedina.solar.broken.astronomy.StarsLine
import com.chiksmedina.solar.broken.astronomy.StarsMinimalistic
import com.chiksmedina.solar.broken.astronomy.Ufo
import com.chiksmedina.solar.broken.astronomy.Ufo2
import com.chiksmedina.solar.broken.astronomy.Ufo3
import com.chiksmedina.solar.broken.astronomy.Women
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
