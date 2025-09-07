package com.chiksmedina.solar.lineduotone.networkitprogramming

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
import com.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.WifiRouterMinimalistic: ImageVector
    get() {
        if (_wifiRouterMinimalistic != null) {
            return _wifiRouterMinimalistic!!
        }
        _wifiRouterMinimalistic = Builder(
            name = "WifiRouterMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.5833f, 7.397f)
                curveTo(20.7574f, 5.4029f, 18.7924f, 4.0f, 16.4996f, 4.0f)
                curveTo(14.2069f, 4.0f, 12.2419f, 5.4029f, 11.416f, 7.397f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.3806f, 8.6581f)
                curveTo(19.0167f, 7.4111f, 17.865f, 6.5f, 16.5004f, 6.5f)
                curveTo(15.1358f, 6.5f, 13.984f, 7.4111f, 13.6201f, 8.6581f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 16.0f)
                curveTo(7.0f, 16.5523f, 6.5523f, 17.0f, 6.0f, 17.0f)
                curveTo(5.4477f, 17.0f, 5.0f, 16.5523f, 5.0f, 16.0f)
                curveTo(5.0f, 15.4477f, 5.4477f, 15.0f, 6.0f, 15.0f)
                curveTo(6.5523f, 15.0f, 7.0f, 15.4477f, 7.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 16.0f)
                curveTo(10.0f, 16.5523f, 9.5523f, 17.0f, 9.0f, 17.0f)
                curveTo(8.4477f, 17.0f, 8.0f, 16.5523f, 8.0f, 16.0f)
                curveTo(8.0f, 15.4477f, 8.4477f, 15.0f, 9.0f, 15.0f)
                curveTo(9.5523f, 15.0f, 10.0f, 15.4477f, 10.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 16.0f)
                curveTo(2.0f, 14.1144f, 2.0f, 13.1716f, 2.5858f, 12.5858f)
                curveTo(3.1716f, 12.0f, 4.1144f, 12.0f, 6.0f, 12.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 12.0f, 20.8284f, 12.0f, 21.4142f, 12.5858f)
                curveTo(22.0f, 13.1716f, 22.0f, 14.1144f, 22.0f, 16.0f)
                curveTo(22.0f, 17.8856f, 22.0f, 18.8284f, 21.4142f, 19.4142f)
                curveTo(20.8284f, 20.0f, 19.8856f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(6.0f)
                curveTo(4.1144f, 20.0f, 3.1716f, 20.0f, 2.5858f, 19.4142f)
                curveTo(2.0f, 18.8284f, 2.0f, 17.8856f, 2.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 12.0f)
                lineTo(16.5f, 9.0f)
            }
        }
            .build()
        return _wifiRouterMinimalistic!!
    }

private var _wifiRouterMinimalistic: ImageVector? = null
