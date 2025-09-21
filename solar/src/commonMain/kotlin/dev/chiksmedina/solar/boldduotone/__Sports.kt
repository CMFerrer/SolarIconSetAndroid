package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.sports.Balls
import dev.chiksmedina.solar.boldduotone.sports.Basketball
import dev.chiksmedina.solar.boldduotone.sports.Bicycling
import dev.chiksmedina.solar.boldduotone.sports.BicyclingRound
import dev.chiksmedina.solar.boldduotone.sports.BodyShape
import dev.chiksmedina.solar.boldduotone.sports.BodyShapeMinimalistic
import dev.chiksmedina.solar.boldduotone.sports.Bowling
import dev.chiksmedina.solar.boldduotone.sports.Dumbbell
import dev.chiksmedina.solar.boldduotone.sports.DumbbellLarge
import dev.chiksmedina.solar.boldduotone.sports.DumbbellLargeMinimalistic
import dev.chiksmedina.solar.boldduotone.sports.DumbbellSmall
import dev.chiksmedina.solar.boldduotone.sports.Dumbbells
import dev.chiksmedina.solar.boldduotone.sports.Dumbbells2
import dev.chiksmedina.solar.boldduotone.sports.Football
import dev.chiksmedina.solar.boldduotone.sports.Golf
import dev.chiksmedina.solar.boldduotone.sports.Hiking
import dev.chiksmedina.solar.boldduotone.sports.HikingMinimalistic
import dev.chiksmedina.solar.boldduotone.sports.HikingRound
import dev.chiksmedina.solar.boldduotone.sports.Meditation
import dev.chiksmedina.solar.boldduotone.sports.MeditationRound
import dev.chiksmedina.solar.boldduotone.sports.Ranking
import dev.chiksmedina.solar.boldduotone.sports.Rugby
import dev.chiksmedina.solar.boldduotone.sports.Running
import dev.chiksmedina.solar.boldduotone.sports.Running2
import dev.chiksmedina.solar.boldduotone.sports.RunningRound
import dev.chiksmedina.solar.boldduotone.sports.Skateboard
import dev.chiksmedina.solar.boldduotone.sports.Skateboarding
import dev.chiksmedina.solar.boldduotone.sports.SkateboardingRound
import dev.chiksmedina.solar.boldduotone.sports.Stretching
import dev.chiksmedina.solar.boldduotone.sports.StretchingRound
import dev.chiksmedina.solar.boldduotone.sports.Swimming
import dev.chiksmedina.solar.boldduotone.sports.Tennis
import dev.chiksmedina.solar.boldduotone.sports.Tennis2
import dev.chiksmedina.solar.boldduotone.sports.Treadmill
import dev.chiksmedina.solar.boldduotone.sports.TreadmillRound
import dev.chiksmedina.solar.boldduotone.sports.Volleyball
import dev.chiksmedina.solar.boldduotone.sports.Volleyball2
import dev.chiksmedina.solar.boldduotone.sports.Walking
import dev.chiksmedina.solar.boldduotone.sports.WalkingRound
import dev.chiksmedina.solar.boldduotone.sports.Water
import dev.chiksmedina.solar.boldduotone.sports.WaterSun
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
