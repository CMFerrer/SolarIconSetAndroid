package dev.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.Server2: ImageVector
    get() {
        if (_server2 != null) {
            return _server2!!
        }
        _server2 = Builder(
            name = "Server2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.1144f, 21.0f, 3.1716f, 21.0f, 2.5858f, 20.4142f)
                curveTo(2.0f, 19.8284f, 2.0f, 18.8856f, 2.0f, 17.0f)
                curveTo(2.0f, 15.1144f, 2.0f, 14.1716f, 2.5858f, 13.5858f)
                curveTo(3.1716f, 13.0f, 4.1144f, 13.0f, 6.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 13.0f, 20.8284f, 13.0f, 21.4142f, 13.5858f)
                curveTo(22.0f, 14.1716f, 22.0f, 15.1144f, 22.0f, 17.0f)
                curveTo(22.0f, 18.8856f, 22.0f, 19.8284f, 21.4142f, 20.4142f)
                curveTo(20.8284f, 21.0f, 19.8856f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.8856f, 2.0f, 20.8284f, 2.0f, 21.4142f, 2.5858f)
                curveTo(22.0f, 3.1716f, 22.0f, 4.1144f, 22.0f, 6.0f)
                curveTo(22.0f, 7.8856f, 22.0f, 8.8284f, 21.4142f, 9.4142f)
                curveTo(20.8284f, 10.0f, 19.8856f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(6.0f)
                curveTo(4.1144f, 10.0f, 3.1716f, 10.0f, 2.5858f, 9.4142f)
                curveTo(2.0f, 8.8284f, 2.0f, 7.8856f, 2.0f, 6.0f)
                curveTo(2.0f, 4.1144f, 2.0f, 3.1716f, 2.5858f, 2.5858f)
                curveTo(3.1716f, 2.0f, 4.1144f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 6.0f)
                lineTo(18.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 7.0f)
                lineTo(6.0f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 7.0f)
                lineTo(9.0f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 17.0f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 18.0f)
                lineTo(6.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 18.0f)
                lineTo(9.0f, 16.0f)
            }
        }
            .build()
        return _server2!!
    }

private var _server2: ImageVector? = null
