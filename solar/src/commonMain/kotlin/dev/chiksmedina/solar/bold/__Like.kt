package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.like.Dislike
import dev.chiksmedina.solar.bold.like.Heart
import dev.chiksmedina.solar.bold.like.HeartAngle
import dev.chiksmedina.solar.bold.like.HeartBroken
import dev.chiksmedina.solar.bold.like.HeartLock
import dev.chiksmedina.solar.bold.like.HeartShine
import dev.chiksmedina.solar.bold.like.HeartUnlock
import dev.chiksmedina.solar.bold.like.Hearts
import dev.chiksmedina.solar.bold.like.Like
import dev.chiksmedina.solar.bold.like.MedalRibbon
import dev.chiksmedina.solar.bold.like.MedalRibbonStar
import dev.chiksmedina.solar.bold.like.MedalRibbonsStar
import dev.chiksmedina.solar.bold.like.MedalStar
import dev.chiksmedina.solar.bold.like.MedalStarCircle
import dev.chiksmedina.solar.bold.like.MedalStarSquare
import dev.chiksmedina.solar.bold.like.Star
import dev.chiksmedina.solar.bold.like.StarShine
import kotlin.collections.List as KtList

object LikeGroup

val BoldSolar.Like: LikeGroup
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
