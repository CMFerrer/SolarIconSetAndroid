package dev.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
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
                moveTo(11.0f, 14.0f)
                curveTo(11.9428f, 14.0f, 12.4142f, 14.0f, 12.7071f, 14.2929f)
                curveTo(13.0f, 14.5858f, 13.0f, 15.0572f, 13.0f, 16.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(9.5f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(8.0572f, 19.0f, 7.5858f, 19.0f, 7.2929f, 18.7071f)
                curveTo(7.0f, 18.4142f, 7.0f, 17.9428f, 7.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(7.0f, 15.0572f, 7.0f, 14.5858f, 7.2929f, 14.2929f)
                curveTo(7.5858f, 14.0f, 8.0572f, 14.0f, 9.0f, 14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 17.9428f, 13.0f, 18.4142f, 12.7071f, 18.7071f)
                curveTo(12.4142f, 19.0f, 11.9428f, 19.0f, 11.0f, 19.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0928f, 6.0927f)
                curveTo(6.216f, 4.7413f, 6.503f, 3.8402f, 7.1716f, 3.1716f)
                curveTo(8.3432f, 2.0f, 10.2288f, 2.0f, 14.0001f, 2.0f)
                curveTo(15.0255f, 2.0f, 16.0064f, 2.4105f, 16.7314f, 3.1356f)
                lineTo(20.8645f, 7.2686f)
                curveTo(21.5896f, 7.9937f, 22.0001f, 8.9746f, 22.0001f, 10.0f)
                curveTo(22.0001f, 13.7712f, 22.0001f, 15.6569f, 20.8285f, 16.8284f)
                curveTo(20.1599f, 17.497f, 19.2588f, 17.7841f, 17.9074f, 17.9073f)
                curveTo(18.0001f, 16.8906f, 18.0001f, 15.6191f, 18.0001f, 14.0f)
                curveTo(18.0001f, 12.9746f, 17.5896f, 11.9937f, 16.8645f, 11.2686f)
                lineTo(12.7314f, 7.1356f)
                curveTo(12.0064f, 6.4105f, 11.0255f, 6.0f, 10.0001f, 6.0f)
                curveTo(8.381f, 6.0f, 7.1094f, 6.0f, 6.0928f, 6.0927f)
                close()
            }
        }
            .build()
        return _simCards!!
    }

private var _simCards: ImageVector? = null
