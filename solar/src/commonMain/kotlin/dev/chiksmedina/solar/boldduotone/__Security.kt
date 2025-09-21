package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.security.Bomb
import dev.chiksmedina.solar.boldduotone.security.BombEmoji
import dev.chiksmedina.solar.boldduotone.security.BombMinimalistic
import dev.chiksmedina.solar.boldduotone.security.CodeScan
import dev.chiksmedina.solar.boldduotone.security.Eye
import dev.chiksmedina.solar.boldduotone.security.EyeClosed
import dev.chiksmedina.solar.boldduotone.security.EyeScan
import dev.chiksmedina.solar.boldduotone.security.Incognito
import dev.chiksmedina.solar.boldduotone.security.Key
import dev.chiksmedina.solar.boldduotone.security.KeyMinimalistic
import dev.chiksmedina.solar.boldduotone.security.KeyMinimalistic2
import dev.chiksmedina.solar.boldduotone.security.KeyMinimalisticSquare
import dev.chiksmedina.solar.boldduotone.security.KeyMinimalisticSquare2
import dev.chiksmedina.solar.boldduotone.security.KeyMinimalisticSquare3
import dev.chiksmedina.solar.boldduotone.security.KeySquare
import dev.chiksmedina.solar.boldduotone.security.KeySquare2
import dev.chiksmedina.solar.boldduotone.security.Lock
import dev.chiksmedina.solar.boldduotone.security.LockKeyhole
import dev.chiksmedina.solar.boldduotone.security.LockKeyholeMinimalistic
import dev.chiksmedina.solar.boldduotone.security.LockKeyholeMinimalisticUnlocked
import dev.chiksmedina.solar.boldduotone.security.LockKeyholeUnlocked
import dev.chiksmedina.solar.boldduotone.security.LockPassword
import dev.chiksmedina.solar.boldduotone.security.LockPasswordUnlocked
import dev.chiksmedina.solar.boldduotone.security.LockUnlocked
import dev.chiksmedina.solar.boldduotone.security.ObjectScan
import dev.chiksmedina.solar.boldduotone.security.Password
import dev.chiksmedina.solar.boldduotone.security.PasswordMinimalistic
import dev.chiksmedina.solar.boldduotone.security.PasswordMinimalisticInput
import dev.chiksmedina.solar.boldduotone.security.QrCode
import dev.chiksmedina.solar.boldduotone.security.Scanner
import dev.chiksmedina.solar.boldduotone.security.Scanner2
import dev.chiksmedina.solar.boldduotone.security.Shield
import dev.chiksmedina.solar.boldduotone.security.ShieldCheck
import dev.chiksmedina.solar.boldduotone.security.ShieldCross
import dev.chiksmedina.solar.boldduotone.security.ShieldKeyhole
import dev.chiksmedina.solar.boldduotone.security.ShieldKeyholeMinimalistic
import dev.chiksmedina.solar.boldduotone.security.ShieldMinimalistic
import dev.chiksmedina.solar.boldduotone.security.ShieldMinus
import dev.chiksmedina.solar.boldduotone.security.ShieldNetwork
import dev.chiksmedina.solar.boldduotone.security.ShieldPlus
import dev.chiksmedina.solar.boldduotone.security.ShieldStar
import dev.chiksmedina.solar.boldduotone.security.ShieldUp
import dev.chiksmedina.solar.boldduotone.security.ShieldUser
import dev.chiksmedina.solar.boldduotone.security.ShieldWarning
import dev.chiksmedina.solar.boldduotone.security.Siren
import dev.chiksmedina.solar.boldduotone.security.SirenRounded
import kotlin.collections.List as KtList

object SecurityGroup

val BoldDuotoneSolar.Security: SecurityGroup
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
