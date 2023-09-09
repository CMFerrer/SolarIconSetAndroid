package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.security.Bomb
import com.chiksmedina.solar.lineduotone.security.BombEmoji
import com.chiksmedina.solar.lineduotone.security.BombMinimalistic
import com.chiksmedina.solar.lineduotone.security.CodeScan
import com.chiksmedina.solar.lineduotone.security.Eye
import com.chiksmedina.solar.lineduotone.security.EyeClosed
import com.chiksmedina.solar.lineduotone.security.EyeScan
import com.chiksmedina.solar.lineduotone.security.Incognito
import com.chiksmedina.solar.lineduotone.security.Key
import com.chiksmedina.solar.lineduotone.security.KeyMinimalistic
import com.chiksmedina.solar.lineduotone.security.KeyMinimalistic2
import com.chiksmedina.solar.lineduotone.security.KeyMinimalisticSquare
import com.chiksmedina.solar.lineduotone.security.KeyMinimalisticSquare2
import com.chiksmedina.solar.lineduotone.security.KeyMinimalisticSquare3
import com.chiksmedina.solar.lineduotone.security.KeySquare
import com.chiksmedina.solar.lineduotone.security.KeySquare2
import com.chiksmedina.solar.lineduotone.security.Lock
import com.chiksmedina.solar.lineduotone.security.LockKeyhole
import com.chiksmedina.solar.lineduotone.security.LockKeyholeMinimalistic
import com.chiksmedina.solar.lineduotone.security.LockKeyholeMinimalisticUnlocked
import com.chiksmedina.solar.lineduotone.security.LockKeyholeUnlocked
import com.chiksmedina.solar.lineduotone.security.LockPassword
import com.chiksmedina.solar.lineduotone.security.LockPasswordUnlocked
import com.chiksmedina.solar.lineduotone.security.LockUnlocked
import com.chiksmedina.solar.lineduotone.security.ObjectScan
import com.chiksmedina.solar.lineduotone.security.Password
import com.chiksmedina.solar.lineduotone.security.PasswordMinimalistic
import com.chiksmedina.solar.lineduotone.security.PasswordMinimalisticInput
import com.chiksmedina.solar.lineduotone.security.QrCode
import com.chiksmedina.solar.lineduotone.security.Scanner
import com.chiksmedina.solar.lineduotone.security.Scanner2
import com.chiksmedina.solar.lineduotone.security.Shield
import com.chiksmedina.solar.lineduotone.security.ShieldCheck
import com.chiksmedina.solar.lineduotone.security.ShieldCross
import com.chiksmedina.solar.lineduotone.security.ShieldKeyhole
import com.chiksmedina.solar.lineduotone.security.ShieldKeyholeMinimalistic
import com.chiksmedina.solar.lineduotone.security.ShieldMinimalistic
import com.chiksmedina.solar.lineduotone.security.ShieldMinus
import com.chiksmedina.solar.lineduotone.security.ShieldNetwork
import com.chiksmedina.solar.lineduotone.security.ShieldPlus
import com.chiksmedina.solar.lineduotone.security.ShieldStar
import com.chiksmedina.solar.lineduotone.security.ShieldUp
import com.chiksmedina.solar.lineduotone.security.ShieldUser
import com.chiksmedina.solar.lineduotone.security.ShieldWarning
import com.chiksmedina.solar.lineduotone.security.Siren
import com.chiksmedina.solar.lineduotone.security.SirenRounded
import kotlin.collections.List as ____KtList

public object SecurityGroup

public val LineduotoneGroup.Security: SecurityGroup
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
