package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.security.Bomb
import com.chiksmedina.solar.boldduotone.security.BombEmoji
import com.chiksmedina.solar.boldduotone.security.BombMinimalistic
import com.chiksmedina.solar.boldduotone.security.CodeScan
import com.chiksmedina.solar.boldduotone.security.Eye
import com.chiksmedina.solar.boldduotone.security.EyeClosed
import com.chiksmedina.solar.boldduotone.security.EyeScan
import com.chiksmedina.solar.boldduotone.security.Incognito
import com.chiksmedina.solar.boldduotone.security.Key
import com.chiksmedina.solar.boldduotone.security.KeyMinimalistic
import com.chiksmedina.solar.boldduotone.security.KeyMinimalistic2
import com.chiksmedina.solar.boldduotone.security.KeyMinimalisticSquare
import com.chiksmedina.solar.boldduotone.security.KeyMinimalisticSquare2
import com.chiksmedina.solar.boldduotone.security.KeyMinimalisticSquare3
import com.chiksmedina.solar.boldduotone.security.KeySquare
import com.chiksmedina.solar.boldduotone.security.KeySquare2
import com.chiksmedina.solar.boldduotone.security.Lock
import com.chiksmedina.solar.boldduotone.security.LockKeyhole
import com.chiksmedina.solar.boldduotone.security.LockKeyholeMinimalistic
import com.chiksmedina.solar.boldduotone.security.LockKeyholeMinimalisticUnlocked
import com.chiksmedina.solar.boldduotone.security.LockKeyholeUnlocked
import com.chiksmedina.solar.boldduotone.security.LockPassword
import com.chiksmedina.solar.boldduotone.security.LockPasswordUnlocked
import com.chiksmedina.solar.boldduotone.security.LockUnlocked
import com.chiksmedina.solar.boldduotone.security.ObjectScan
import com.chiksmedina.solar.boldduotone.security.Password
import com.chiksmedina.solar.boldduotone.security.PasswordMinimalistic
import com.chiksmedina.solar.boldduotone.security.PasswordMinimalisticInput
import com.chiksmedina.solar.boldduotone.security.QrCode
import com.chiksmedina.solar.boldduotone.security.Scanner
import com.chiksmedina.solar.boldduotone.security.Scanner2
import com.chiksmedina.solar.boldduotone.security.Shield
import com.chiksmedina.solar.boldduotone.security.ShieldCheck
import com.chiksmedina.solar.boldduotone.security.ShieldCross
import com.chiksmedina.solar.boldduotone.security.ShieldKeyhole
import com.chiksmedina.solar.boldduotone.security.ShieldKeyholeMinimalistic
import com.chiksmedina.solar.boldduotone.security.ShieldMinimalistic
import com.chiksmedina.solar.boldduotone.security.ShieldMinus
import com.chiksmedina.solar.boldduotone.security.ShieldNetwork
import com.chiksmedina.solar.boldduotone.security.ShieldPlus
import com.chiksmedina.solar.boldduotone.security.ShieldStar
import com.chiksmedina.solar.boldduotone.security.ShieldUp
import com.chiksmedina.solar.boldduotone.security.ShieldUser
import com.chiksmedina.solar.boldduotone.security.ShieldWarning
import com.chiksmedina.solar.boldduotone.security.Siren
import com.chiksmedina.solar.boldduotone.security.SirenRounded
import kotlin.collections.List as ____KtList

public object SecurityGroup

public val BoldduotoneGroup.Security: SecurityGroup
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
