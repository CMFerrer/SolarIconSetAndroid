package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.like.Dislike
import com.chiksmedina.solar.linear.like.Heart
import com.chiksmedina.solar.linear.like.HeartAngle
import com.chiksmedina.solar.linear.like.HeartBroken
import com.chiksmedina.solar.linear.like.HeartLock
import com.chiksmedina.solar.linear.like.HeartShine
import com.chiksmedina.solar.linear.like.HeartUnlock
import com.chiksmedina.solar.linear.like.Hearts
import com.chiksmedina.solar.linear.like.Like
import com.chiksmedina.solar.linear.like.MedalRibbon
import com.chiksmedina.solar.linear.like.MedalRibbonStar
import com.chiksmedina.solar.linear.like.MedalRibbonsStar
import com.chiksmedina.solar.linear.like.MedalStar
import com.chiksmedina.solar.linear.like.MedalStarCircle
import com.chiksmedina.solar.linear.like.MedalStarSquare
import com.chiksmedina.solar.linear.like.Star
import com.chiksmedina.solar.linear.like.StarShine
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
