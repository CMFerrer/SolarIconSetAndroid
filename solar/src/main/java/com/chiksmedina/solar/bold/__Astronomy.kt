package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.astronomy.Asteroid
import com.chiksmedina.solar.bold.astronomy.Atom
import com.chiksmedina.solar.bold.astronomy.BlackHole
import com.chiksmedina.solar.bold.astronomy.BlackHole2
import com.chiksmedina.solar.bold.astronomy.BlackHole3
import com.chiksmedina.solar.bold.astronomy.Earth
import com.chiksmedina.solar.bold.astronomy.Infinity
import com.chiksmedina.solar.bold.astronomy.Men
import com.chiksmedina.solar.bold.astronomy.Planet
import com.chiksmedina.solar.bold.astronomy.Planet2
import com.chiksmedina.solar.bold.astronomy.Planet3
import com.chiksmedina.solar.bold.astronomy.Planet4
import com.chiksmedina.solar.bold.astronomy.Rocket
import com.chiksmedina.solar.bold.astronomy.Rocket2
import com.chiksmedina.solar.bold.astronomy.Satellite
import com.chiksmedina.solar.bold.astronomy.Star
import com.chiksmedina.solar.bold.astronomy.StarAngle
import com.chiksmedina.solar.bold.astronomy.StarCircle
import com.chiksmedina.solar.bold.astronomy.StarFall
import com.chiksmedina.solar.bold.astronomy.StarFall2
import com.chiksmedina.solar.bold.astronomy.StarFallMinimalistic
import com.chiksmedina.solar.bold.astronomy.StarFallMinimalistic2
import com.chiksmedina.solar.bold.astronomy.StarRainbow
import com.chiksmedina.solar.bold.astronomy.StarRing
import com.chiksmedina.solar.bold.astronomy.StarRings
import com.chiksmedina.solar.bold.astronomy.Stars
import com.chiksmedina.solar.bold.astronomy.StarsLine
import com.chiksmedina.solar.bold.astronomy.StarsMinimalistic
import com.chiksmedina.solar.bold.astronomy.Ufo
import com.chiksmedina.solar.bold.astronomy.Ufo2
import com.chiksmedina.solar.bold.astronomy.Ufo3
import com.chiksmedina.solar.bold.astronomy.Women
import kotlin.collections.List as ____KtList

public object AstronomyGroup

public val BoldGroup.Astronomy: AstronomyGroup
  get() = AstronomyGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val AstronomyGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Asteroid, Atom, BlackHole, BlackHole2, BlackHole3, Earth, Infinity, Men,
        Planet, Planet2, Planet3, Planet4, Rocket, Rocket2, Satellite, Star, Stars, StarsLine,
        StarsMinimalistic, StarAngle, StarCircle, StarFall, StarFall2, StarFallMinimalistic,
        StarFallMinimalistic2, StarRainbow, StarRing, StarRings, Ufo, Ufo2, Ufo3, Women)
    return __AllIcons!!
  }
