package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.sports.Balls
import com.chiksmedina.solar.outline.sports.Basketball
import com.chiksmedina.solar.outline.sports.Bicycling
import com.chiksmedina.solar.outline.sports.BicyclingRound
import com.chiksmedina.solar.outline.sports.BodyShape
import com.chiksmedina.solar.outline.sports.BodyShapeMinimalistic
import com.chiksmedina.solar.outline.sports.Bowling
import com.chiksmedina.solar.outline.sports.Dumbbell
import com.chiksmedina.solar.outline.sports.DumbbellLarge
import com.chiksmedina.solar.outline.sports.DumbbellLargeMinimalistic
import com.chiksmedina.solar.outline.sports.DumbbellSmall
import com.chiksmedina.solar.outline.sports.Dumbbells
import com.chiksmedina.solar.outline.sports.Dumbbells2
import com.chiksmedina.solar.outline.sports.Football
import com.chiksmedina.solar.outline.sports.Golf
import com.chiksmedina.solar.outline.sports.Hiking
import com.chiksmedina.solar.outline.sports.HikingMinimalistic
import com.chiksmedina.solar.outline.sports.HikingRound
import com.chiksmedina.solar.outline.sports.Meditation
import com.chiksmedina.solar.outline.sports.MeditationRound
import com.chiksmedina.solar.outline.sports.Ranking
import com.chiksmedina.solar.outline.sports.Rugby
import com.chiksmedina.solar.outline.sports.Running
import com.chiksmedina.solar.outline.sports.Running2
import com.chiksmedina.solar.outline.sports.RunningRound
import com.chiksmedina.solar.outline.sports.Skateboard
import com.chiksmedina.solar.outline.sports.Skateboarding
import com.chiksmedina.solar.outline.sports.SkateboardingRound
import com.chiksmedina.solar.outline.sports.Stretching
import com.chiksmedina.solar.outline.sports.StretchingRound
import com.chiksmedina.solar.outline.sports.Swimming
import com.chiksmedina.solar.outline.sports.Tennis
import com.chiksmedina.solar.outline.sports.Tennis2
import com.chiksmedina.solar.outline.sports.Treadmill
import com.chiksmedina.solar.outline.sports.TreadmillRound
import com.chiksmedina.solar.outline.sports.Volleyball
import com.chiksmedina.solar.outline.sports.Volleyball2
import com.chiksmedina.solar.outline.sports.Walking
import com.chiksmedina.solar.outline.sports.WalkingRound
import com.chiksmedina.solar.outline.sports.Water
import com.chiksmedina.solar.outline.sports.WaterSun
import kotlin.collections.List as KtList

object SportsGroup

val OutlineSolar.Sports: SportsGroup
    get() = SportsGroup

private var _AllIcons: KtList<ImageVector>? = null

val SportsGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Balls,
            Basketball,
            Bicycling,
            BicyclingRound,
            BodyShape,
            BodyShapeMinimalistic,
            Bowling,
            Dumbbell,
            Dumbbells,
            Dumbbells2,
            DumbbellLarge,
            DumbbellLargeMinimalistic,
            DumbbellSmall,
            Football,
            Golf,
            Hiking,
            HikingMinimalistic,
            HikingRound,
            Meditation,
            MeditationRound,
            Ranking,
            Rugby,
            Running,
            Running2,
            RunningRound,
            Skateboard,
            Skateboarding,
            SkateboardingRound,
            Stretching,
            StretchingRound,
            Swimming,
            Tennis,
            Tennis2,
            Treadmill,
            TreadmillRound,
            Volleyball,
            Volleyball2,
            Walking,
            WalkingRound,
            Water,
            WaterSun
        )
        return _AllIcons!!
    }
