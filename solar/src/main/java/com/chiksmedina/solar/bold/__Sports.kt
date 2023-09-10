package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.sports.Balls
import com.chiksmedina.solar.bold.sports.Basketball
import com.chiksmedina.solar.bold.sports.Bicycling
import com.chiksmedina.solar.bold.sports.BicyclingRound
import com.chiksmedina.solar.bold.sports.BodyShape
import com.chiksmedina.solar.bold.sports.BodyShapeMinimalistic
import com.chiksmedina.solar.bold.sports.Bowling
import com.chiksmedina.solar.bold.sports.Dumbbell
import com.chiksmedina.solar.bold.sports.DumbbellLarge
import com.chiksmedina.solar.bold.sports.DumbbellLargeMinimalistic
import com.chiksmedina.solar.bold.sports.DumbbellSmall
import com.chiksmedina.solar.bold.sports.Dumbbells
import com.chiksmedina.solar.bold.sports.Dumbbells2
import com.chiksmedina.solar.bold.sports.Football
import com.chiksmedina.solar.bold.sports.Golf
import com.chiksmedina.solar.bold.sports.Hiking
import com.chiksmedina.solar.bold.sports.HikingMinimalistic
import com.chiksmedina.solar.bold.sports.HikingRound
import com.chiksmedina.solar.bold.sports.Meditation
import com.chiksmedina.solar.bold.sports.MeditationRound
import com.chiksmedina.solar.bold.sports.Ranking
import com.chiksmedina.solar.bold.sports.Rugby
import com.chiksmedina.solar.bold.sports.Running
import com.chiksmedina.solar.bold.sports.Running2
import com.chiksmedina.solar.bold.sports.RunningRound
import com.chiksmedina.solar.bold.sports.Skateboard
import com.chiksmedina.solar.bold.sports.Skateboarding
import com.chiksmedina.solar.bold.sports.SkateboardingRound
import com.chiksmedina.solar.bold.sports.Stretching
import com.chiksmedina.solar.bold.sports.StretchingRound
import com.chiksmedina.solar.bold.sports.Swimming
import com.chiksmedina.solar.bold.sports.Tennis
import com.chiksmedina.solar.bold.sports.Tennis2
import com.chiksmedina.solar.bold.sports.Treadmill
import com.chiksmedina.solar.bold.sports.TreadmillRound
import com.chiksmedina.solar.bold.sports.Volleyball
import com.chiksmedina.solar.bold.sports.Volleyball2
import com.chiksmedina.solar.bold.sports.Walking
import com.chiksmedina.solar.bold.sports.WalkingRound
import com.chiksmedina.solar.bold.sports.Water
import com.chiksmedina.solar.bold.sports.WaterSun
import kotlin.collections.List as KtList

object SportsGroup

val BoldSolar.Sports: SportsGroup
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
