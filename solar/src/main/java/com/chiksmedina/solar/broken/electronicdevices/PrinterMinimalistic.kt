package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.PrinterMinimalistic: ImageVector
    get() {
        if (_printerMinimalistic != null) {
            return _printerMinimalistic!!
        }
        _printerMinimalistic = Builder(
            name = "PrinterMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.48f, 17.7626f, 19.5535f, 17.9359f, 18.0f, 17.9827f)
                moveTo(6.0f, 17.9827f)
                curveTo(4.4465f, 17.9359f, 3.52f, 17.7626f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                curveTo(2.0f, 9.1716f, 2.0f, 7.7574f, 2.8787f, 6.8787f)
                curveTo(3.7574f, 6.0f, 5.1716f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 6.0f, 20.2426f, 6.0f, 21.1213f, 6.8787f)
                curveTo(21.4211f, 7.1785f, 21.6186f, 7.5406f, 21.7487f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.9827f, 6.0f)
                curveTo(17.9359f, 4.4465f, 17.7626f, 3.52f, 17.1213f, 2.8787f)
                curveTo(16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f, 2.0f)
                curveTo(9.1716f, 2.0f, 7.7574f, 2.0f, 6.8787f, 2.8787f)
                curveTo(6.2374f, 3.52f, 6.0641f, 4.4465f, 6.0173f, 6.0f)
                moveTo(18.0f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 18.8284f, 18.0f, 20.2426f, 17.1213f, 21.1213f)
                curveTo(16.48f, 21.7626f, 15.5535f, 21.9359f, 14.0f, 21.9827f)
                moveTo(6.0f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 18.8284f, 6.0f, 20.2426f, 6.8787f, 21.1213f)
                curveTo(7.52f, 21.7626f, 8.4466f, 21.9359f, 10.0f, 21.9827f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.9998f)
                curveTo(15.4115f, 10.9998f, 17.8729f, 11.7123f, 19.5f, 12.4429f)
                moveTo(4.5f, 12.4429f)
                curveTo(5.4031f, 12.0374f, 6.5631f, 11.6375f, 8.0f, 11.3619f)
            }
        }
            .build()
        return _printerMinimalistic!!
    }

private var _printerMinimalistic: ImageVector? = null
