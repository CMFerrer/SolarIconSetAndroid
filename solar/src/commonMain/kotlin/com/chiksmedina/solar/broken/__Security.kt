package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.security.Bomb
import com.chiksmedina.solar.broken.security.BombEmoji
import com.chiksmedina.solar.broken.security.BombMinimalistic
import com.chiksmedina.solar.broken.security.CodeScan
import com.chiksmedina.solar.broken.security.Eye
import com.chiksmedina.solar.broken.security.EyeClosed
import com.chiksmedina.solar.broken.security.EyeScan
import com.chiksmedina.solar.broken.security.Incognito
import com.chiksmedina.solar.broken.security.Key
import com.chiksmedina.solar.broken.security.KeyMinimalistic
import com.chiksmedina.solar.broken.security.KeyMinimalistic2
import com.chiksmedina.solar.broken.security.KeyMinimalisticSquare
import com.chiksmedina.solar.broken.security.KeyMinimalisticSquare2
import com.chiksmedina.solar.broken.security.KeyMinimalisticSquare3
import com.chiksmedina.solar.broken.security.KeySquare
import com.chiksmedina.solar.broken.security.KeySquare2
import com.chiksmedina.solar.broken.security.Lock
import com.chiksmedina.solar.broken.security.LockKeyhole
import com.chiksmedina.solar.broken.security.LockKeyholeMinimalistic
import com.chiksmedina.solar.broken.security.LockKeyholeMinimalisticUnlocked
import com.chiksmedina.solar.broken.security.LockKeyholeUnlocked
import com.chiksmedina.solar.broken.security.LockPassword
import com.chiksmedina.solar.broken.security.LockPasswordUnlocked
import com.chiksmedina.solar.broken.security.LockUnlocked
import com.chiksmedina.solar.broken.security.ObjectScan
import com.chiksmedina.solar.broken.security.Password
import com.chiksmedina.solar.broken.security.PasswordMinimalistic
import com.chiksmedina.solar.broken.security.PasswordMinimalisticInput
import com.chiksmedina.solar.broken.security.QrCode
import com.chiksmedina.solar.broken.security.Scanner
import com.chiksmedina.solar.broken.security.Scanner2
import com.chiksmedina.solar.broken.security.Shield
import com.chiksmedina.solar.broken.security.ShieldCheck
import com.chiksmedina.solar.broken.security.ShieldCross
import com.chiksmedina.solar.broken.security.ShieldKeyhole
import com.chiksmedina.solar.broken.security.ShieldKeyholeMinimalistic
import com.chiksmedina.solar.broken.security.ShieldMinimalistic
import com.chiksmedina.solar.broken.security.ShieldMinus
import com.chiksmedina.solar.broken.security.ShieldNetwork
import com.chiksmedina.solar.broken.security.ShieldPlus
import com.chiksmedina.solar.broken.security.ShieldStar
import com.chiksmedina.solar.broken.security.ShieldUp
import com.chiksmedina.solar.broken.security.ShieldUser
import com.chiksmedina.solar.broken.security.ShieldWarning
import com.chiksmedina.solar.broken.security.Siren
import com.chiksmedina.solar.broken.security.SirenRounded
import kotlin.collections.List as KtList

object SecurityGroup

val BrokenSolar.Security: SecurityGroup
    get() = SecurityGroup

private var _AllIcons: KtList<ImageVector>? = null

val SecurityGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bomb,
            BombEmoji,
            BombMinimalistic,
            CodeScan,
            Eye,
            EyeClosed,
            EyeScan,
            Incognito,
            Key,
            KeyMinimalistic,
            KeyMinimalistic2,
            KeyMinimalisticSquare,
            KeyMinimalisticSquare2,
            KeyMinimalisticSquare3,
            KeySquare,
            KeySquare2,
            Lock,
            LockKeyhole,
            LockKeyholeMinimalistic,
            LockKeyholeMinimalisticUnlocked,
            LockKeyholeUnlocked,
            LockPassword,
            LockPasswordUnlocked,
            LockUnlocked,
            ObjectScan,
            Password,
            PasswordMinimalistic,
            PasswordMinimalisticInput,
            QrCode,
            Scanner,
            Scanner2,
            Shield,
            ShieldCheck,
            ShieldCross,
            ShieldKeyhole,
            ShieldKeyholeMinimalistic,
            ShieldMinimalistic,
            ShieldMinus,
            ShieldNetwork,
            ShieldPlus,
            ShieldStar,
            ShieldUp,
            ShieldUser,
            ShieldWarning,
            Siren,
            SirenRounded
        )
        return _AllIcons!!
    }
