package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineGroup
import com.chiksmedina.solar.outline.security.Bomb
import com.chiksmedina.solar.outline.security.BombEmoji
import com.chiksmedina.solar.outline.security.BombMinimalistic
import com.chiksmedina.solar.outline.security.CodeScan
import com.chiksmedina.solar.outline.security.Eye
import com.chiksmedina.solar.outline.security.EyeClosed
import com.chiksmedina.solar.outline.security.EyeScan
import com.chiksmedina.solar.outline.security.Incognito
import com.chiksmedina.solar.outline.security.Key
import com.chiksmedina.solar.outline.security.KeyMinimalistic
import com.chiksmedina.solar.outline.security.KeyMinimalistic2
import com.chiksmedina.solar.outline.security.KeyMinimalisticSquare
import com.chiksmedina.solar.outline.security.KeyMinimalisticSquare2
import com.chiksmedina.solar.outline.security.KeyMinimalisticSquare3
import com.chiksmedina.solar.outline.security.KeySquare
import com.chiksmedina.solar.outline.security.KeySquare2
import com.chiksmedina.solar.outline.security.Lock
import com.chiksmedina.solar.outline.security.LockKeyhole
import com.chiksmedina.solar.outline.security.LockKeyholeMinimalistic
import com.chiksmedina.solar.outline.security.LockKeyholeMinimalisticUnlocked
import com.chiksmedina.solar.outline.security.LockKeyholeUnlocked
import com.chiksmedina.solar.outline.security.LockPassword
import com.chiksmedina.solar.outline.security.LockPasswordUnlocked
import com.chiksmedina.solar.outline.security.LockUnlocked
import com.chiksmedina.solar.outline.security.ObjectScan
import com.chiksmedina.solar.outline.security.Password
import com.chiksmedina.solar.outline.security.PasswordMinimalistic
import com.chiksmedina.solar.outline.security.PasswordMinimalisticInput
import com.chiksmedina.solar.outline.security.QrCode
import com.chiksmedina.solar.outline.security.Scanner
import com.chiksmedina.solar.outline.security.Scanner2
import com.chiksmedina.solar.outline.security.Shield
import com.chiksmedina.solar.outline.security.ShieldCheck
import com.chiksmedina.solar.outline.security.ShieldCross
import com.chiksmedina.solar.outline.security.ShieldKeyhole
import com.chiksmedina.solar.outline.security.ShieldKeyholeMinimalistic
import com.chiksmedina.solar.outline.security.ShieldMinimalistic
import com.chiksmedina.solar.outline.security.ShieldMinus
import com.chiksmedina.solar.outline.security.ShieldNetwork
import com.chiksmedina.solar.outline.security.ShieldPlus
import com.chiksmedina.solar.outline.security.ShieldStar
import com.chiksmedina.solar.outline.security.ShieldUp
import com.chiksmedina.solar.outline.security.ShieldUser
import com.chiksmedina.solar.outline.security.ShieldWarning
import com.chiksmedina.solar.outline.security.Siren
import com.chiksmedina.solar.outline.security.SirenRounded
import kotlin.collections.List as ____KtList

public object SecurityGroup

public val OutlineGroup.Security: SecurityGroup
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
