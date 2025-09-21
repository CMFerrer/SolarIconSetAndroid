package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.sports.Balls
import dev.chiksmedina.solar.bold.sports.Basketball
import dev.chiksmedina.solar.bold.sports.Bicycling
import dev.chiksmedina.solar.bold.sports.BicyclingRound
import dev.chiksmedina.solar.bold.sports.BodyShape
import dev.chiksmedina.solar.bold.sports.BodyShapeMinimalistic
import dev.chiksmedina.solar.bold.sports.Bowling
import dev.chiksmedina.solar.bold.sports.Dumbbell
import dev.chiksmedina.solar.bold.sports.DumbbellLarge
import dev.chiksmedina.solar.bold.sports.DumbbellLargeMinimalistic
import dev.chiksmedina.solar.bold.sports.DumbbellSmall
import dev.chiksmedina.solar.bold.sports.Dumbbells
import dev.chiksmedina.solar.bold.sports.Dumbbells2
import dev.chiksmedina.solar.bold.sports.Football
import dev.chiksmedina.solar.bold.sports.Golf
import dev.chiksmedina.solar.bold.sports.Hiking
import dev.chiksmedina.solar.bold.sports.HikingMinimalistic
import dev.chiksmedina.solar.bold.sports.HikingRound
import dev.chiksmedina.solar.bold.sports.Meditation
import dev.chiksmedina.solar.bold.sports.MeditationRound
import dev.chiksmedina.solar.bold.sports.Ranking
import dev.chiksmedina.solar.bold.sports.Rugby
import dev.chiksmedina.solar.bold.sports.Running
import dev.chiksmedina.solar.bold.sports.Running2
import dev.chiksmedina.solar.bold.sports.RunningRound
import dev.chiksmedina.solar.bold.sports.Skateboard
import dev.chiksmedina.solar.bold.sports.Skateboarding
import dev.chiksmedina.solar.bold.sports.SkateboardingRound
import dev.chiksmedina.solar.bold.sports.Stretching
import dev.chiksmedina.solar.bold.sports.StretchingRound
import dev.chiksmedina.solar.bold.sports.Swimming
import dev.chiksmedina.solar.bold.sports.Tennis
import dev.chiksmedina.solar.bold.sports.Tennis2
import dev.chiksmedina.solar.bold.sports.Treadmill
import dev.chiksmedina.solar.bold.sports.TreadmillRound
import dev.chiksmedina.solar.bold.sports.Volleyball
import dev.chiksmedina.solar.bold.sports.Volleyball2
import dev.chiksmedina.solar.bold.sports.Walking
import dev.chiksmedina.solar.bold.sports.WalkingRound
import dev.chiksmedina.solar.bold.sports.Water
import dev.chiksmedina.solar.bold.sports.WaterSun
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
