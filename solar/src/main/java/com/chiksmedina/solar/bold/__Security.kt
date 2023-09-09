package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldGroup
import com.chiksmedina.solar.bold.security.Bomb
import com.chiksmedina.solar.bold.security.BombEmoji
import com.chiksmedina.solar.bold.security.BombMinimalistic
import com.chiksmedina.solar.bold.security.CodeScan
import com.chiksmedina.solar.bold.security.Eye
import com.chiksmedina.solar.bold.security.EyeClosed
import com.chiksmedina.solar.bold.security.EyeScan
import com.chiksmedina.solar.bold.security.Incognito
import com.chiksmedina.solar.bold.security.Key
import com.chiksmedina.solar.bold.security.KeyMinimalistic
import com.chiksmedina.solar.bold.security.KeyMinimalistic2
import com.chiksmedina.solar.bold.security.KeyMinimalisticSquare
import com.chiksmedina.solar.bold.security.KeyMinimalisticSquare2
import com.chiksmedina.solar.bold.security.KeyMinimalisticSquare3
import com.chiksmedina.solar.bold.security.KeySquare
import com.chiksmedina.solar.bold.security.KeySquare2
import com.chiksmedina.solar.bold.security.Lock
import com.chiksmedina.solar.bold.security.LockKeyhole
import com.chiksmedina.solar.bold.security.LockKeyholeMinimalistic
import com.chiksmedina.solar.bold.security.LockKeyholeMinimalisticUnlocked
import com.chiksmedina.solar.bold.security.LockKeyholeUnlocked
import com.chiksmedina.solar.bold.security.LockPassword
import com.chiksmedina.solar.bold.security.LockPasswordUnlocked
import com.chiksmedina.solar.bold.security.LockUnlocked
import com.chiksmedina.solar.bold.security.ObjectScan
import com.chiksmedina.solar.bold.security.Password
import com.chiksmedina.solar.bold.security.PasswordMinimalistic
import com.chiksmedina.solar.bold.security.PasswordMinimalisticInput
import com.chiksmedina.solar.bold.security.QrCode
import com.chiksmedina.solar.bold.security.Scanner
import com.chiksmedina.solar.bold.security.Scanner2
import com.chiksmedina.solar.bold.security.Shield
import com.chiksmedina.solar.bold.security.ShieldCheck
import com.chiksmedina.solar.bold.security.ShieldCross
import com.chiksmedina.solar.bold.security.ShieldKeyhole
import com.chiksmedina.solar.bold.security.ShieldKeyholeMinimalistic
import com.chiksmedina.solar.bold.security.ShieldMinimalistic
import com.chiksmedina.solar.bold.security.ShieldMinus
import com.chiksmedina.solar.bold.security.ShieldNetwork
import com.chiksmedina.solar.bold.security.ShieldPlus
import com.chiksmedina.solar.bold.security.ShieldStar
import com.chiksmedina.solar.bold.security.ShieldUp
import com.chiksmedina.solar.bold.security.ShieldUser
import com.chiksmedina.solar.bold.security.ShieldWarning
import com.chiksmedina.solar.bold.security.Siren
import com.chiksmedina.solar.bold.security.SirenRounded
import kotlin.collections.List as ____KtList

public object SecurityGroup

public val BoldGroup.Security: SecurityGroup
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
