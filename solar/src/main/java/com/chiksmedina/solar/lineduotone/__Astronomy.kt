package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.astronomy.Asteroid
import com.chiksmedina.solar.lineduotone.astronomy.Atom
import com.chiksmedina.solar.lineduotone.astronomy.BlackHole
import com.chiksmedina.solar.lineduotone.astronomy.BlackHole2
import com.chiksmedina.solar.lineduotone.astronomy.BlackHole3
import com.chiksmedina.solar.lineduotone.astronomy.Earth
import com.chiksmedina.solar.lineduotone.astronomy.Infinity
import com.chiksmedina.solar.lineduotone.astronomy.Men
import com.chiksmedina.solar.lineduotone.astronomy.Planet
import com.chiksmedina.solar.lineduotone.astronomy.Planet2
import com.chiksmedina.solar.lineduotone.astronomy.Planet3
import com.chiksmedina.solar.lineduotone.astronomy.Planet4
import com.chiksmedina.solar.lineduotone.astronomy.Rocket
import com.chiksmedina.solar.lineduotone.astronomy.Rocket2
import com.chiksmedina.solar.lineduotone.astronomy.Satellite
import com.chiksmedina.solar.lineduotone.astronomy.Star
import com.chiksmedina.solar.lineduotone.astronomy.StarAngle
import com.chiksmedina.solar.lineduotone.astronomy.StarCircle
import com.chiksmedina.solar.lineduotone.astronomy.StarFall
import com.chiksmedina.solar.lineduotone.astronomy.StarFall2
import com.chiksmedina.solar.lineduotone.astronomy.StarFallMinimalistic
import com.chiksmedina.solar.lineduotone.astronomy.StarFallMinimalistic2
import com.chiksmedina.solar.lineduotone.astronomy.StarRainbow
import com.chiksmedina.solar.lineduotone.astronomy.StarRing
import com.chiksmedina.solar.lineduotone.astronomy.StarRings
import com.chiksmedina.solar.lineduotone.astronomy.Stars
import com.chiksmedina.solar.lineduotone.astronomy.StarsLine
import com.chiksmedina.solar.lineduotone.astronomy.StarsMinimalistic
import com.chiksmedina.solar.lineduotone.astronomy.Ufo
import com.chiksmedina.solar.lineduotone.astronomy.Ufo2
import com.chiksmedina.solar.lineduotone.astronomy.Ufo3
import com.chiksmedina.solar.lineduotone.astronomy.Women
import kotlin.collections.List as ____KtList

public object AstronomyGroup

public val LineduotoneGroup.Astronomy: AstronomyGroup
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
