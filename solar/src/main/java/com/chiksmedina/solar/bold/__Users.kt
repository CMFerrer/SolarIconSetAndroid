package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
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
import kotlin.collections.List as ____KtList

public object UsersGroup

public val BoldGroup.Users: UsersGroup
  get() = UsersGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val UsersGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(User, UsersGroupRounded, UsersGroupTwoRounded, UserBlock, UserBlockRounded,
        UserCheck, UserCheckRounded, UserCircle, UserCross, UserCrossRounded, UserHands, UserHandUp,
        UserHeart, UserHeartRounded, UserId, UserMinus, UserMinusRounded, UserPlus, UserPlusRounded,
        UserRounded, UserSpeak, UserSpeakRounded)
    return __AllIcons!!
  }
