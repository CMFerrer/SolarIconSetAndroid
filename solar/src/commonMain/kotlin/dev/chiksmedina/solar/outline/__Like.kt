package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.like.Dislike
import dev.chiksmedina.solar.outline.like.Heart
import dev.chiksmedina.solar.outline.like.HeartAngle
import dev.chiksmedina.solar.outline.like.HeartBroken
import dev.chiksmedina.solar.outline.like.HeartLock
import dev.chiksmedina.solar.outline.like.HeartShine
import dev.chiksmedina.solar.outline.like.HeartUnlock
import dev.chiksmedina.solar.outline.like.Hearts
import dev.chiksmedina.solar.outline.like.Like
import dev.chiksmedina.solar.outline.like.MedalRibbon
import dev.chiksmedina.solar.outline.like.MedalRibbonStar
import dev.chiksmedina.solar.outline.like.MedalRibbonsStar
import dev.chiksmedina.solar.outline.like.MedalStar
import dev.chiksmedina.solar.outline.like.MedalStarCircle
import dev.chiksmedina.solar.outline.like.MedalStarSquare
import dev.chiksmedina.solar.outline.like.Star
import dev.chiksmedina.solar.outline.like.StarShine
import kotlin.collections.List as KtList

object LikeGroup

val OutlineSolar.Like: LikeGroup
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
