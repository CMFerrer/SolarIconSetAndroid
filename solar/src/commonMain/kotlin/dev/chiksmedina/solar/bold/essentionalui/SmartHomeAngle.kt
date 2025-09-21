package dev.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.25f, 12.25f)
                curveTo(2.25f, 11.8358f, 2.5858f, 11.5f, 3.0f, 11.5f)
                curveTo(8.3848f, 11.5f, 12.75f, 15.8652f, 12.75f, 21.25f)
                curveTo(12.75f, 21.6642f, 12.4142f, 22.0f, 12.0f, 22.0f)
                curveTo(11.5858f, 22.0f, 11.25f, 21.6642f, 11.25f, 21.25f)
                curveTo(11.25f, 16.6937f, 7.5564f, 13.0f, 3.0f, 13.0f)
                curveTo(2.5858f, 13.0f, 2.25f, 12.6642f, 2.25f, 12.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.25f, 15.25f)
                curveTo(2.25f, 14.8358f, 2.5858f, 14.5f, 3.0f, 14.5f)
                curveTo(6.7279f, 14.5f, 9.75f, 17.5221f, 9.75f, 21.25f)
                curveTo(9.75f, 21.6642f, 9.4142f, 22.0f, 9.0f, 22.0f)
                curveTo(8.5858f, 22.0f, 8.25f, 21.6642f, 8.25f, 21.25f)
                curveTo(8.25f, 18.3505f, 5.8995f, 16.0f, 3.0f, 16.0f)
                curveTo(2.5858f, 16.0f, 2.25f, 15.6642f, 2.25f, 15.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 17.5f)
                curveTo(2.5858f, 17.5f, 2.25f, 17.8358f, 2.25f, 18.25f)
                curveTo(2.25f, 18.6642f, 2.5858f, 19.0f, 3.0f, 19.0f)
                curveTo(4.2426f, 19.0f, 5.25f, 20.0074f, 5.25f, 21.25f)
                curveTo(5.25f, 21.6642f, 5.5858f, 22.0f, 6.0f, 22.0f)
                curveTo(6.4142f, 22.0f, 6.75f, 21.6642f, 6.75f, 21.25f)
                curveTo(6.75f, 19.1789f, 5.0711f, 17.5f, 3.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0245f, 10.2219f)
                curveTo(2.3196f, 10.0797f, 2.6505f, 10.0f, 3.0f, 10.0f)
                curveTo(9.2132f, 10.0f, 14.25f, 15.0368f, 14.25f, 21.25f)
                curveTo(14.25f, 21.5126f, 14.205f, 21.7646f, 14.1224f, 21.9989f)
                curveTo(16.9036f, 21.9892f, 18.3976f, 21.8953f, 19.451f, 20.9882f)
                curveTo(20.626f, 19.9764f, 20.8697f, 18.2827f, 21.3572f, 14.8952f)
                lineTo(21.6359f, 12.9579f)
                curveTo(22.0154f, 10.3208f, 22.2051f, 9.0023f, 21.6646f, 7.8749f)
                curveTo(21.1242f, 6.7476f, 19.9738f, 6.0623f, 17.6731f, 4.6918f)
                lineTo(16.2882f, 3.8669f)
                curveTo(14.199f, 2.6223f, 13.1543f, 2.0f, 12.0f, 2.0f)
                curveTo(10.8457f, 2.0f, 9.801f, 2.6223f, 7.7118f, 3.8669f)
                lineTo(6.3269f, 4.6918f)
                curveTo(4.0262f, 6.0623f, 2.8758f, 6.7476f, 2.3354f, 7.8749f)
                curveTo(2.0248f, 8.5228f, 1.9553f, 9.2338f, 2.0245f, 10.2219f)
                close()
            }
        }
            .build()
        return _smartHomeAngle!!
    }

private var _smartHomeAngle: ImageVector? = null
