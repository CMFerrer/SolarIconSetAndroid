package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.users.User
import dev.chiksmedina.solar.outline.users.UserBlock
import dev.chiksmedina.solar.outline.users.UserBlockRounded
import dev.chiksmedina.solar.outline.users.UserCheck
import dev.chiksmedina.solar.outline.users.UserCheckRounded
import dev.chiksmedina.solar.outline.users.UserCircle
import dev.chiksmedina.solar.outline.users.UserCross
import dev.chiksmedina.solar.outline.users.UserCrossRounded
import dev.chiksmedina.solar.outline.users.UserHandUp
import dev.chiksmedina.solar.outline.users.UserHands
import dev.chiksmedina.solar.outline.users.UserHeart
import dev.chiksmedina.solar.outline.users.UserHeartRounded
import dev.chiksmedina.solar.outline.users.UserId
import dev.chiksmedina.solar.outline.users.UserMinus
import dev.chiksmedina.solar.outline.users.UserMinusRounded
import dev.chiksmedina.solar.outline.users.UserPlus
import dev.chiksmedina.solar.outline.users.UserPlusRounded
import dev.chiksmedina.solar.outline.users.UserRounded
import dev.chiksmedina.solar.outline.users.UserSpeak
import dev.chiksmedina.solar.outline.users.UserSpeakRounded
import dev.chiksmedina.solar.outline.users.UsersGroupRounded
import dev.chiksmedina.solar.outline.users.UsersGroupTwoRounded
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
