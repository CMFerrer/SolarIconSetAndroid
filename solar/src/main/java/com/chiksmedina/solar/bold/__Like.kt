package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.like.Dislike
import com.chiksmedina.solar.bold.like.Heart
import com.chiksmedina.solar.bold.like.HeartAngle
import com.chiksmedina.solar.bold.like.HeartBroken
import com.chiksmedina.solar.bold.like.HeartLock
import com.chiksmedina.solar.bold.like.HeartShine
import com.chiksmedina.solar.bold.like.HeartUnlock
import com.chiksmedina.solar.bold.like.Hearts
import com.chiksmedina.solar.bold.like.Like
import com.chiksmedina.solar.bold.like.MedalRibbon
import com.chiksmedina.solar.bold.like.MedalRibbonStar
import com.chiksmedina.solar.bold.like.MedalRibbonsStar
import com.chiksmedina.solar.bold.like.MedalStar
import com.chiksmedina.solar.bold.like.MedalStarCircle
import com.chiksmedina.solar.bold.like.MedalStarSquare
import com.chiksmedina.solar.bold.like.Star
import com.chiksmedina.solar.bold.like.StarShine
import kotlin.collections.List as ____KtList

public object LikeGroup

public val BoldGroup.Like: LikeGroup
  get() = LikeGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val LikeGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Dislike, Heart, Hearts, HeartAngle, HeartBroken, HeartLock, HeartShine,
        HeartUnlock, Like, MedalRibbon, MedalRibbonsStar, MedalRibbonStar, MedalStar,
        MedalStarCircle, MedalStarSquare, Star, StarShine)
    return __AllIcons!!
  }
