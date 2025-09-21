package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.like.Dislike
import dev.chiksmedina.solar.boldduotone.like.Heart
import dev.chiksmedina.solar.boldduotone.like.HeartAngle
import dev.chiksmedina.solar.boldduotone.like.HeartBroken
import dev.chiksmedina.solar.boldduotone.like.HeartLock
import dev.chiksmedina.solar.boldduotone.like.HeartShine
import dev.chiksmedina.solar.boldduotone.like.HeartUnlock
import dev.chiksmedina.solar.boldduotone.like.Hearts
import dev.chiksmedina.solar.boldduotone.like.Like
import dev.chiksmedina.solar.boldduotone.like.MedalRibbon
import dev.chiksmedina.solar.boldduotone.like.MedalRibbonStar
import dev.chiksmedina.solar.boldduotone.like.MedalRibbonsStar
import dev.chiksmedina.solar.boldduotone.like.MedalStar
import dev.chiksmedina.solar.boldduotone.like.MedalStarCircle
import dev.chiksmedina.solar.boldduotone.like.MedalStarSquare
import dev.chiksmedina.solar.boldduotone.like.Star
import dev.chiksmedina.solar.boldduotone.like.StarShine
import kotlin.collections.List as KtList

object LikeGroup

val BoldDuotoneSolar.Like: LikeGroup
    get() = LikeGroup

private var _AllIcons: KtList<ImageVector>? = null

val LikeGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Dislike, Heart, Hearts, HeartAngle, HeartBroken, HeartLock, HeartShine,
            HeartUnlock, Like, MedalRibbon, MedalRibbonsStar, MedalRibbonStar, MedalStar,
            MedalStarCircle, MedalStarSquare, Star, StarShine
        )
        return _AllIcons!!
    }
