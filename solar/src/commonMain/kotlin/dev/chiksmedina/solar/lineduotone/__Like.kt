package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.like.Dislike
import dev.chiksmedina.solar.lineduotone.like.Heart
import dev.chiksmedina.solar.lineduotone.like.HeartAngle
import dev.chiksmedina.solar.lineduotone.like.HeartBroken
import dev.chiksmedina.solar.lineduotone.like.HeartLock
import dev.chiksmedina.solar.lineduotone.like.HeartShine
import dev.chiksmedina.solar.lineduotone.like.HeartUnlock
import dev.chiksmedina.solar.lineduotone.like.Hearts
import dev.chiksmedina.solar.lineduotone.like.Like
import dev.chiksmedina.solar.lineduotone.like.MedalRibbon
import dev.chiksmedina.solar.lineduotone.like.MedalRibbonStar
import dev.chiksmedina.solar.lineduotone.like.MedalRibbonsStar
import dev.chiksmedina.solar.lineduotone.like.MedalStar
import dev.chiksmedina.solar.lineduotone.like.MedalStarCircle
import dev.chiksmedina.solar.lineduotone.like.MedalStarSquare
import dev.chiksmedina.solar.lineduotone.like.Star
import dev.chiksmedina.solar.lineduotone.like.StarShine
import kotlin.collections.List as KtList

object LikeGroup

val LineDuotoneSolar.Like: LikeGroup
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
