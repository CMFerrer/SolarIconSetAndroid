package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.astronomy.Asteroid
import com.chiksmedina.solar.boldduotone.astronomy.Atom
import com.chiksmedina.solar.boldduotone.astronomy.BlackHole
import com.chiksmedina.solar.boldduotone.astronomy.BlackHole2
import com.chiksmedina.solar.boldduotone.astronomy.BlackHole3
import com.chiksmedina.solar.boldduotone.astronomy.Earth
import com.chiksmedina.solar.boldduotone.astronomy.Infinity
import com.chiksmedina.solar.boldduotone.astronomy.Men
import com.chiksmedina.solar.boldduotone.astronomy.Planet
import com.chiksmedina.solar.boldduotone.astronomy.Planet2
import com.chiksmedina.solar.boldduotone.astronomy.Planet3
import com.chiksmedina.solar.boldduotone.astronomy.Planet4
import com.chiksmedina.solar.boldduotone.astronomy.Rocket
import com.chiksmedina.solar.boldduotone.astronomy.Rocket2
import com.chiksmedina.solar.boldduotone.astronomy.Satellite
import com.chiksmedina.solar.boldduotone.astronomy.Star
import com.chiksmedina.solar.boldduotone.astronomy.StarAngle
import com.chiksmedina.solar.boldduotone.astronomy.StarCircle
import com.chiksmedina.solar.boldduotone.astronomy.StarFall
import com.chiksmedina.solar.boldduotone.astronomy.StarFall2
import com.chiksmedina.solar.boldduotone.astronomy.StarFallMinimalistic
import com.chiksmedina.solar.boldduotone.astronomy.StarFallMinimalistic2
import com.chiksmedina.solar.boldduotone.astronomy.StarRainbow
import com.chiksmedina.solar.boldduotone.astronomy.StarRing
import com.chiksmedina.solar.boldduotone.astronomy.StarRings
import com.chiksmedina.solar.boldduotone.astronomy.Stars
import com.chiksmedina.solar.boldduotone.astronomy.StarsLine
import com.chiksmedina.solar.boldduotone.astronomy.StarsMinimalistic
import com.chiksmedina.solar.boldduotone.astronomy.Ufo
import com.chiksmedina.solar.boldduotone.astronomy.Ufo2
import com.chiksmedina.solar.boldduotone.astronomy.Ufo3
import com.chiksmedina.solar.boldduotone.astronomy.Women
import kotlin.collections.List as ____KtList

public object AstronomyGroup

public val BoldduotoneGroup.Astronomy: AstronomyGroup
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
