package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.security.Bomb
import dev.chiksmedina.solar.lineduotone.security.BombEmoji
import dev.chiksmedina.solar.lineduotone.security.BombMinimalistic
import dev.chiksmedina.solar.lineduotone.security.CodeScan
import dev.chiksmedina.solar.lineduotone.security.Eye
import dev.chiksmedina.solar.lineduotone.security.EyeClosed
import dev.chiksmedina.solar.lineduotone.security.EyeScan
import dev.chiksmedina.solar.lineduotone.security.Incognito
import dev.chiksmedina.solar.lineduotone.security.Key
import dev.chiksmedina.solar.lineduotone.security.KeyMinimalistic
import dev.chiksmedina.solar.lineduotone.security.KeyMinimalistic2
import dev.chiksmedina.solar.lineduotone.security.KeyMinimalisticSquare
import dev.chiksmedina.solar.lineduotone.security.KeyMinimalisticSquare2
import dev.chiksmedina.solar.lineduotone.security.KeyMinimalisticSquare3
import dev.chiksmedina.solar.lineduotone.security.KeySquare
import dev.chiksmedina.solar.lineduotone.security.KeySquare2
import dev.chiksmedina.solar.lineduotone.security.Lock
import dev.chiksmedina.solar.lineduotone.security.LockKeyhole
import dev.chiksmedina.solar.lineduotone.security.LockKeyholeMinimalistic
import dev.chiksmedina.solar.lineduotone.security.LockKeyholeMinimalisticUnlocked
import dev.chiksmedina.solar.lineduotone.security.LockKeyholeUnlocked
import dev.chiksmedina.solar.lineduotone.security.LockPassword
import dev.chiksmedina.solar.lineduotone.security.LockPasswordUnlocked
import dev.chiksmedina.solar.lineduotone.security.LockUnlocked
import dev.chiksmedina.solar.lineduotone.security.ObjectScan
import dev.chiksmedina.solar.lineduotone.security.Password
import dev.chiksmedina.solar.lineduotone.security.PasswordMinimalistic
import dev.chiksmedina.solar.lineduotone.security.PasswordMinimalisticInput
import dev.chiksmedina.solar.lineduotone.security.QrCode
import dev.chiksmedina.solar.lineduotone.security.Scanner
import dev.chiksmedina.solar.lineduotone.security.Scanner2
import dev.chiksmedina.solar.lineduotone.security.Shield
import dev.chiksmedina.solar.lineduotone.security.ShieldCheck
import dev.chiksmedina.solar.lineduotone.security.ShieldCross
import dev.chiksmedina.solar.lineduotone.security.ShieldKeyhole
import dev.chiksmedina.solar.lineduotone.security.ShieldKeyholeMinimalistic
import dev.chiksmedina.solar.lineduotone.security.ShieldMinimalistic
import dev.chiksmedina.solar.lineduotone.security.ShieldMinus
import dev.chiksmedina.solar.lineduotone.security.ShieldNetwork
import dev.chiksmedina.solar.lineduotone.security.ShieldPlus
import dev.chiksmedina.solar.lineduotone.security.ShieldStar
import dev.chiksmedina.solar.lineduotone.security.ShieldUp
import dev.chiksmedina.solar.lineduotone.security.ShieldUser
import dev.chiksmedina.solar.lineduotone.security.ShieldWarning
import dev.chiksmedina.solar.lineduotone.security.Siren
import dev.chiksmedina.solar.lineduotone.security.SirenRounded
import kotlin.collections.List as KtList

object SecurityGroup

val LineDuotoneSolar.Security: SecurityGroup
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
