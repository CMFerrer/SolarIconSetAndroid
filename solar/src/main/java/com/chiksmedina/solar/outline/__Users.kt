package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.users.User
import com.chiksmedina.solar.outline.users.UserBlock
import com.chiksmedina.solar.outline.users.UserBlockRounded
import com.chiksmedina.solar.outline.users.UserCheck
import com.chiksmedina.solar.outline.users.UserCheckRounded
import com.chiksmedina.solar.outline.users.UserCircle
import com.chiksmedina.solar.outline.users.UserCross
import com.chiksmedina.solar.outline.users.UserCrossRounded
import com.chiksmedina.solar.outline.users.UserHandUp
import com.chiksmedina.solar.outline.users.UserHands
import com.chiksmedina.solar.outline.users.UserHeart
import com.chiksmedina.solar.outline.users.UserHeartRounded
import com.chiksmedina.solar.outline.users.UserId
import com.chiksmedina.solar.outline.users.UserMinus
import com.chiksmedina.solar.outline.users.UserMinusRounded
import com.chiksmedina.solar.outline.users.UserPlus
import com.chiksmedina.solar.outline.users.UserPlusRounded
import com.chiksmedina.solar.outline.users.UserRounded
import com.chiksmedina.solar.outline.users.UserSpeak
import com.chiksmedina.solar.outline.users.UserSpeakRounded
import com.chiksmedina.solar.outline.users.UsersGroupRounded
import com.chiksmedina.solar.outline.users.UsersGroupTwoRounded
import kotlin.collections.List as KtList

object UsersGroup

val OutlineSolar.Users: UsersGroup
    get() = UsersGroup

private var _AllIcons: KtList<ImageVector>? = null

val UsersGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            User,
            UsersGroupRounded,
            UsersGroupTwoRounded,
            UserBlock,
            UserBlockRounded,
            UserCheck,
            UserCheckRounded,
            UserCircle,
            UserCross,
            UserCrossRounded,
            UserHands,
            UserHandUp,
            UserHeart,
            UserHeartRounded,
            UserId,
            UserMinus,
            UserMinusRounded,
            UserPlus,
            UserPlusRounded,
            UserRounded,
            UserSpeak,
            UserSpeakRounded
        )
        return _AllIcons!!
    }
