package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.SmartHomeAngle: ImageVector
    get() {
        if (_smartHomeAngle != null) {
            return _smartHomeAngle!!
        }
        _smartHomeAngle = Builder(
            name = "SmartHomeAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.1061f, 22.0f)
                horizontalLineTo(10.8939f)
                curveTo(7.4474f, 22.0f, 5.7241f, 22.0f, 4.549f, 20.9882f)
                curveTo(3.374f, 19.9764f, 3.1302f, 18.2827f, 2.6428f, 14.8952f)
                lineTo(2.3641f, 12.9579f)
                curveTo(1.9846f, 10.3208f, 1.7949f, 9.0023f, 2.3354f, 7.8749f)
                curveTo(2.8758f, 6.7476f, 4.0262f, 6.0623f, 6.3269f, 4.6918f)
                lineTo(7.7118f, 3.8669f)
                curveTo(9.801f, 2.6223f, 10.8457f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1543f, 2.0f, 14.199f, 2.6223f, 16.2882f, 3.8669f)
                lineTo(17.6731f, 4.6918f)
                curveTo(19.9738f, 6.0623f, 21.1242f, 6.7476f, 21.6646f, 7.8749f)
                curveTo(22.2051f, 9.0023f, 22.0154f, 10.3208f, 21.6359f, 12.9579f)
                lineTo(21.3572f, 14.8952f)
                curveTo(20.8697f, 18.2827f, 20.626f, 19.9764f, 19.451f, 20.9882f)
                curveTo(18.2759f, 22.0f, 16.5526f, 22.0f, 13.1061f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.25f)
                curveTo(2.0f, 11.8358f, 2.3358f, 11.5f, 2.75f, 11.5f)
                curveTo(8.1348f, 11.5f, 12.5f, 15.8652f, 12.5f, 21.25f)
                curveTo(12.5f, 21.6642f, 12.1642f, 22.0f, 11.75f, 22.0f)
                curveTo(11.3358f, 22.0f, 11.0f, 21.6642f, 11.0f, 21.25f)
                curveTo(11.0f, 16.6937f, 7.3064f, 13.0f, 2.75f, 13.0f)
                curveTo(2.3358f, 13.0f, 2.0f, 12.6642f, 2.0f, 12.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.25f)
                curveTo(2.0f, 14.8358f, 2.3358f, 14.5f, 2.75f, 14.5f)
                curveTo(6.4779f, 14.5f, 9.5f, 17.5221f, 9.5f, 21.25f)
                curveTo(9.5f, 21.6642f, 9.1642f, 22.0f, 8.75f, 22.0f)
                curveTo(8.3358f, 22.0f, 8.0f, 21.6642f, 8.0f, 21.25f)
                curveTo(8.0f, 18.3505f, 5.6495f, 16.0f, 2.75f, 16.0f)
                curveTo(2.3358f, 16.0f, 2.0f, 15.6642f, 2.0f, 15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.75f, 17.5f)
                curveTo(2.3358f, 17.5f, 2.0f, 17.8358f, 2.0f, 18.25f)
                curveTo(2.0f, 18.6642f, 2.3358f, 19.0f, 2.75f, 19.0f)
                curveTo(3.9926f, 19.0f, 5.0f, 20.0074f, 5.0f, 21.25f)
                curveTo(5.0f, 21.6642f, 5.3358f, 22.0f, 5.75f, 22.0f)
                curveTo(6.1642f, 22.0f, 6.5f, 21.6642f, 6.5f, 21.25f)
                curveTo(6.5f, 19.1789f, 4.8211f, 17.5f, 2.75f, 17.5f)
                close()
            }
        }
            .build()
        return _smartHomeAngle!!
    }

private var _smartHomeAngle: ImageVector? = null
