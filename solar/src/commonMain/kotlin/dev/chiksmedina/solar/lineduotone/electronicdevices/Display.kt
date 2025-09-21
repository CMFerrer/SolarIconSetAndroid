package dev.chiksmedina.solar.lineduotone.electronicdevices

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
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Display: ImageVector
    get() {
        if (_display != null) {
            return _display!!
        }
        _display = Builder(
            name = "Display", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 6.1716f, 2.0f, 4.7574f, 2.8787f, 3.8787f)
                curveTo(3.7574f, 3.0f, 5.1716f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 3.0f, 20.2426f, 3.0f, 21.1213f, 3.8787f)
                curveTo(22.0f, 4.7574f, 22.0f, 6.1716f, 22.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 12.8284f, 22.0f, 14.2426f, 21.1213f, 15.1213f)
                curveTo(20.2426f, 16.0f, 18.8284f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 16.0f, 3.7574f, 16.0f, 2.8787f, 15.1213f)
                curveTo(2.0f, 14.2426f, 2.0f, 12.8284f, 2.0f, 10.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.0f)
                verticalLineTo(16.5f)
                moveTo(12.0f, 19.0f)
                lineTo(18.0f, 21.0f)
                moveTo(12.0f, 19.0f)
                lineTo(6.0f, 21.0f)
            }
        }
            .build()
        return _display!!
    }

private var _display: ImageVector? = null
