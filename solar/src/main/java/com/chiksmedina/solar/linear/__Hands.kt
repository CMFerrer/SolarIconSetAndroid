package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.hands.HandHeart
import com.chiksmedina.solar.linear.hands.HandMoney
import com.chiksmedina.solar.linear.hands.HandPills
import com.chiksmedina.solar.linear.hands.HandShake
import com.chiksmedina.solar.linear.hands.HandStars
import kotlin.collections.List as KtList

object HandsGroup

val LinearSolar.Hands: HandsGroup
    get() = HandsGroup

private var _AllIcons: KtList<ImageVector>? = null

val HandsGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(HandHeart, HandMoney, HandPills, HandShake, HandStars)
        return _AllIcons!!
    }
