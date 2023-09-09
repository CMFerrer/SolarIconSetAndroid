package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.hands.HandHeart
import com.chiksmedina.solar.bold.hands.HandMoney
import com.chiksmedina.solar.bold.hands.HandPills
import com.chiksmedina.solar.bold.hands.HandShake
import com.chiksmedina.solar.bold.hands.HandStars
import kotlin.collections.List as ____KtList

public object HandsGroup

public val BoldGroup.Hands: HandsGroup
  get() = HandsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val HandsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(HandHeart, HandMoney, HandPills, HandShake, HandStars)
    return __AllIcons!!
  }
