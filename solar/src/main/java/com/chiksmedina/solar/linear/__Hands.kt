package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.hands.HandHeart
import com.chiksmedina.solar.linear.hands.HandMoney
import com.chiksmedina.solar.linear.hands.HandPills
import com.chiksmedina.solar.linear.hands.HandShake
import com.chiksmedina.solar.linear.hands.HandStars
import kotlin.collections.List as ____KtList

public object HandsGroup

public val LinearGroup.Hands: HandsGroup
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
