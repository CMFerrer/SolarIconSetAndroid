package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.like.Dislike
import dev.chiksmedina.solar.linear.like.Heart
import dev.chiksmedina.solar.linear.like.HeartAngle
import dev.chiksmedina.solar.linear.like.HeartBroken
import dev.chiksmedina.solar.linear.like.HeartLock
import dev.chiksmedina.solar.linear.like.HeartShine
import dev.chiksmedina.solar.linear.like.HeartUnlock
import dev.chiksmedina.solar.linear.like.Hearts
import dev.chiksmedina.solar.linear.like.Like
import dev.chiksmedina.solar.linear.like.MedalRibbon
import dev.chiksmedina.solar.linear.like.MedalRibbonStar
import dev.chiksmedina.solar.linear.like.MedalRibbonsStar
import dev.chiksmedina.solar.linear.like.MedalStar
import dev.chiksmedina.solar.linear.like.MedalStarCircle
import dev.chiksmedina.solar.linear.like.MedalStarSquare
import dev.chiksmedina.solar.linear.like.Star
import dev.chiksmedina.solar.linear.like.StarShine
import kotlin.collections.List as KtList

object LikeGroup

val LinearSolar.Like: LikeGroup
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
