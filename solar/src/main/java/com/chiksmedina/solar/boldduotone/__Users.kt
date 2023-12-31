package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.users.User
import com.chiksmedina.solar.boldduotone.users.UserBlock
import com.chiksmedina.solar.boldduotone.users.UserBlockRounded
import com.chiksmedina.solar.boldduotone.users.UserCheck
import com.chiksmedina.solar.boldduotone.users.UserCheckRounded
import com.chiksmedina.solar.boldduotone.users.UserCircle
import com.chiksmedina.solar.boldduotone.users.UserCross
import com.chiksmedina.solar.boldduotone.users.UserCrossRounded
import com.chiksmedina.solar.boldduotone.users.UserHandUp
import com.chiksmedina.solar.boldduotone.users.UserHands
import com.chiksmedina.solar.boldduotone.users.UserHeart
import com.chiksmedina.solar.boldduotone.users.UserHeartRounded
import com.chiksmedina.solar.boldduotone.users.UserId
import com.chiksmedina.solar.boldduotone.users.UserMinus
import com.chiksmedina.solar.boldduotone.users.UserMinusRounded
import com.chiksmedina.solar.boldduotone.users.UserPlus
import com.chiksmedina.solar.boldduotone.users.UserPlusRounded
import com.chiksmedina.solar.boldduotone.users.UserRounded
import com.chiksmedina.solar.boldduotone.users.UserSpeak
import com.chiksmedina.solar.boldduotone.users.UserSpeakRounded
import com.chiksmedina.solar.boldduotone.users.UsersGroupRounded
import com.chiksmedina.solar.boldduotone.users.UsersGroupTwoRounded
import kotlin.collections.List as KtList

object UsersGroup

val BoldDuotoneSolar.Users: UsersGroup
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
