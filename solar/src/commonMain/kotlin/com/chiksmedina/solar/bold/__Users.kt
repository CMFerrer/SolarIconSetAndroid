package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.users.User
import com.chiksmedina.solar.bold.users.UserBlock
import com.chiksmedina.solar.bold.users.UserBlockRounded
import com.chiksmedina.solar.bold.users.UserCheck
import com.chiksmedina.solar.bold.users.UserCheckRounded
import com.chiksmedina.solar.bold.users.UserCircle
import com.chiksmedina.solar.bold.users.UserCross
import com.chiksmedina.solar.bold.users.UserCrossRounded
import com.chiksmedina.solar.bold.users.UserHandUp
import com.chiksmedina.solar.bold.users.UserHands
import com.chiksmedina.solar.bold.users.UserHeart
import com.chiksmedina.solar.bold.users.UserHeartRounded
import com.chiksmedina.solar.bold.users.UserId
import com.chiksmedina.solar.bold.users.UserMinus
import com.chiksmedina.solar.bold.users.UserMinusRounded
import com.chiksmedina.solar.bold.users.UserPlus
import com.chiksmedina.solar.bold.users.UserPlusRounded
import com.chiksmedina.solar.bold.users.UserRounded
import com.chiksmedina.solar.bold.users.UserSpeak
import com.chiksmedina.solar.bold.users.UserSpeakRounded
import com.chiksmedina.solar.bold.users.UsersGroupRounded
import com.chiksmedina.solar.bold.users.UsersGroupTwoRounded
import kotlin.collections.List as KtList

object UsersGroup

val BoldSolar.Users: UsersGroup
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
