package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.sports.Balls
import com.chiksmedina.solar.linear.sports.Basketball
import com.chiksmedina.solar.linear.sports.Bicycling
import com.chiksmedina.solar.linear.sports.BicyclingRound
import com.chiksmedina.solar.linear.sports.BodyShape
import com.chiksmedina.solar.linear.sports.BodyShapeMinimalistic
import com.chiksmedina.solar.linear.sports.Bowling
import com.chiksmedina.solar.linear.sports.Dumbbell
import com.chiksmedina.solar.linear.sports.DumbbellLarge
import com.chiksmedina.solar.linear.sports.DumbbellLargeMinimalistic
import com.chiksmedina.solar.linear.sports.DumbbellSmall
import com.chiksmedina.solar.linear.sports.Dumbbells
import com.chiksmedina.solar.linear.sports.Dumbbells2
import com.chiksmedina.solar.linear.sports.Football
import com.chiksmedina.solar.linear.sports.Golf
import com.chiksmedina.solar.linear.sports.Hiking
import com.chiksmedina.solar.linear.sports.HikingMinimalistic
import com.chiksmedina.solar.linear.sports.HikingRound
import com.chiksmedina.solar.linear.sports.Meditation
import com.chiksmedina.solar.linear.sports.MeditationRound
import com.chiksmedina.solar.linear.sports.Ranking
import com.chiksmedina.solar.linear.sports.Rugby
import com.chiksmedina.solar.linear.sports.Running
import com.chiksmedina.solar.linear.sports.Running2
import com.chiksmedina.solar.linear.sports.RunningRound
import com.chiksmedina.solar.linear.sports.Skateboard
import com.chiksmedina.solar.linear.sports.Skateboarding
import com.chiksmedina.solar.linear.sports.SkateboardingRound
import com.chiksmedina.solar.linear.sports.Stretching
import com.chiksmedina.solar.linear.sports.StretchingRound
import com.chiksmedina.solar.linear.sports.Swimming
import com.chiksmedina.solar.linear.sports.Tennis
import com.chiksmedina.solar.linear.sports.Tennis2
import com.chiksmedina.solar.linear.sports.Treadmill
import com.chiksmedina.solar.linear.sports.TreadmillRound
import com.chiksmedina.solar.linear.sports.Volleyball
import com.chiksmedina.solar.linear.sports.Volleyball2
import com.chiksmedina.solar.linear.sports.Walking
import com.chiksmedina.solar.linear.sports.WalkingRound
import com.chiksmedina.solar.linear.sports.Water
import com.chiksmedina.solar.linear.sports.WaterSun
import kotlin.collections.List as KtList

object SportsGroup

val LinearSolar.Sports: SportsGroup
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
