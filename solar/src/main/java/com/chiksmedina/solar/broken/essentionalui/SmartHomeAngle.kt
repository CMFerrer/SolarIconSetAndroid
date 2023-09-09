package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

public val EssentionalUiGroup.SmartHomeAngle: ImageVector
    get() {
        if (_smartHomeAngle != null) {
            return _smartHomeAngle!!
        }
        _smartHomeAngle = Builder(name = "SmartHomeAngle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6359f, 12.9581f)
                lineTo(21.3572f, 14.8954f)
                curveTo(20.8697f, 18.2828f, 20.626f, 19.9766f, 19.451f, 20.9884f)
                curveTo(18.3822f, 21.9086f, 16.8599f, 21.9919f, 14.0f, 21.9994f)
                moveTo(21.6646f, 7.8751f)
                curveTo(21.1242f, 6.7478f, 19.9738f, 6.0625f, 17.6731f, 4.692f)
                lineTo(16.2882f, 3.867f)
                curveTo(14.199f, 2.6225f, 13.1543f, 2.0002f, 12.0f, 2.0002f)
                curveTo(10.8457f, 2.0002f, 9.801f, 2.6225f, 7.7118f, 3.867f)
                lineTo(6.3269f, 4.692f)
                curveTo(4.0262f, 6.0625f, 2.8758f, 6.7478f, 2.3354f, 7.8751f)
                curveTo(2.0485f, 8.4734f, 1.9674f, 9.1256f, 2.0111f, 10.0002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                curveTo(11.0f, 17.0294f, 6.9706f, 13.0f, 2.0f, 13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                curveTo(8.0f, 18.6863f, 5.3137f, 16.0f, 2.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(5.0f, 20.3431f, 3.6569f, 19.0f, 2.0f, 19.0f)
            }
        }
        .build()
        return _smartHomeAngle!!
    }

private var _smartHomeAngle: ImageVector? = null
