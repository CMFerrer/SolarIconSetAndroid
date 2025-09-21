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

val ElectronicDevicesGroup.LaptopMinimalistic: ImageVector
    get() {
        if (_laptopMinimalistic != null) {
            return _laptopMinimalistic!!
        }
        _laptopMinimalistic = Builder(
            name = "LaptopMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.8856f, 3.0f, 16.8284f, 3.5858f, 17.4142f)
                curveTo(4.1716f, 18.0f, 5.1144f, 18.0f, 7.0f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(18.8856f, 18.0f, 19.8284f, 18.0f, 20.4142f, 17.4142f)
                curveTo(21.0f, 16.8284f, 21.0f, 15.8856f, 21.0f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 6.1716f, 21.0f, 4.7574f, 20.1213f, 3.8787f)
                curveTo(19.2426f, 3.0f, 17.8284f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 3.0f, 4.7574f, 3.0f, 3.8787f, 3.8787f)
                curveTo(3.3888f, 4.3686f, 3.172f, 5.0249f, 3.0761f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 21.0f)
                horizontalLineTo(16.0f)
                moveTo(2.0f, 21.0f)
                horizontalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 15.0f)
                horizontalLineTo(9.0f)
            }
        }
            .build()
        return _laptopMinimalistic!!
    }

private var _laptopMinimalistic: ImageVector? = null
