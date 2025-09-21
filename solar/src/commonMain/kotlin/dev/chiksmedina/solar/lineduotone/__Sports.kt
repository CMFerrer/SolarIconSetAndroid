package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.sports.Balls
import dev.chiksmedina.solar.lineduotone.sports.Basketball
import dev.chiksmedina.solar.lineduotone.sports.Bicycling
import dev.chiksmedina.solar.lineduotone.sports.BicyclingRound
import dev.chiksmedina.solar.lineduotone.sports.BodyShape
import dev.chiksmedina.solar.lineduotone.sports.BodyShapeMinimalistic
import dev.chiksmedina.solar.lineduotone.sports.Bowling
import dev.chiksmedina.solar.lineduotone.sports.Dumbbell
import dev.chiksmedina.solar.lineduotone.sports.DumbbellLarge
import dev.chiksmedina.solar.lineduotone.sports.DumbbellLargeMinimalistic
import dev.chiksmedina.solar.lineduotone.sports.DumbbellSmall
import dev.chiksmedina.solar.lineduotone.sports.Dumbbells
import dev.chiksmedina.solar.lineduotone.sports.Dumbbells2
import dev.chiksmedina.solar.lineduotone.sports.Football
import dev.chiksmedina.solar.lineduotone.sports.Golf
import dev.chiksmedina.solar.lineduotone.sports.Hiking
import dev.chiksmedina.solar.lineduotone.sports.HikingMinimalistic
import dev.chiksmedina.solar.lineduotone.sports.HikingRound
import dev.chiksmedina.solar.lineduotone.sports.Meditation
import dev.chiksmedina.solar.lineduotone.sports.MeditationRound
import dev.chiksmedina.solar.lineduotone.sports.Ranking
import dev.chiksmedina.solar.lineduotone.sports.Rugby
import dev.chiksmedina.solar.lineduotone.sports.Running
import dev.chiksmedina.solar.lineduotone.sports.Running2
import dev.chiksmedina.solar.lineduotone.sports.RunningRound
import dev.chiksmedina.solar.lineduotone.sports.Skateboard
import dev.chiksmedina.solar.lineduotone.sports.Skateboarding
import dev.chiksmedina.solar.lineduotone.sports.SkateboardingRound
import dev.chiksmedina.solar.lineduotone.sports.Stretching
import dev.chiksmedina.solar.lineduotone.sports.StretchingRound
import dev.chiksmedina.solar.lineduotone.sports.Swimming
import dev.chiksmedina.solar.lineduotone.sports.Tennis
import dev.chiksmedina.solar.lineduotone.sports.Tennis2
import dev.chiksmedina.solar.lineduotone.sports.Treadmill
import dev.chiksmedina.solar.lineduotone.sports.TreadmillRound
import dev.chiksmedina.solar.lineduotone.sports.Volleyball
import dev.chiksmedina.solar.lineduotone.sports.Volleyball2
import dev.chiksmedina.solar.lineduotone.sports.Walking
import dev.chiksmedina.solar.lineduotone.sports.WalkingRound
import dev.chiksmedina.solar.lineduotone.sports.Water
import dev.chiksmedina.solar.lineduotone.sports.WaterSun
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
