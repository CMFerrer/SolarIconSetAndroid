package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.hands.HandHeart
import com.chiksmedina.solar.bold.hands.HandMoney
import com.chiksmedina.solar.bold.hands.HandPills
import com.chiksmedina.solar.bold.hands.HandShake
import com.chiksmedina.solar.bold.hands.HandStars
import kotlin.collections.List as KtList

object HandsGroup

val BoldSolar.Hands: HandsGroup
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
