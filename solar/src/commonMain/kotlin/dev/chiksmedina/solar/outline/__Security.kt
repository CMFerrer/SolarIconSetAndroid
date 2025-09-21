package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.security.Bomb
import dev.chiksmedina.solar.outline.security.BombEmoji
import dev.chiksmedina.solar.outline.security.BombMinimalistic
import dev.chiksmedina.solar.outline.security.CodeScan
import dev.chiksmedina.solar.outline.security.Eye
import dev.chiksmedina.solar.outline.security.EyeClosed
import dev.chiksmedina.solar.outline.security.EyeScan
import dev.chiksmedina.solar.outline.security.Incognito
import dev.chiksmedina.solar.outline.security.Key
import dev.chiksmedina.solar.outline.security.KeyMinimalistic
import dev.chiksmedina.solar.outline.security.KeyMinimalistic2
import dev.chiksmedina.solar.outline.security.KeyMinimalisticSquare
import dev.chiksmedina.solar.outline.security.KeyMinimalisticSquare2
import dev.chiksmedina.solar.outline.security.KeyMinimalisticSquare3
import dev.chiksmedina.solar.outline.security.KeySquare
import dev.chiksmedina.solar.outline.security.KeySquare2
import dev.chiksmedina.solar.outline.security.Lock
import dev.chiksmedina.solar.outline.security.LockKeyhole
import dev.chiksmedina.solar.outline.security.LockKeyholeMinimalistic
import dev.chiksmedina.solar.outline.security.LockKeyholeMinimalisticUnlocked
import dev.chiksmedina.solar.outline.security.LockKeyholeUnlocked
import dev.chiksmedina.solar.outline.security.LockPassword
import dev.chiksmedina.solar.outline.security.LockPasswordUnlocked
import dev.chiksmedina.solar.outline.security.LockUnlocked
import dev.chiksmedina.solar.outline.security.ObjectScan
import dev.chiksmedina.solar.outline.security.Password
import dev.chiksmedina.solar.outline.security.PasswordMinimalistic
import dev.chiksmedina.solar.outline.security.PasswordMinimalisticInput
import dev.chiksmedina.solar.outline.security.QrCode
import dev.chiksmedina.solar.outline.security.Scanner
import dev.chiksmedina.solar.outline.security.Scanner2
import dev.chiksmedina.solar.outline.security.Shield
import dev.chiksmedina.solar.outline.security.ShieldCheck
import dev.chiksmedina.solar.outline.security.ShieldCross
import dev.chiksmedina.solar.outline.security.ShieldKeyhole
import dev.chiksmedina.solar.outline.security.ShieldKeyholeMinimalistic
import dev.chiksmedina.solar.outline.security.ShieldMinimalistic
import dev.chiksmedina.solar.outline.security.ShieldMinus
import dev.chiksmedina.solar.outline.security.ShieldNetwork
import dev.chiksmedina.solar.outline.security.ShieldPlus
import dev.chiksmedina.solar.outline.security.ShieldStar
import dev.chiksmedina.solar.outline.security.ShieldUp
import dev.chiksmedina.solar.outline.security.ShieldUser
import dev.chiksmedina.solar.outline.security.ShieldWarning
import dev.chiksmedina.solar.outline.security.Siren
import dev.chiksmedina.solar.outline.security.SirenRounded
import kotlin.collections.List as KtList

object SecurityGroup

val OutlineSolar.Security: SecurityGroup
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
