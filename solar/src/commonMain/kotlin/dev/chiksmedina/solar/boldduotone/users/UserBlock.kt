package dev.chiksmedina.solar.boldduotone.users

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.UsersGroup

val UsersGroup.UserBlock: ImageVector
    get() {
        if (_userBlock != null) {
            return _userBlock!!
        }
        _userBlock = Builder(
            name = "UserBlock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.0f)
                curveTo(14.2091f, 10.0f, 16.0f, 8.2091f, 16.0f, 6.0f)
                curveTo(16.0f, 3.7909f, 14.2091f, 2.0f, 12.0f, 2.0f)
                curveTo(9.7909f, 2.0f, 8.0f, 3.7909f, 8.0f, 6.0f)
                curveTo(8.0f, 8.2091f, 9.7909f, 10.0f, 12.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.5f, 15.75f)
                curveTo(14.9812f, 15.75f, 13.75f, 16.9812f, 13.75f, 18.5f)
                curveTo(13.75f, 19.0004f, 13.8832f, 19.4691f, 14.1167f, 19.8732f)
                lineTo(17.8732f, 16.1167f)
                curveTo(17.4691f, 15.8832f, 17.0004f, 15.75f, 16.5f, 15.75f)
                close()
                moveTo(18.9196f, 17.1916f)
                lineTo(15.1916f, 20.9196f)
                curveTo(15.5806f, 21.1305f, 16.0261f, 21.25f, 16.5f, 21.25f)
                curveTo(18.0188f, 21.25f, 19.25f, 20.0188f, 19.25f, 18.5f)
                curveTo(19.25f, 18.0261f, 19.1305f, 17.5806f, 18.9196f, 17.1916f)
                close()
                moveTo(12.25f, 18.5f)
                curveTo(12.25f, 16.1528f, 14.1528f, 14.25f, 16.5f, 14.25f)
                curveTo(17.689f, 14.25f, 18.7652f, 14.7393f, 19.5357f, 15.5256f)
                curveTo(20.2861f, 16.2914f, 20.75f, 17.3423f, 20.75f, 18.5f)
                curveTo(20.75f, 20.8472f, 18.8472f, 22.75f, 16.5f, 22.75f)
                curveTo(15.3423f, 22.75f, 14.2914f, 22.2861f, 13.5256f, 21.5357f)
                curveTo(12.7393f, 20.7652f, 12.25f, 19.689f, 12.25f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9963f, 14.5211f)
                curveTo(17.5308f, 14.3459f, 17.0265f, 14.25f, 16.5f, 14.25f)
                curveTo(14.1528f, 14.25f, 12.25f, 16.1528f, 12.25f, 18.5f)
                curveTo(12.25f, 19.689f, 12.7393f, 20.7652f, 13.5256f, 21.5357f)
                curveTo(13.6786f, 21.6856f, 13.8429f, 21.8241f, 14.0173f, 21.9497f)
                curveTo(13.4088f, 21.9828f, 12.7385f, 22.0f, 12.0f, 22.0f)
                curveTo(4.0f, 22.0f, 4.0f, 19.9853f, 4.0f, 17.5f)
                curveTo(4.0f, 15.0147f, 7.5817f, 13.0f, 12.0f, 13.0f)
                curveTo(14.3874f, 13.0f, 16.5305f, 13.5882f, 17.9963f, 14.5211f)
                close()
            }
        }
            .build()
        return _userBlock!!
    }

private var _userBlock: ImageVector? = null
