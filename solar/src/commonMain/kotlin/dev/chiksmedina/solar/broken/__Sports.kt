package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.sports.Balls
import dev.chiksmedina.solar.broken.sports.Basketball
import dev.chiksmedina.solar.broken.sports.Bicycling
import dev.chiksmedina.solar.broken.sports.BicyclingRound
import dev.chiksmedina.solar.broken.sports.BodyShape
import dev.chiksmedina.solar.broken.sports.BodyShapeMinimalistic
import dev.chiksmedina.solar.broken.sports.Bowling
import dev.chiksmedina.solar.broken.sports.Dumbbell
import dev.chiksmedina.solar.broken.sports.DumbbellLarge
import dev.chiksmedina.solar.broken.sports.DumbbellLargeMinimalistic
import dev.chiksmedina.solar.broken.sports.DumbbellSmall
import dev.chiksmedina.solar.broken.sports.Dumbbells
import dev.chiksmedina.solar.broken.sports.Dumbbells2
import dev.chiksmedina.solar.broken.sports.Football
import dev.chiksmedina.solar.broken.sports.Golf
import dev.chiksmedina.solar.broken.sports.Hiking
import dev.chiksmedina.solar.broken.sports.HikingMinimalistic
import dev.chiksmedina.solar.broken.sports.HikingRound
import dev.chiksmedina.solar.broken.sports.Meditation
import dev.chiksmedina.solar.broken.sports.MeditationRound
import dev.chiksmedina.solar.broken.sports.Ranking
import dev.chiksmedina.solar.broken.sports.Rugby
import dev.chiksmedina.solar.broken.sports.Running
import dev.chiksmedina.solar.broken.sports.Running2
import dev.chiksmedina.solar.broken.sports.RunningRound
import dev.chiksmedina.solar.broken.sports.Skateboard
import dev.chiksmedina.solar.broken.sports.Skateboarding
import dev.chiksmedina.solar.broken.sports.SkateboardingRound
import dev.chiksmedina.solar.broken.sports.Stretching
import dev.chiksmedina.solar.broken.sports.StretchingRound
import dev.chiksmedina.solar.broken.sports.Swimming
import dev.chiksmedina.solar.broken.sports.Tennis
import dev.chiksmedina.solar.broken.sports.Tennis2
import dev.chiksmedina.solar.broken.sports.Treadmill
import dev.chiksmedina.solar.broken.sports.TreadmillRound
import dev.chiksmedina.solar.broken.sports.Volleyball
import dev.chiksmedina.solar.broken.sports.Volleyball2
import dev.chiksmedina.solar.broken.sports.Walking
import dev.chiksmedina.solar.broken.sports.WalkingRound
import dev.chiksmedina.solar.broken.sports.Water
import dev.chiksmedina.solar.broken.sports.WaterSun
import kotlin.collections.List as KtList

object SportsGroup

val BrokenSolar.Sports: SportsGroup
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
