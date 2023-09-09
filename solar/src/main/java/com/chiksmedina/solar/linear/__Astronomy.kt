package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.astronomy.Asteroid
import com.chiksmedina.solar.linear.astronomy.Atom
import com.chiksmedina.solar.linear.astronomy.BlackHole
import com.chiksmedina.solar.linear.astronomy.BlackHole2
import com.chiksmedina.solar.linear.astronomy.BlackHole3
import com.chiksmedina.solar.linear.astronomy.Earth
import com.chiksmedina.solar.linear.astronomy.Infinity
import com.chiksmedina.solar.linear.astronomy.Men
import com.chiksmedina.solar.linear.astronomy.Planet
import com.chiksmedina.solar.linear.astronomy.Planet2
import com.chiksmedina.solar.linear.astronomy.Planet3
import com.chiksmedina.solar.linear.astronomy.Planet4
import com.chiksmedina.solar.linear.astronomy.Rocket
import com.chiksmedina.solar.linear.astronomy.Rocket2
import com.chiksmedina.solar.linear.astronomy.Satellite
import com.chiksmedina.solar.linear.astronomy.Star
import com.chiksmedina.solar.linear.astronomy.StarAngle
import com.chiksmedina.solar.linear.astronomy.StarCircle
import com.chiksmedina.solar.linear.astronomy.StarFall
import com.chiksmedina.solar.linear.astronomy.StarFall2
import com.chiksmedina.solar.linear.astronomy.StarFallMinimalistic
import com.chiksmedina.solar.linear.astronomy.StarFallMinimalistic2
import com.chiksmedina.solar.linear.astronomy.StarRainbow
import com.chiksmedina.solar.linear.astronomy.StarRing
import com.chiksmedina.solar.linear.astronomy.StarRings
import com.chiksmedina.solar.linear.astronomy.Stars
import com.chiksmedina.solar.linear.astronomy.StarsLine
import com.chiksmedina.solar.linear.astronomy.StarsMinimalistic
import com.chiksmedina.solar.linear.astronomy.Ufo
import com.chiksmedina.solar.linear.astronomy.Ufo2
import com.chiksmedina.solar.linear.astronomy.Ufo3
import com.chiksmedina.solar.linear.astronomy.Women
import kotlin.collections.List as ____KtList

public object AstronomyGroup

public val LinearGroup.Astronomy: AstronomyGroup
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
