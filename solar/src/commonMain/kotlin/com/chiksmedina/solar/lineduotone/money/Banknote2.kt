package com.chiksmedina.solar.lineduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MoneyGroup

val MoneyGroup.Banknote2: ImageVector
    get() {
        if (_banknote2 != null) {
            return _banknote2!!
        }
        _banknote2 = Builder(
            name = "Banknote2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 7.1716f, 2.0f, 5.7574f, 2.8787f, 4.8787f)
                curveTo(3.7574f, 4.0f, 5.1716f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(13.0f)
                curveTo(15.8284f, 4.0f, 17.2426f, 4.0f, 18.1213f, 4.8787f)
                curveTo(19.0f, 5.7574f, 19.0f, 7.1716f, 19.0f, 10.0f)
                curveTo(19.0f, 12.8284f, 19.0f, 14.2426f, 18.1213f, 15.1213f)
                curveTo(17.2426f, 16.0f, 15.8284f, 16.0f, 13.0f, 16.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 16.0f, 3.7574f, 16.0f, 2.8787f, 15.1213f)
                curveTo(2.0f, 14.2426f, 2.0f, 12.8284f, 2.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0003f, 7.0762f)
                curveTo(19.9754f, 7.1721f, 20.6317f, 7.3889f, 21.1216f, 7.8787f)
                curveTo(22.0003f, 8.7574f, 22.0003f, 10.1716f, 22.0003f, 13.0001f)
                curveTo(22.0003f, 15.8285f, 22.0003f, 17.2427f, 21.1216f, 18.1214f)
                curveTo(20.2429f, 19.0001f, 18.8287f, 19.0001f, 16.0003f, 19.0001f)
                horizontalLineTo(11.0003f)
                curveTo(8.1719f, 19.0001f, 6.7577f, 19.0001f, 5.879f, 18.1214f)
                curveTo(5.3891f, 17.6315f, 5.1723f, 16.9751f, 5.0764f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 10.0f)
                curveTo(13.0f, 11.3807f, 11.8807f, 12.5f, 10.5f, 12.5f)
                curveTo(9.1193f, 12.5f, 8.0f, 11.3807f, 8.0f, 10.0f)
                curveTo(8.0f, 8.6193f, 9.1193f, 7.5f, 10.5f, 7.5f)
                curveTo(11.8807f, 7.5f, 13.0f, 8.6193f, 13.0f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 12.0f)
                lineTo(16.0f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 12.0f)
                lineTo(5.0f, 8.0f)
            }
        }
            .build()
        return _banknote2!!
    }

private var _banknote2: ImageVector? = null
