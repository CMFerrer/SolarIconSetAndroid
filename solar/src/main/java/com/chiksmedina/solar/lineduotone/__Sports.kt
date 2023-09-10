package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.sports.Balls
import com.chiksmedina.solar.lineduotone.sports.Basketball
import com.chiksmedina.solar.lineduotone.sports.Bicycling
import com.chiksmedina.solar.lineduotone.sports.BicyclingRound
import com.chiksmedina.solar.lineduotone.sports.BodyShape
import com.chiksmedina.solar.lineduotone.sports.BodyShapeMinimalistic
import com.chiksmedina.solar.lineduotone.sports.Bowling
import com.chiksmedina.solar.lineduotone.sports.Dumbbell
import com.chiksmedina.solar.lineduotone.sports.DumbbellLarge
import com.chiksmedina.solar.lineduotone.sports.DumbbellLargeMinimalistic
import com.chiksmedina.solar.lineduotone.sports.DumbbellSmall
import com.chiksmedina.solar.lineduotone.sports.Dumbbells
import com.chiksmedina.solar.lineduotone.sports.Dumbbells2
import com.chiksmedina.solar.lineduotone.sports.Football
import com.chiksmedina.solar.lineduotone.sports.Golf
import com.chiksmedina.solar.lineduotone.sports.Hiking
import com.chiksmedina.solar.lineduotone.sports.HikingMinimalistic
import com.chiksmedina.solar.lineduotone.sports.HikingRound
import com.chiksmedina.solar.lineduotone.sports.Meditation
import com.chiksmedina.solar.lineduotone.sports.MeditationRound
import com.chiksmedina.solar.lineduotone.sports.Ranking
import com.chiksmedina.solar.lineduotone.sports.Rugby
import com.chiksmedina.solar.lineduotone.sports.Running
import com.chiksmedina.solar.lineduotone.sports.Running2
import com.chiksmedina.solar.lineduotone.sports.RunningRound
import com.chiksmedina.solar.lineduotone.sports.Skateboard
import com.chiksmedina.solar.lineduotone.sports.Skateboarding
import com.chiksmedina.solar.lineduotone.sports.SkateboardingRound
import com.chiksmedina.solar.lineduotone.sports.Stretching
import com.chiksmedina.solar.lineduotone.sports.StretchingRound
import com.chiksmedina.solar.lineduotone.sports.Swimming
import com.chiksmedina.solar.lineduotone.sports.Tennis
import com.chiksmedina.solar.lineduotone.sports.Tennis2
import com.chiksmedina.solar.lineduotone.sports.Treadmill
import com.chiksmedina.solar.lineduotone.sports.TreadmillRound
import com.chiksmedina.solar.lineduotone.sports.Volleyball
import com.chiksmedina.solar.lineduotone.sports.Volleyball2
import com.chiksmedina.solar.lineduotone.sports.Walking
import com.chiksmedina.solar.lineduotone.sports.WalkingRound
import com.chiksmedina.solar.lineduotone.sports.Water
import com.chiksmedina.solar.lineduotone.sports.WaterSun
import kotlin.collections.List as KtList

object SportsGroup

val LineDuotoneSolar.Sports: SportsGroup
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
