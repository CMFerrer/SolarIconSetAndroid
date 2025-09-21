package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.security.Bomb
import dev.chiksmedina.solar.linear.security.BombEmoji
import dev.chiksmedina.solar.linear.security.BombMinimalistic
import dev.chiksmedina.solar.linear.security.CodeScan
import dev.chiksmedina.solar.linear.security.Eye
import dev.chiksmedina.solar.linear.security.EyeClosed
import dev.chiksmedina.solar.linear.security.EyeScan
import dev.chiksmedina.solar.linear.security.Incognito
import dev.chiksmedina.solar.linear.security.Key
import dev.chiksmedina.solar.linear.security.KeyMinimalistic
import dev.chiksmedina.solar.linear.security.KeyMinimalistic2
import dev.chiksmedina.solar.linear.security.KeyMinimalisticSquare
import dev.chiksmedina.solar.linear.security.KeyMinimalisticSquare2
import dev.chiksmedina.solar.linear.security.KeyMinimalisticSquare3
import dev.chiksmedina.solar.linear.security.KeySquare
import dev.chiksmedina.solar.linear.security.KeySquare2
import dev.chiksmedina.solar.linear.security.Lock
import dev.chiksmedina.solar.linear.security.LockKeyhole
import dev.chiksmedina.solar.linear.security.LockKeyholeMinimalistic
import dev.chiksmedina.solar.linear.security.LockKeyholeMinimalisticUnlocked
import dev.chiksmedina.solar.linear.security.LockKeyholeUnlocked
import dev.chiksmedina.solar.linear.security.LockPassword
import dev.chiksmedina.solar.linear.security.LockPasswordUnlocked
import dev.chiksmedina.solar.linear.security.LockUnlocked
import dev.chiksmedina.solar.linear.security.ObjectScan
import dev.chiksmedina.solar.linear.security.Password
import dev.chiksmedina.solar.linear.security.PasswordMinimalistic
import dev.chiksmedina.solar.linear.security.PasswordMinimalisticInput
import dev.chiksmedina.solar.linear.security.QrCode
import dev.chiksmedina.solar.linear.security.Scanner
import dev.chiksmedina.solar.linear.security.Scanner2
import dev.chiksmedina.solar.linear.security.Shield
import dev.chiksmedina.solar.linear.security.ShieldCheck
import dev.chiksmedina.solar.linear.security.ShieldCross
import dev.chiksmedina.solar.linear.security.ShieldKeyhole
import dev.chiksmedina.solar.linear.security.ShieldKeyholeMinimalistic
import dev.chiksmedina.solar.linear.security.ShieldMinimalistic
import dev.chiksmedina.solar.linear.security.ShieldMinus
import dev.chiksmedina.solar.linear.security.ShieldNetwork
import dev.chiksmedina.solar.linear.security.ShieldPlus
import dev.chiksmedina.solar.linear.security.ShieldStar
import dev.chiksmedina.solar.linear.security.ShieldUp
import dev.chiksmedina.solar.linear.security.ShieldUser
import dev.chiksmedina.solar.linear.security.ShieldWarning
import dev.chiksmedina.solar.linear.security.Siren
import dev.chiksmedina.solar.linear.security.SirenRounded
import kotlin.collections.List as KtList

object SecurityGroup

val LinearSolar.Security: SecurityGroup
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
