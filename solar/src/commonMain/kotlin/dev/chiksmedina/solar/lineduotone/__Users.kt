package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.users.User
import dev.chiksmedina.solar.lineduotone.users.UserBlock
import dev.chiksmedina.solar.lineduotone.users.UserBlockRounded
import dev.chiksmedina.solar.lineduotone.users.UserCheck
import dev.chiksmedina.solar.lineduotone.users.UserCheckRounded
import dev.chiksmedina.solar.lineduotone.users.UserCircle
import dev.chiksmedina.solar.lineduotone.users.UserCross
import dev.chiksmedina.solar.lineduotone.users.UserCrossRounded
import dev.chiksmedina.solar.lineduotone.users.UserHandUp
import dev.chiksmedina.solar.lineduotone.users.UserHands
import dev.chiksmedina.solar.lineduotone.users.UserHeart
import dev.chiksmedina.solar.lineduotone.users.UserHeartRounded
import dev.chiksmedina.solar.lineduotone.users.UserId
import dev.chiksmedina.solar.lineduotone.users.UserMinus
import dev.chiksmedina.solar.lineduotone.users.UserMinusRounded
import dev.chiksmedina.solar.lineduotone.users.UserPlus
import dev.chiksmedina.solar.lineduotone.users.UserPlusRounded
import dev.chiksmedina.solar.lineduotone.users.UserRounded
import dev.chiksmedina.solar.lineduotone.users.UserSpeak
import dev.chiksmedina.solar.lineduotone.users.UserSpeakRounded
import dev.chiksmedina.solar.lineduotone.users.UsersGroupRounded
import dev.chiksmedina.solar.lineduotone.users.UsersGroupTwoRounded
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
