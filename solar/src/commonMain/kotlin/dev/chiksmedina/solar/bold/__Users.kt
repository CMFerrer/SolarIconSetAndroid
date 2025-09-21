package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.users.User
import dev.chiksmedina.solar.bold.users.UserBlock
import dev.chiksmedina.solar.bold.users.UserBlockRounded
import dev.chiksmedina.solar.bold.users.UserCheck
import dev.chiksmedina.solar.bold.users.UserCheckRounded
import dev.chiksmedina.solar.bold.users.UserCircle
import dev.chiksmedina.solar.bold.users.UserCross
import dev.chiksmedina.solar.bold.users.UserCrossRounded
import dev.chiksmedina.solar.bold.users.UserHandUp
import dev.chiksmedina.solar.bold.users.UserHands
import dev.chiksmedina.solar.bold.users.UserHeart
import dev.chiksmedina.solar.bold.users.UserHeartRounded
import dev.chiksmedina.solar.bold.users.UserId
import dev.chiksmedina.solar.bold.users.UserMinus
import dev.chiksmedina.solar.bold.users.UserMinusRounded
import dev.chiksmedina.solar.bold.users.UserPlus
import dev.chiksmedina.solar.bold.users.UserPlusRounded
import dev.chiksmedina.solar.bold.users.UserRounded
import dev.chiksmedina.solar.bold.users.UserSpeak
import dev.chiksmedina.solar.bold.users.UserSpeakRounded
import dev.chiksmedina.solar.bold.users.UsersGroupRounded
import dev.chiksmedina.solar.bold.users.UsersGroupTwoRounded
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
