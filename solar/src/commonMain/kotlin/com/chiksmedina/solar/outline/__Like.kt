package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.like.Dislike
import com.chiksmedina.solar.outline.like.Heart
import com.chiksmedina.solar.outline.like.HeartAngle
import com.chiksmedina.solar.outline.like.HeartBroken
import com.chiksmedina.solar.outline.like.HeartLock
import com.chiksmedina.solar.outline.like.HeartShine
import com.chiksmedina.solar.outline.like.HeartUnlock
import com.chiksmedina.solar.outline.like.Hearts
import com.chiksmedina.solar.outline.like.Like
import com.chiksmedina.solar.outline.like.MedalRibbon
import com.chiksmedina.solar.outline.like.MedalRibbonStar
import com.chiksmedina.solar.outline.like.MedalRibbonsStar
import com.chiksmedina.solar.outline.like.MedalStar
import com.chiksmedina.solar.outline.like.MedalStarCircle
import com.chiksmedina.solar.outline.like.MedalStarSquare
import com.chiksmedina.solar.outline.like.Star
import com.chiksmedina.solar.outline.like.StarShine
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
