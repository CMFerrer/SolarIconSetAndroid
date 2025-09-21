package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.security.Bomb
import dev.chiksmedina.solar.broken.security.BombEmoji
import dev.chiksmedina.solar.broken.security.BombMinimalistic
import dev.chiksmedina.solar.broken.security.CodeScan
import dev.chiksmedina.solar.broken.security.Eye
import dev.chiksmedina.solar.broken.security.EyeClosed
import dev.chiksmedina.solar.broken.security.EyeScan
import dev.chiksmedina.solar.broken.security.Incognito
import dev.chiksmedina.solar.broken.security.Key
import dev.chiksmedina.solar.broken.security.KeyMinimalistic
import dev.chiksmedina.solar.broken.security.KeyMinimalistic2
import dev.chiksmedina.solar.broken.security.KeyMinimalisticSquare
import dev.chiksmedina.solar.broken.security.KeyMinimalisticSquare2
import dev.chiksmedina.solar.broken.security.KeyMinimalisticSquare3
import dev.chiksmedina.solar.broken.security.KeySquare
import dev.chiksmedina.solar.broken.security.KeySquare2
import dev.chiksmedina.solar.broken.security.Lock
import dev.chiksmedina.solar.broken.security.LockKeyhole
import dev.chiksmedina.solar.broken.security.LockKeyholeMinimalistic
import dev.chiksmedina.solar.broken.security.LockKeyholeMinimalisticUnlocked
import dev.chiksmedina.solar.broken.security.LockKeyholeUnlocked
import dev.chiksmedina.solar.broken.security.LockPassword
import dev.chiksmedina.solar.broken.security.LockPasswordUnlocked
import dev.chiksmedina.solar.broken.security.LockUnlocked
import dev.chiksmedina.solar.broken.security.ObjectScan
import dev.chiksmedina.solar.broken.security.Password
import dev.chiksmedina.solar.broken.security.PasswordMinimalistic
import dev.chiksmedina.solar.broken.security.PasswordMinimalisticInput
import dev.chiksmedina.solar.broken.security.QrCode
import dev.chiksmedina.solar.broken.security.Scanner
import dev.chiksmedina.solar.broken.security.Scanner2
import dev.chiksmedina.solar.broken.security.Shield
import dev.chiksmedina.solar.broken.security.ShieldCheck
import dev.chiksmedina.solar.broken.security.ShieldCross
import dev.chiksmedina.solar.broken.security.ShieldKeyhole
import dev.chiksmedina.solar.broken.security.ShieldKeyholeMinimalistic
import dev.chiksmedina.solar.broken.security.ShieldMinimalistic
import dev.chiksmedina.solar.broken.security.ShieldMinus
import dev.chiksmedina.solar.broken.security.ShieldNetwork
import dev.chiksmedina.solar.broken.security.ShieldPlus
import dev.chiksmedina.solar.broken.security.ShieldStar
import dev.chiksmedina.solar.broken.security.ShieldUp
import dev.chiksmedina.solar.broken.security.ShieldUser
import dev.chiksmedina.solar.broken.security.ShieldWarning
import dev.chiksmedina.solar.broken.security.Siren
import dev.chiksmedina.solar.broken.security.SirenRounded
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
