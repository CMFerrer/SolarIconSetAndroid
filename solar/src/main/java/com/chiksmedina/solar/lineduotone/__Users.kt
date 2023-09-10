package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.users.User
import com.chiksmedina.solar.lineduotone.users.UserBlock
import com.chiksmedina.solar.lineduotone.users.UserBlockRounded
import com.chiksmedina.solar.lineduotone.users.UserCheck
import com.chiksmedina.solar.lineduotone.users.UserCheckRounded
import com.chiksmedina.solar.lineduotone.users.UserCircle
import com.chiksmedina.solar.lineduotone.users.UserCross
import com.chiksmedina.solar.lineduotone.users.UserCrossRounded
import com.chiksmedina.solar.lineduotone.users.UserHandUp
import com.chiksmedina.solar.lineduotone.users.UserHands
import com.chiksmedina.solar.lineduotone.users.UserHeart
import com.chiksmedina.solar.lineduotone.users.UserHeartRounded
import com.chiksmedina.solar.lineduotone.users.UserId
import com.chiksmedina.solar.lineduotone.users.UserMinus
import com.chiksmedina.solar.lineduotone.users.UserMinusRounded
import com.chiksmedina.solar.lineduotone.users.UserPlus
import com.chiksmedina.solar.lineduotone.users.UserPlusRounded
import com.chiksmedina.solar.lineduotone.users.UserRounded
import com.chiksmedina.solar.lineduotone.users.UserSpeak
import com.chiksmedina.solar.lineduotone.users.UserSpeakRounded
import com.chiksmedina.solar.lineduotone.users.UsersGroupRounded
import com.chiksmedina.solar.lineduotone.users.UsersGroupTwoRounded
import kotlin.collections.List as KtList

object UsersGroup

val LineDuotoneSolar.Users: UsersGroup
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
