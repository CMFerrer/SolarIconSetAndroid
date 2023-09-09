package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.sports.Balls
import com.chiksmedina.solar.broken.sports.Basketball
import com.chiksmedina.solar.broken.sports.Bicycling
import com.chiksmedina.solar.broken.sports.BicyclingRound
import com.chiksmedina.solar.broken.sports.BodyShape
import com.chiksmedina.solar.broken.sports.BodyShapeMinimalistic
import com.chiksmedina.solar.broken.sports.Bowling
import com.chiksmedina.solar.broken.sports.Dumbbell
import com.chiksmedina.solar.broken.sports.DumbbellLarge
import com.chiksmedina.solar.broken.sports.DumbbellLargeMinimalistic
import com.chiksmedina.solar.broken.sports.DumbbellSmall
import com.chiksmedina.solar.broken.sports.Dumbbells
import com.chiksmedina.solar.broken.sports.Dumbbells2
import com.chiksmedina.solar.broken.sports.Football
import com.chiksmedina.solar.broken.sports.Golf
import com.chiksmedina.solar.broken.sports.Hiking
import com.chiksmedina.solar.broken.sports.HikingMinimalistic
import com.chiksmedina.solar.broken.sports.HikingRound
import com.chiksmedina.solar.broken.sports.Meditation
import com.chiksmedina.solar.broken.sports.MeditationRound
import com.chiksmedina.solar.broken.sports.Ranking
import com.chiksmedina.solar.broken.sports.Rugby
import com.chiksmedina.solar.broken.sports.Running
import com.chiksmedina.solar.broken.sports.Running2
import com.chiksmedina.solar.broken.sports.RunningRound
import com.chiksmedina.solar.broken.sports.Skateboard
import com.chiksmedina.solar.broken.sports.Skateboarding
import com.chiksmedina.solar.broken.sports.SkateboardingRound
import com.chiksmedina.solar.broken.sports.Stretching
import com.chiksmedina.solar.broken.sports.StretchingRound
import com.chiksmedina.solar.broken.sports.Swimming
import com.chiksmedina.solar.broken.sports.Tennis
import com.chiksmedina.solar.broken.sports.Tennis2
import com.chiksmedina.solar.broken.sports.Treadmill
import com.chiksmedina.solar.broken.sports.TreadmillRound
import com.chiksmedina.solar.broken.sports.Volleyball
import com.chiksmedina.solar.broken.sports.Volleyball2
import com.chiksmedina.solar.broken.sports.Walking
import com.chiksmedina.solar.broken.sports.WalkingRound
import com.chiksmedina.solar.broken.sports.Water
import com.chiksmedina.solar.broken.sports.WaterSun
import kotlin.collections.List as ____KtList

public object SportsGroup

public val BrokenGroup.Sports: SportsGroup
  get() = SportsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SportsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Balls, Basketball, Bicycling, BicyclingRound, BodyShape,
        BodyShapeMinimalistic, Bowling, Dumbbell, Dumbbells, Dumbbells2, DumbbellLarge,
        DumbbellLargeMinimalistic, DumbbellSmall, Football, Golf, Hiking, HikingMinimalistic,
        HikingRound, Meditation, MeditationRound, Ranking, Rugby, Running, Running2, RunningRound,
        Skateboard, Skateboarding, SkateboardingRound, Stretching, StretchingRound, Swimming,
        Tennis, Tennis2, Treadmill, TreadmillRound, Volleyball, Volleyball2, Walking, WalkingRound,
        Water, WaterSun)
    return __AllIcons!!
  }
