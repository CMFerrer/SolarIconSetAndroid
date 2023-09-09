package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.astronomy.Asteroid
import com.chiksmedina.solar.outline.astronomy.Atom
import com.chiksmedina.solar.outline.astronomy.BlackHole
import com.chiksmedina.solar.outline.astronomy.BlackHole2
import com.chiksmedina.solar.outline.astronomy.BlackHole3
import com.chiksmedina.solar.outline.astronomy.Earth
import com.chiksmedina.solar.outline.astronomy.Infinity
import com.chiksmedina.solar.outline.astronomy.Men
import com.chiksmedina.solar.outline.astronomy.Planet
import com.chiksmedina.solar.outline.astronomy.Planet2
import com.chiksmedina.solar.outline.astronomy.Planet3
import com.chiksmedina.solar.outline.astronomy.Planet4
import com.chiksmedina.solar.outline.astronomy.Rocket
import com.chiksmedina.solar.outline.astronomy.Rocket2
import com.chiksmedina.solar.outline.astronomy.Satellite
import com.chiksmedina.solar.outline.astronomy.Star
import com.chiksmedina.solar.outline.astronomy.StarAngle
import com.chiksmedina.solar.outline.astronomy.StarCircle
import com.chiksmedina.solar.outline.astronomy.StarFall
import com.chiksmedina.solar.outline.astronomy.StarFall2
import com.chiksmedina.solar.outline.astronomy.StarFallMinimalistic
import com.chiksmedina.solar.outline.astronomy.StarFallMinimalistic2
import com.chiksmedina.solar.outline.astronomy.StarRainbow
import com.chiksmedina.solar.outline.astronomy.StarRing
import com.chiksmedina.solar.outline.astronomy.StarRings
import com.chiksmedina.solar.outline.astronomy.Stars
import com.chiksmedina.solar.outline.astronomy.StarsLine
import com.chiksmedina.solar.outline.astronomy.StarsMinimalistic
import com.chiksmedina.solar.outline.astronomy.Ufo
import com.chiksmedina.solar.outline.astronomy.Ufo2
import com.chiksmedina.solar.outline.astronomy.Ufo3
import com.chiksmedina.solar.outline.astronomy.Women
import kotlin.collections.List as ____KtList

public object AstronomyGroup

public val OutlineGroup.Astronomy: AstronomyGroup
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
