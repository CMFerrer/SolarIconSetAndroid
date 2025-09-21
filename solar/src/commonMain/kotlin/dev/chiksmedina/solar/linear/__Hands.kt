package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.hands.HandHeart
import dev.chiksmedina.solar.linear.hands.HandMoney
import dev.chiksmedina.solar.linear.hands.HandPills
import dev.chiksmedina.solar.linear.hands.HandShake
import dev.chiksmedina.solar.linear.hands.HandStars
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
