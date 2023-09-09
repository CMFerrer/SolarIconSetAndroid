package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.users.User
import com.chiksmedina.solar.linear.users.UserBlock
import com.chiksmedina.solar.linear.users.UserBlockRounded
import com.chiksmedina.solar.linear.users.UserCheck
import com.chiksmedina.solar.linear.users.UserCheckRounded
import com.chiksmedina.solar.linear.users.UserCircle
import com.chiksmedina.solar.linear.users.UserCross
import com.chiksmedina.solar.linear.users.UserCrossRounded
import com.chiksmedina.solar.linear.users.UserHandUp
import com.chiksmedina.solar.linear.users.UserHands
import com.chiksmedina.solar.linear.users.UserHeart
import com.chiksmedina.solar.linear.users.UserHeartRounded
import com.chiksmedina.solar.linear.users.UserId
import com.chiksmedina.solar.linear.users.UserMinus
import com.chiksmedina.solar.linear.users.UserMinusRounded
import com.chiksmedina.solar.linear.users.UserPlus
import com.chiksmedina.solar.linear.users.UserPlusRounded
import com.chiksmedina.solar.linear.users.UserRounded
import com.chiksmedina.solar.linear.users.UserSpeak
import com.chiksmedina.solar.linear.users.UserSpeakRounded
import com.chiksmedina.solar.linear.users.UsersGroupRounded
import com.chiksmedina.solar.linear.users.UsersGroupTwoRounded
import kotlin.collections.List as ____KtList

public object UsersGroup

public val LinearGroup.Users: UsersGroup
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
