package dev.chiksmedina.solar.linear.networkitprogramming

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
import dev.chiksmedina.solar.linear.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.WifiRouterRound: ImageVector
    get() {
        if (_wifiRouterRound != null) {
            return _wifiRouterRound!!
        }
        _wifiRouterRound = Builder(
            name = "WifiRouterRound", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 12.2386f, 4.2386f, 10.0f, 7.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(19.7614f, 10.0f, 22.0f, 12.2386f, 22.0f, 15.0f)
                curveTo(22.0f, 17.7614f, 19.7614f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(4.2386f, 20.0f, 2.0f, 17.7614f, 2.0f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.3292f, 22.3354f)
                curveTo(18.5144f, 22.7059f, 18.9649f, 22.8561f, 19.3354f, 22.6708f)
                curveTo(19.7059f, 22.4856f, 19.8561f, 22.0351f, 19.6708f, 21.6646f)
                lineTo(18.3292f, 22.3354f)
                close()
                moveTo(17.3292f, 20.3354f)
                lineTo(18.3292f, 22.3354f)
                lineTo(19.6708f, 21.6646f)
                lineTo(18.6708f, 19.6646f)
                lineTo(17.3292f, 20.3354f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.6708f, 22.3354f)
                curveTo(5.4856f, 22.7059f, 5.0351f, 22.8561f, 4.6646f, 22.6708f)
                curveTo(4.2941f, 22.4856f, 4.1439f, 22.0351f, 4.3292f, 21.6646f)
                lineTo(5.6708f, 22.3354f)
                close()
                moveTo(6.6708f, 20.3354f)
                lineTo(5.6708f, 22.3354f)
                lineTo(4.3292f, 21.6646f)
                lineTo(5.3292f, 19.6646f)
                lineTo(6.6708f, 20.3354f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5f, 15.0f)
                curveTo(8.5f, 15.8284f, 7.8284f, 16.5f, 7.0f, 16.5f)
                curveTo(6.1716f, 16.5f, 5.5f, 15.8284f, 5.5f, 15.0f)
                curveTo(5.5f, 14.1716f, 6.1716f, 13.5f, 7.0f, 13.5f)
                curveTo(7.8284f, 13.5f, 8.5f, 14.1716f, 8.5f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 15.0f)
                horizontalLineTo(18.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.5833f, 5.397f)
                curveTo(20.7574f, 3.4029f, 18.7924f, 2.0f, 16.4996f, 2.0f)
                curveTo(14.2069f, 2.0f, 12.2419f, 3.4029f, 11.416f, 5.397f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.3806f, 6.6581f)
                curveTo(19.0167f, 5.4111f, 17.865f, 4.5f, 16.5004f, 4.5f)
                curveTo(15.1358f, 4.5f, 13.984f, 5.4111f, 13.6201f, 6.6581f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.5f, 7.0f)
                curveTo(17.5f, 7.5523f, 17.0523f, 8.0f, 16.5f, 8.0f)
                curveTo(15.9477f, 8.0f, 15.5f, 7.5523f, 15.5f, 7.0f)
                curveTo(15.5f, 6.4477f, 15.9477f, 6.0f, 16.5f, 6.0f)
                curveTo(17.0523f, 6.0f, 17.5f, 6.4477f, 17.5f, 7.0f)
                close()
            }
        }
            .build()
        return _wifiRouterRound!!
    }

private var _wifiRouterRound: ImageVector? = null
