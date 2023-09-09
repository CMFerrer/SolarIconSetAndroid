package com.chiksmedina.solar.linear.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MoneyGroup

public val MoneyGroup.Banknote2: ImageVector
    get() {
        if (_banknote2 != null) {
            return _banknote2!!
        }
        _banknote2 = Builder(name = "Banknote2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                curveTo(2.0f, 8.1716f, 2.0f, 6.7574f, 2.8787f, 5.8787f)
                curveTo(3.7574f, 5.0f, 5.1716f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(15.8284f, 5.0f, 17.2426f, 5.0f, 18.1213f, 5.8787f)
                curveTo(19.0f, 6.7574f, 19.0f, 8.1716f, 19.0f, 11.0f)
                curveTo(19.0f, 13.8284f, 19.0f, 15.2426f, 18.1213f, 16.1213f)
                curveTo(17.2426f, 17.0f, 15.8284f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 17.0f, 3.7574f, 17.0f, 2.8787f, 16.1213f)
                curveTo(2.0f, 15.2426f, 2.0f, 13.8284f, 2.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0002f, 8.0762f)
                curveTo(19.9753f, 8.1721f, 20.6317f, 8.3889f, 21.1216f, 8.8787f)
                curveTo(22.0002f, 9.7574f, 22.0002f, 11.1716f, 22.0002f, 14.0001f)
                curveTo(22.0002f, 16.8285f, 22.0002f, 18.2427f, 21.1216f, 19.1214f)
                curveTo(20.2429f, 20.0001f, 18.8287f, 20.0001f, 16.0002f, 20.0001f)
                horizontalLineTo(11.0002f)
                curveTo(8.1718f, 20.0001f, 6.7576f, 20.0001f, 5.8789f, 19.1214f)
                curveTo(5.389f, 18.6315f, 5.1723f, 17.9751f, 5.0764f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                curveTo(13.0f, 12.3807f, 11.8807f, 13.5f, 10.5f, 13.5f)
                curveTo(9.1193f, 13.5f, 8.0f, 12.3807f, 8.0f, 11.0f)
                curveTo(8.0f, 9.6193f, 9.1193f, 8.5f, 10.5f, 8.5f)
                curveTo(11.8807f, 8.5f, 13.0f, 9.6193f, 13.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                lineTo(16.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                lineTo(5.0f, 9.0f)
            }
        }
        .build()
        return _banknote2!!
    }

private var _banknote2: ImageVector? = null
