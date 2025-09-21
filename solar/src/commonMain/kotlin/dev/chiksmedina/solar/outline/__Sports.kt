package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.sports.Balls
import dev.chiksmedina.solar.outline.sports.Basketball
import dev.chiksmedina.solar.outline.sports.Bicycling
import dev.chiksmedina.solar.outline.sports.BicyclingRound
import dev.chiksmedina.solar.outline.sports.BodyShape
import dev.chiksmedina.solar.outline.sports.BodyShapeMinimalistic
import dev.chiksmedina.solar.outline.sports.Bowling
import dev.chiksmedina.solar.outline.sports.Dumbbell
import dev.chiksmedina.solar.outline.sports.DumbbellLarge
import dev.chiksmedina.solar.outline.sports.DumbbellLargeMinimalistic
import dev.chiksmedina.solar.outline.sports.DumbbellSmall
import dev.chiksmedina.solar.outline.sports.Dumbbells
import dev.chiksmedina.solar.outline.sports.Dumbbells2
import dev.chiksmedina.solar.outline.sports.Football
import dev.chiksmedina.solar.outline.sports.Golf
import dev.chiksmedina.solar.outline.sports.Hiking
import dev.chiksmedina.solar.outline.sports.HikingMinimalistic
import dev.chiksmedina.solar.outline.sports.HikingRound
import dev.chiksmedina.solar.outline.sports.Meditation
import dev.chiksmedina.solar.outline.sports.MeditationRound
import dev.chiksmedina.solar.outline.sports.Ranking
import dev.chiksmedina.solar.outline.sports.Rugby
import dev.chiksmedina.solar.outline.sports.Running
import dev.chiksmedina.solar.outline.sports.Running2
import dev.chiksmedina.solar.outline.sports.RunningRound
import dev.chiksmedina.solar.outline.sports.Skateboard
import dev.chiksmedina.solar.outline.sports.Skateboarding
import dev.chiksmedina.solar.outline.sports.SkateboardingRound
import dev.chiksmedina.solar.outline.sports.Stretching
import dev.chiksmedina.solar.outline.sports.StretchingRound
import dev.chiksmedina.solar.outline.sports.Swimming
import dev.chiksmedina.solar.outline.sports.Tennis
import dev.chiksmedina.solar.outline.sports.Tennis2
import dev.chiksmedina.solar.outline.sports.Treadmill
import dev.chiksmedina.solar.outline.sports.TreadmillRound
import dev.chiksmedina.solar.outline.sports.Volleyball
import dev.chiksmedina.solar.outline.sports.Volleyball2
import dev.chiksmedina.solar.outline.sports.Walking
import dev.chiksmedina.solar.outline.sports.WalkingRound
import dev.chiksmedina.solar.outline.sports.Water
import dev.chiksmedina.solar.outline.sports.WaterSun
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
