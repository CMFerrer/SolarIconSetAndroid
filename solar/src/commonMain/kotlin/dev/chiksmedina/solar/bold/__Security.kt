package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.security.Bomb
import dev.chiksmedina.solar.bold.security.BombEmoji
import dev.chiksmedina.solar.bold.security.BombMinimalistic
import dev.chiksmedina.solar.bold.security.CodeScan
import dev.chiksmedina.solar.bold.security.Eye
import dev.chiksmedina.solar.bold.security.EyeClosed
import dev.chiksmedina.solar.bold.security.EyeScan
import dev.chiksmedina.solar.bold.security.Incognito
import dev.chiksmedina.solar.bold.security.Key
import dev.chiksmedina.solar.bold.security.KeyMinimalistic
import dev.chiksmedina.solar.bold.security.KeyMinimalistic2
import dev.chiksmedina.solar.bold.security.KeyMinimalisticSquare
import dev.chiksmedina.solar.bold.security.KeyMinimalisticSquare2
import dev.chiksmedina.solar.bold.security.KeyMinimalisticSquare3
import dev.chiksmedina.solar.bold.security.KeySquare
import dev.chiksmedina.solar.bold.security.KeySquare2
import dev.chiksmedina.solar.bold.security.Lock
import dev.chiksmedina.solar.bold.security.LockKeyhole
import dev.chiksmedina.solar.bold.security.LockKeyholeMinimalistic
import dev.chiksmedina.solar.bold.security.LockKeyholeMinimalisticUnlocked
import dev.chiksmedina.solar.bold.security.LockKeyholeUnlocked
import dev.chiksmedina.solar.bold.security.LockPassword
import dev.chiksmedina.solar.bold.security.LockPasswordUnlocked
import dev.chiksmedina.solar.bold.security.LockUnlocked
import dev.chiksmedina.solar.bold.security.ObjectScan
import dev.chiksmedina.solar.bold.security.Password
import dev.chiksmedina.solar.bold.security.PasswordMinimalistic
import dev.chiksmedina.solar.bold.security.PasswordMinimalisticInput
import dev.chiksmedina.solar.bold.security.QrCode
import dev.chiksmedina.solar.bold.security.Scanner
import dev.chiksmedina.solar.bold.security.Scanner2
import dev.chiksmedina.solar.bold.security.Shield
import dev.chiksmedina.solar.bold.security.ShieldCheck
import dev.chiksmedina.solar.bold.security.ShieldCross
import dev.chiksmedina.solar.bold.security.ShieldKeyhole
import dev.chiksmedina.solar.bold.security.ShieldKeyholeMinimalistic
import dev.chiksmedina.solar.bold.security.ShieldMinimalistic
import dev.chiksmedina.solar.bold.security.ShieldMinus
import dev.chiksmedina.solar.bold.security.ShieldNetwork
import dev.chiksmedina.solar.bold.security.ShieldPlus
import dev.chiksmedina.solar.bold.security.ShieldStar
import dev.chiksmedina.solar.bold.security.ShieldUp
import dev.chiksmedina.solar.bold.security.ShieldUser
import dev.chiksmedina.solar.bold.security.ShieldWarning
import dev.chiksmedina.solar.bold.security.Siren
import dev.chiksmedina.solar.bold.security.SirenRounded
import kotlin.collections.List as KtList

object SecurityGroup

val BoldSolar.Security: SecurityGroup
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
