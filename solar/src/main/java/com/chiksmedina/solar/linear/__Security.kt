package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearGroup
import com.chiksmedina.solar.linear.security.Bomb
import com.chiksmedina.solar.linear.security.BombEmoji
import com.chiksmedina.solar.linear.security.BombMinimalistic
import com.chiksmedina.solar.linear.security.CodeScan
import com.chiksmedina.solar.linear.security.Eye
import com.chiksmedina.solar.linear.security.EyeClosed
import com.chiksmedina.solar.linear.security.EyeScan
import com.chiksmedina.solar.linear.security.Incognito
import com.chiksmedina.solar.linear.security.Key
import com.chiksmedina.solar.linear.security.KeyMinimalistic
import com.chiksmedina.solar.linear.security.KeyMinimalistic2
import com.chiksmedina.solar.linear.security.KeyMinimalisticSquare
import com.chiksmedina.solar.linear.security.KeyMinimalisticSquare2
import com.chiksmedina.solar.linear.security.KeyMinimalisticSquare3
import com.chiksmedina.solar.linear.security.KeySquare
import com.chiksmedina.solar.linear.security.KeySquare2
import com.chiksmedina.solar.linear.security.Lock
import com.chiksmedina.solar.linear.security.LockKeyhole
import com.chiksmedina.solar.linear.security.LockKeyholeMinimalistic
import com.chiksmedina.solar.linear.security.LockKeyholeMinimalisticUnlocked
import com.chiksmedina.solar.linear.security.LockKeyholeUnlocked
import com.chiksmedina.solar.linear.security.LockPassword
import com.chiksmedina.solar.linear.security.LockPasswordUnlocked
import com.chiksmedina.solar.linear.security.LockUnlocked
import com.chiksmedina.solar.linear.security.ObjectScan
import com.chiksmedina.solar.linear.security.Password
import com.chiksmedina.solar.linear.security.PasswordMinimalistic
import com.chiksmedina.solar.linear.security.PasswordMinimalisticInput
import com.chiksmedina.solar.linear.security.QrCode
import com.chiksmedina.solar.linear.security.Scanner
import com.chiksmedina.solar.linear.security.Scanner2
import com.chiksmedina.solar.linear.security.Shield
import com.chiksmedina.solar.linear.security.ShieldCheck
import com.chiksmedina.solar.linear.security.ShieldCross
import com.chiksmedina.solar.linear.security.ShieldKeyhole
import com.chiksmedina.solar.linear.security.ShieldKeyholeMinimalistic
import com.chiksmedina.solar.linear.security.ShieldMinimalistic
import com.chiksmedina.solar.linear.security.ShieldMinus
import com.chiksmedina.solar.linear.security.ShieldNetwork
import com.chiksmedina.solar.linear.security.ShieldPlus
import com.chiksmedina.solar.linear.security.ShieldStar
import com.chiksmedina.solar.linear.security.ShieldUp
import com.chiksmedina.solar.linear.security.ShieldUser
import com.chiksmedina.solar.linear.security.ShieldWarning
import com.chiksmedina.solar.linear.security.Siren
import com.chiksmedina.solar.linear.security.SirenRounded
import kotlin.collections.List as ____KtList

public object SecurityGroup

public val LinearGroup.Security: SecurityGroup
  get() = SecurityGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val SecurityGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bomb, BombEmoji, BombMinimalistic, CodeScan, Eye, EyeClosed, EyeScan,
        Incognito, Key, KeyMinimalistic, KeyMinimalistic2, KeyMinimalisticSquare,
        KeyMinimalisticSquare2, KeyMinimalisticSquare3, KeySquare, KeySquare2, Lock, LockKeyhole,
        LockKeyholeMinimalistic, LockKeyholeMinimalisticUnlocked, LockKeyholeUnlocked, LockPassword,
        LockPasswordUnlocked, LockUnlocked, ObjectScan, Password, PasswordMinimalistic,
        PasswordMinimalisticInput, QrCode, Scanner, Scanner2, Shield, ShieldCheck, ShieldCross,
        ShieldKeyhole, ShieldKeyholeMinimalistic, ShieldMinimalistic, ShieldMinus, ShieldNetwork,
        ShieldPlus, ShieldStar, ShieldUp, ShieldUser, ShieldWarning, Siren, SirenRounded)
    return __AllIcons!!
  }
