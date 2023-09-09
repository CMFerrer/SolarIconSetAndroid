package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
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
import kotlin.collections.List as ____KtList

public object UsersGroup

public val LineduotoneGroup.Users: UsersGroup
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
