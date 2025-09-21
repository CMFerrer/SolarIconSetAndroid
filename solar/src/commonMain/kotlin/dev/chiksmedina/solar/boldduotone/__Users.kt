package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.users.User
import dev.chiksmedina.solar.boldduotone.users.UserBlock
import dev.chiksmedina.solar.boldduotone.users.UserBlockRounded
import dev.chiksmedina.solar.boldduotone.users.UserCheck
import dev.chiksmedina.solar.boldduotone.users.UserCheckRounded
import dev.chiksmedina.solar.boldduotone.users.UserCircle
import dev.chiksmedina.solar.boldduotone.users.UserCross
import dev.chiksmedina.solar.boldduotone.users.UserCrossRounded
import dev.chiksmedina.solar.boldduotone.users.UserHandUp
import dev.chiksmedina.solar.boldduotone.users.UserHands
import dev.chiksmedina.solar.boldduotone.users.UserHeart
import dev.chiksmedina.solar.boldduotone.users.UserHeartRounded
import dev.chiksmedina.solar.boldduotone.users.UserId
import dev.chiksmedina.solar.boldduotone.users.UserMinus
import dev.chiksmedina.solar.boldduotone.users.UserMinusRounded
import dev.chiksmedina.solar.boldduotone.users.UserPlus
import dev.chiksmedina.solar.boldduotone.users.UserPlusRounded
import dev.chiksmedina.solar.boldduotone.users.UserRounded
import dev.chiksmedina.solar.boldduotone.users.UserSpeak
import dev.chiksmedina.solar.boldduotone.users.UserSpeakRounded
import dev.chiksmedina.solar.boldduotone.users.UsersGroupRounded
import dev.chiksmedina.solar.boldduotone.users.UsersGroupTwoRounded
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
