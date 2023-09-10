package com.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SimCards: ImageVector
    get() {
        if (_simCards != null) {
            return _simCards!!
        }
        _simCards = Builder(
            name = "SimCards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                curveTo(13.7712f, 22.0f, 15.6569f, 22.0f, 16.8284f, 20.8284f)
                curveTo(18.0f, 19.6569f, 18.0f, 17.7712f, 18.0f, 14.0f)
                curveTo(18.0f, 12.9746f, 17.5895f, 11.9937f, 16.8644f, 11.2686f)
                lineTo(12.7314f, 7.1356f)
                curveTo(12.0063f, 6.4105f, 11.0254f, 6.0f, 10.0f, 6.0f)
                curveTo(6.2288f, 6.0f, 4.3432f, 6.0f, 3.1716f, 7.1716f)
                curveTo(2.0f, 8.3432f, 2.0f, 10.2288f, 2.0f, 14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0001f, 17.8985f)
                curveTo(19.3002f, 17.7706f, 20.1753f, 17.4816f, 20.8285f, 16.8284f)
                curveTo(22.0001f, 15.6569f, 22.0001f, 13.7712f, 22.0001f, 10.0f)
                curveTo(22.0001f, 8.9746f, 21.5896f, 7.9937f, 20.8645f, 7.2686f)
                lineTo(16.7314f, 3.1356f)
                curveTo(16.0064f, 2.4105f, 15.0255f, 2.0f, 14.0001f, 2.0f)
                curveTo(10.2288f, 2.0f, 8.3432f, 2.0f, 7.1716f, 3.1716f)
                curveTo(6.5185f, 3.8247f, 6.2294f, 4.6999f, 6.1016f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 14.0f)
                horizontalLineTo(9.0f)
                curveTo(8.0572f, 14.0f, 7.5858f, 14.0f, 7.2929f, 14.2929f)
                curveTo(7.0f, 14.5858f, 7.0f, 15.0572f, 7.0f, 16.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 17.9428f, 7.0f, 18.4142f, 7.2929f, 18.7071f)
                curveTo(7.5858f, 19.0f, 8.0572f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(11.9428f, 14.0f, 12.4142f, 14.0f, 12.7071f, 14.2929f)
                curveTo(13.0f, 14.5858f, 13.0f, 15.0572f, 13.0f, 16.0f)
                verticalLineTo(16.5f)
                moveTo(10.0f, 14.0f)
                verticalLineTo(16.5f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(11.0f)
                curveTo(11.9428f, 19.0f, 12.4142f, 19.0f, 12.7071f, 18.7071f)
                curveTo(13.0f, 18.4142f, 13.0f, 17.9428f, 13.0f, 17.0f)
                verticalLineTo(16.5f)
                moveTo(10.0f, 19.0f)
                verticalLineTo(16.5f)
                moveTo(10.0f, 16.5f)
                horizontalLineTo(13.0f)
            }
        }
            .build()
        return _simCards!!
    }

private var _simCards: ImageVector? = null
