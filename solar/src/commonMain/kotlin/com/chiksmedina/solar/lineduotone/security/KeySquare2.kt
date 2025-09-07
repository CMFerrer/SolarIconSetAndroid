package com.chiksmedina.solar.lineduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.SecurityGroup

val SecurityGroup.KeySquare2: ImageVector
    get() {
        if (_keySquare2 != null) {
            return _keySquare2!!
        }
        _keySquare2 = Builder(
            name = "KeySquare2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.2606f, 11.4402f)
                curveTo(19.8781f, 11.4402f, 22.0f, 9.3269f, 22.0f, 6.7201f)
                curveTo(22.0f, 4.1132f, 19.8781f, 2.0f, 17.2606f, 2.0f)
                curveTo(14.643f, 2.0f, 12.5211f, 4.1132f, 12.5211f, 6.7201f)
                curveTo(12.5211f, 7.9275f, 13.0722f, 8.8057f, 13.0722f, 8.8057f)
                lineTo(7.3408f, 14.5137f)
                curveTo(7.0836f, 14.7698f, 6.7236f, 15.4358f, 7.3408f, 16.0505f)
                lineTo(8.0021f, 16.7091f)
                curveTo(8.2593f, 16.9286f, 8.9059f, 17.236f, 9.4349f, 16.7091f)
                lineTo(10.2065f, 15.9407f)
                curveTo(10.978f, 16.7091f, 11.8598f, 16.27f, 12.1904f, 15.8309f)
                curveTo(12.7415f, 15.0625f, 12.0802f, 14.2942f, 12.0802f, 14.2942f)
                lineTo(12.3007f, 14.0746f)
                curveTo(13.3588f, 15.1284f, 14.2846f, 14.5137f, 14.6153f, 14.0746f)
                curveTo(15.1664f, 13.3062f, 14.6153f, 12.5378f, 14.6153f, 12.5378f)
                curveTo(14.3948f, 12.0988f, 13.954f, 12.0988f, 14.505f, 11.5499f)
                lineTo(15.1664f, 10.8913f)
                curveTo(15.6954f, 11.3304f, 16.7829f, 11.4402f, 17.2606f, 11.4402f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.2605f, 8.3666f)
                curveTo(18.1736f, 8.3666f, 18.9138f, 7.6294f, 18.9138f, 6.72f)
                curveTo(18.9138f, 5.8107f, 18.1736f, 5.0735f, 17.2605f, 5.0735f)
                curveTo(16.3474f, 5.0735f, 15.6072f, 5.8107f, 15.6072f, 6.72f)
                curveTo(15.6072f, 7.6294f, 16.3474f, 8.3666f, 17.2605f, 8.3666f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                StrokeCap.Companion.Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.993f)
                curveTo(21.9361f, 17.787f, 21.6692f, 19.419f, 20.5542f, 20.5341f)
                curveTo(19.0882f, 22.0f, 16.7288f, 22.0f, 12.0101f, 22.0f)
                curveTo(7.2913f, 22.0f, 4.9319f, 22.0f, 3.4659f, 20.5341f)
                curveTo(2.0f, 19.0681f, 2.0f, 16.7087f, 2.0f, 11.9899f)
                curveTo(2.0f, 7.2712f, 2.0f, 4.9118f, 3.4659f, 3.4458f)
                curveTo(4.581f, 2.3308f, 6.213f, 2.0639f, 9.007f, 2.0f)
            }
        }
            .build()
        return _keySquare2!!
    }

private var _keySquare2: ImageVector? = null
