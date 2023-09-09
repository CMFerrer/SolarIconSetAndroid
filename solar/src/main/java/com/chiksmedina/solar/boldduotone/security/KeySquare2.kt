package com.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SecurityGroup

public val SecurityGroup.KeySquare2: ImageVector
    get() {
        if (_keySquare2 != null) {
            return _keySquare2!!
        }
        _keySquare2 = Builder(name = "KeySquare2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 6.7201f)
                curveTo(22.0f, 9.3269f, 19.8781f, 11.4402f, 17.2606f, 11.4402f)
                curveTo(16.7829f, 11.4402f, 15.6954f, 11.3304f, 15.1664f, 10.8913f)
                lineTo(14.505f, 11.5499f)
                curveTo(14.1162f, 11.9372f, 14.2212f, 12.0512f, 14.3942f, 12.239f)
                curveTo(14.4664f, 12.3174f, 14.5504f, 12.4086f, 14.6153f, 12.5378f)
                curveTo(14.6153f, 12.5378f, 15.1664f, 13.3062f, 14.6153f, 14.0746f)
                curveTo(14.2846f, 14.5137f, 13.3588f, 15.1284f, 12.3007f, 14.0746f)
                lineTo(12.0802f, 14.2942f)
                curveTo(12.0802f, 14.2942f, 12.7415f, 15.0625f, 12.1904f, 15.8309f)
                curveTo(11.8598f, 16.27f, 10.978f, 16.7091f, 10.2065f, 15.9407f)
                lineTo(9.4349f, 16.7091f)
                curveTo(8.9059f, 17.236f, 8.2593f, 16.9286f, 8.0021f, 16.7091f)
                lineTo(7.3408f, 16.0505f)
                curveTo(6.7236f, 15.4358f, 7.0836f, 14.7698f, 7.3408f, 14.5137f)
                lineTo(13.0722f, 8.8057f)
                curveTo(13.0722f, 8.8057f, 12.5211f, 7.9275f, 12.5211f, 6.7201f)
                curveTo(12.5211f, 4.1132f, 14.643f, 2.0f, 17.2606f, 2.0f)
                curveTo(19.8781f, 2.0f, 22.0f, 4.1132f, 22.0f, 6.7201f)
                close()
                moveTo(18.914f, 6.72f)
                curveTo(18.914f, 7.6294f, 18.1738f, 8.3666f, 17.2607f, 8.3666f)
                curveTo(16.3476f, 8.3666f, 15.6074f, 7.6294f, 15.6074f, 6.72f)
                curveTo(15.6074f, 5.8107f, 16.3476f, 5.0735f, 17.2607f, 5.0735f)
                curveTo(18.1738f, 5.0735f, 18.914f, 5.8107f, 18.914f, 6.72f)
                close()
            }
        }
        .build()
        return _keySquare2!!
    }

private var _keySquare2: ImageVector? = null
