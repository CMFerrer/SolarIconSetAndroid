package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.like.Dislike
import com.chiksmedina.solar.boldduotone.like.Heart
import com.chiksmedina.solar.boldduotone.like.HeartAngle
import com.chiksmedina.solar.boldduotone.like.HeartBroken
import com.chiksmedina.solar.boldduotone.like.HeartLock
import com.chiksmedina.solar.boldduotone.like.HeartShine
import com.chiksmedina.solar.boldduotone.like.HeartUnlock
import com.chiksmedina.solar.boldduotone.like.Hearts
import com.chiksmedina.solar.boldduotone.like.Like
import com.chiksmedina.solar.boldduotone.like.MedalRibbon
import com.chiksmedina.solar.boldduotone.like.MedalRibbonStar
import com.chiksmedina.solar.boldduotone.like.MedalRibbonsStar
import com.chiksmedina.solar.boldduotone.like.MedalStar
import com.chiksmedina.solar.boldduotone.like.MedalStarCircle
import com.chiksmedina.solar.boldduotone.like.MedalStarSquare
import com.chiksmedina.solar.boldduotone.like.Star
import com.chiksmedina.solar.boldduotone.like.StarShine
import kotlin.collections.List as ____KtList

public object LikeGroup

public val BoldduotoneGroup.Like: LikeGroup
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
