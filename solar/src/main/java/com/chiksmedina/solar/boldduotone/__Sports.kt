package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.sports.Balls
import com.chiksmedina.solar.boldduotone.sports.Basketball
import com.chiksmedina.solar.boldduotone.sports.Bicycling
import com.chiksmedina.solar.boldduotone.sports.BicyclingRound
import com.chiksmedina.solar.boldduotone.sports.BodyShape
import com.chiksmedina.solar.boldduotone.sports.BodyShapeMinimalistic
import com.chiksmedina.solar.boldduotone.sports.Bowling
import com.chiksmedina.solar.boldduotone.sports.Dumbbell
import com.chiksmedina.solar.boldduotone.sports.DumbbellLarge
import com.chiksmedina.solar.boldduotone.sports.DumbbellLargeMinimalistic
import com.chiksmedina.solar.boldduotone.sports.DumbbellSmall
import com.chiksmedina.solar.boldduotone.sports.Dumbbells
import com.chiksmedina.solar.boldduotone.sports.Dumbbells2
import com.chiksmedina.solar.boldduotone.sports.Football
import com.chiksmedina.solar.boldduotone.sports.Golf
import com.chiksmedina.solar.boldduotone.sports.Hiking
import com.chiksmedina.solar.boldduotone.sports.HikingMinimalistic
import com.chiksmedina.solar.boldduotone.sports.HikingRound
import com.chiksmedina.solar.boldduotone.sports.Meditation
import com.chiksmedina.solar.boldduotone.sports.MeditationRound
import com.chiksmedina.solar.boldduotone.sports.Ranking
import com.chiksmedina.solar.boldduotone.sports.Rugby
import com.chiksmedina.solar.boldduotone.sports.Running
import com.chiksmedina.solar.boldduotone.sports.Running2
import com.chiksmedina.solar.boldduotone.sports.RunningRound
import com.chiksmedina.solar.boldduotone.sports.Skateboard
import com.chiksmedina.solar.boldduotone.sports.Skateboarding
import com.chiksmedina.solar.boldduotone.sports.SkateboardingRound
import com.chiksmedina.solar.boldduotone.sports.Stretching
import com.chiksmedina.solar.boldduotone.sports.StretchingRound
import com.chiksmedina.solar.boldduotone.sports.Swimming
import com.chiksmedina.solar.boldduotone.sports.Tennis
import com.chiksmedina.solar.boldduotone.sports.Tennis2
import com.chiksmedina.solar.boldduotone.sports.Treadmill
import com.chiksmedina.solar.boldduotone.sports.TreadmillRound
import com.chiksmedina.solar.boldduotone.sports.Volleyball
import com.chiksmedina.solar.boldduotone.sports.Volleyball2
import com.chiksmedina.solar.boldduotone.sports.Walking
import com.chiksmedina.solar.boldduotone.sports.WalkingRound
import com.chiksmedina.solar.boldduotone.sports.Water
import com.chiksmedina.solar.boldduotone.sports.WaterSun
import kotlin.collections.List as KtList

object SportsGroup

val BoldDuotoneSolar.Sports: SportsGroup
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
