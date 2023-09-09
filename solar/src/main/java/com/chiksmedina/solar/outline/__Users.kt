package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.users.User
import com.chiksmedina.solar.outline.users.UserBlock
import com.chiksmedina.solar.outline.users.UserBlockRounded
import com.chiksmedina.solar.outline.users.UserCheck
import com.chiksmedina.solar.outline.users.UserCheckRounded
import com.chiksmedina.solar.outline.users.UserCircle
import com.chiksmedina.solar.outline.users.UserCross
import com.chiksmedina.solar.outline.users.UserCrossRounded
import com.chiksmedina.solar.outline.users.UserHandUp
import com.chiksmedina.solar.outline.users.UserHands
import com.chiksmedina.solar.outline.users.UserHeart
import com.chiksmedina.solar.outline.users.UserHeartRounded
import com.chiksmedina.solar.outline.users.UserId
import com.chiksmedina.solar.outline.users.UserMinus
import com.chiksmedina.solar.outline.users.UserMinusRounded
import com.chiksmedina.solar.outline.users.UserPlus
import com.chiksmedina.solar.outline.users.UserPlusRounded
import com.chiksmedina.solar.outline.users.UserRounded
import com.chiksmedina.solar.outline.users.UserSpeak
import com.chiksmedina.solar.outline.users.UserSpeakRounded
import com.chiksmedina.solar.outline.users.UsersGroupRounded
import com.chiksmedina.solar.outline.users.UsersGroupTwoRounded
import kotlin.collections.List as ____KtList

public object UsersGroup

public val OutlineGroup.Users: UsersGroup
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
