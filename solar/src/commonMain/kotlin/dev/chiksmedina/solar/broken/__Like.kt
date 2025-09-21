package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.like.Dislike
import dev.chiksmedina.solar.broken.like.Heart
import dev.chiksmedina.solar.broken.like.HeartAngle
import dev.chiksmedina.solar.broken.like.HeartBroken
import dev.chiksmedina.solar.broken.like.HeartLock
import dev.chiksmedina.solar.broken.like.HeartShine
import dev.chiksmedina.solar.broken.like.HeartUnlock
import dev.chiksmedina.solar.broken.like.Hearts
import dev.chiksmedina.solar.broken.like.Like
import dev.chiksmedina.solar.broken.like.MedalRibbon
import dev.chiksmedina.solar.broken.like.MedalRibbonStar
import dev.chiksmedina.solar.broken.like.MedalRibbonsStar
import dev.chiksmedina.solar.broken.like.MedalStar
import dev.chiksmedina.solar.broken.like.MedalStarCircle
import dev.chiksmedina.solar.broken.like.MedalStarSquare
import dev.chiksmedina.solar.broken.like.Star
import dev.chiksmedina.solar.broken.like.StarShine
import kotlin.collections.List as KtList

object LikeGroup

val BrokenSolar.Like: LikeGroup
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
