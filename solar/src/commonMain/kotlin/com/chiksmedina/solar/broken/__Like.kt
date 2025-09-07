package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.like.Dislike
import com.chiksmedina.solar.broken.like.Heart
import com.chiksmedina.solar.broken.like.HeartAngle
import com.chiksmedina.solar.broken.like.HeartBroken
import com.chiksmedina.solar.broken.like.HeartLock
import com.chiksmedina.solar.broken.like.HeartShine
import com.chiksmedina.solar.broken.like.HeartUnlock
import com.chiksmedina.solar.broken.like.Hearts
import com.chiksmedina.solar.broken.like.Like
import com.chiksmedina.solar.broken.like.MedalRibbon
import com.chiksmedina.solar.broken.like.MedalRibbonStar
import com.chiksmedina.solar.broken.like.MedalRibbonsStar
import com.chiksmedina.solar.broken.like.MedalStar
import com.chiksmedina.solar.broken.like.MedalStarCircle
import com.chiksmedina.solar.broken.like.MedalStarSquare
import com.chiksmedina.solar.broken.like.Star
import com.chiksmedina.solar.broken.like.StarShine
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
