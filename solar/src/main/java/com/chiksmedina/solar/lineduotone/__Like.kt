package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.like.Dislike
import com.chiksmedina.solar.lineduotone.like.Heart
import com.chiksmedina.solar.lineduotone.like.HeartAngle
import com.chiksmedina.solar.lineduotone.like.HeartBroken
import com.chiksmedina.solar.lineduotone.like.HeartLock
import com.chiksmedina.solar.lineduotone.like.HeartShine
import com.chiksmedina.solar.lineduotone.like.HeartUnlock
import com.chiksmedina.solar.lineduotone.like.Hearts
import com.chiksmedina.solar.lineduotone.like.Like
import com.chiksmedina.solar.lineduotone.like.MedalRibbon
import com.chiksmedina.solar.lineduotone.like.MedalRibbonStar
import com.chiksmedina.solar.lineduotone.like.MedalRibbonsStar
import com.chiksmedina.solar.lineduotone.like.MedalStar
import com.chiksmedina.solar.lineduotone.like.MedalStarCircle
import com.chiksmedina.solar.lineduotone.like.MedalStarSquare
import com.chiksmedina.solar.lineduotone.like.Star
import com.chiksmedina.solar.lineduotone.like.StarShine
import kotlin.collections.List as ____KtList

public object LikeGroup

public val LineduotoneGroup.Like: LikeGroup
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
