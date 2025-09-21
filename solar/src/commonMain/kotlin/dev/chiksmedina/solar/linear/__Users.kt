package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.users.User
import dev.chiksmedina.solar.linear.users.UserBlock
import dev.chiksmedina.solar.linear.users.UserBlockRounded
import dev.chiksmedina.solar.linear.users.UserCheck
import dev.chiksmedina.solar.linear.users.UserCheckRounded
import dev.chiksmedina.solar.linear.users.UserCircle
import dev.chiksmedina.solar.linear.users.UserCross
import dev.chiksmedina.solar.linear.users.UserCrossRounded
import dev.chiksmedina.solar.linear.users.UserHandUp
import dev.chiksmedina.solar.linear.users.UserHands
import dev.chiksmedina.solar.linear.users.UserHeart
import dev.chiksmedina.solar.linear.users.UserHeartRounded
import dev.chiksmedina.solar.linear.users.UserId
import dev.chiksmedina.solar.linear.users.UserMinus
import dev.chiksmedina.solar.linear.users.UserMinusRounded
import dev.chiksmedina.solar.linear.users.UserPlus
import dev.chiksmedina.solar.linear.users.UserPlusRounded
import dev.chiksmedina.solar.linear.users.UserRounded
import dev.chiksmedina.solar.linear.users.UserSpeak
import dev.chiksmedina.solar.linear.users.UserSpeakRounded
import dev.chiksmedina.solar.linear.users.UsersGroupRounded
import dev.chiksmedina.solar.linear.users.UsersGroupTwoRounded
import kotlin.collections.List as KtList

object UsersGroup

val LinearSolar.Users: UsersGroup
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
