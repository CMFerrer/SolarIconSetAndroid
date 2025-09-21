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

val ElectronicDevicesGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(
            name = "Monitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 2.252f)
                curveTo(4.2255f, 2.4206f, 3.6412f, 2.702f, 3.1716f, 3.1716f)
                curveTo(2.0f, 4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 13.8284f, 2.0f, 15.2426f, 2.8787f, 16.1213f)
                curveTo(3.7574f, 17.0f, 5.1716f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 17.0f, 20.2426f, 17.0f, 21.1213f, 16.1213f)
                curveTo(22.0f, 15.2426f, 22.0f, 13.8284f, 22.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 6.2288f, 22.0f, 4.3432f, 20.8284f, 3.1716f)
                curveTo(19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(9.6508f, 2.0f, 9.3178f, 2.0f, 9.0f, 2.0009f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 22.0f)
                horizontalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.0f)
                lineTo(12.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.0f)
                horizontalLineTo(16.0f)
                moveTo(2.0f, 13.0f)
                horizontalLineTo(12.0f)
            }
        }
            .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
