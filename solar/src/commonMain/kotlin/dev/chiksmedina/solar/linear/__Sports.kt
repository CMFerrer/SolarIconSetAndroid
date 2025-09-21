package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.sports.Balls
import dev.chiksmedina.solar.linear.sports.Basketball
import dev.chiksmedina.solar.linear.sports.Bicycling
import dev.chiksmedina.solar.linear.sports.BicyclingRound
import dev.chiksmedina.solar.linear.sports.BodyShape
import dev.chiksmedina.solar.linear.sports.BodyShapeMinimalistic
import dev.chiksmedina.solar.linear.sports.Bowling
import dev.chiksmedina.solar.linear.sports.Dumbbell
import dev.chiksmedina.solar.linear.sports.DumbbellLarge
import dev.chiksmedina.solar.linear.sports.DumbbellLargeMinimalistic
import dev.chiksmedina.solar.linear.sports.DumbbellSmall
import dev.chiksmedina.solar.linear.sports.Dumbbells
import dev.chiksmedina.solar.linear.sports.Dumbbells2
import dev.chiksmedina.solar.linear.sports.Football
import dev.chiksmedina.solar.linear.sports.Golf
import dev.chiksmedina.solar.linear.sports.Hiking
import dev.chiksmedina.solar.linear.sports.HikingMinimalistic
import dev.chiksmedina.solar.linear.sports.HikingRound
import dev.chiksmedina.solar.linear.sports.Meditation
import dev.chiksmedina.solar.linear.sports.MeditationRound
import dev.chiksmedina.solar.linear.sports.Ranking
import dev.chiksmedina.solar.linear.sports.Rugby
import dev.chiksmedina.solar.linear.sports.Running
import dev.chiksmedina.solar.linear.sports.Running2
import dev.chiksmedina.solar.linear.sports.RunningRound
import dev.chiksmedina.solar.linear.sports.Skateboard
import dev.chiksmedina.solar.linear.sports.Skateboarding
import dev.chiksmedina.solar.linear.sports.SkateboardingRound
import dev.chiksmedina.solar.linear.sports.Stretching
import dev.chiksmedina.solar.linear.sports.StretchingRound
import dev.chiksmedina.solar.linear.sports.Swimming
import dev.chiksmedina.solar.linear.sports.Tennis
import dev.chiksmedina.solar.linear.sports.Tennis2
import dev.chiksmedina.solar.linear.sports.Treadmill
import dev.chiksmedina.solar.linear.sports.TreadmillRound
import dev.chiksmedina.solar.linear.sports.Volleyball
import dev.chiksmedina.solar.linear.sports.Volleyball2
import dev.chiksmedina.solar.linear.sports.Walking
import dev.chiksmedina.solar.linear.sports.WalkingRound
import dev.chiksmedina.solar.linear.sports.Water
import dev.chiksmedina.solar.linear.sports.WaterSun
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
