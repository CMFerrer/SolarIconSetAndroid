package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1213f, 21.1213f)
                curveTo(18.0f, 20.2426f, 18.0f, 18.8284f, 18.0f, 16.0f)
                lineTo(18.0f, 12.6595f)
                curveTo(16.5233f, 12.1579f, 14.5419f, 11.7498f, 12.0f, 11.7498f)
                curveTo(9.4581f, 11.7498f, 7.4767f, 12.1579f, 6.0f, 12.6595f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 18.8284f, 6.0f, 20.2426f, 6.8787f, 21.1213f)
                curveTo(7.7574f, 22.0f, 9.1716f, 22.0f, 12.0f, 22.0f)
                curveTo(14.8284f, 22.0f, 16.2426f, 22.0f, 17.1213f, 21.1213f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 6.0f, 3.7574f, 6.0f, 2.8787f, 6.8787f)
                curveTo(2.0f, 7.7574f, 2.0f, 9.1716f, 2.0f, 12.0f)
                curveTo(2.0f, 14.8284f, 2.0f, 16.2426f, 2.8787f, 17.1213f)
                curveTo(3.371f, 17.6137f, 4.0316f, 17.8302f, 5.0148f, 17.9253f)
                curveTo(5.0f, 17.3662f, 5.0f, 16.7481f, 5.0f, 16.0706f)
                lineTo(5.0f, 13.0424f)
                curveTo(4.9343f, 13.0706f, 4.8701f, 13.0988f, 4.8072f, 13.1271f)
                curveTo(4.4293f, 13.2967f, 3.9855f, 13.1279f, 3.8158f, 12.7501f)
                curveTo(3.6461f, 12.3722f, 3.8149f, 11.9283f, 4.1928f, 11.7587f)
                curveTo(5.9145f, 10.9856f, 8.4805f, 10.2498f, 12.0f, 10.2498f)
                curveTo(15.5195f, 10.2498f, 18.0854f, 10.9856f, 19.8072f, 11.7587f)
                curveTo(20.1851f, 11.9283f, 20.3539f, 12.3722f, 20.1842f, 12.7501f)
                curveTo(20.0145f, 13.1279f, 19.5707f, 13.2967f, 19.1928f, 13.1271f)
                curveTo(19.1299f, 13.0988f, 19.0657f, 13.0706f, 19.0f, 13.0424f)
                lineTo(19.0f, 16.0706f)
                curveTo(19.0f, 16.748f, 19.0f, 17.3662f, 18.9852f, 17.9253f)
                curveTo(19.9684f, 17.8302f, 20.629f, 17.6137f, 21.1213f, 17.1213f)
                curveTo(22.0f, 16.2426f, 22.0f, 14.8284f, 22.0f, 12.0f)
                curveTo(22.0f, 9.1716f, 22.0f, 7.7574f, 21.1213f, 6.8787f)
                curveTo(20.2426f, 6.0f, 18.8284f, 6.0f, 16.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1209f, 2.8787f)
                curveTo(16.2422f, 2.0f, 14.828f, 2.0f, 11.9995f, 2.0f)
                curveTo(9.1711f, 2.0f, 7.7569f, 2.0f, 6.8782f, 2.8787f)
                curveTo(6.3859f, 3.371f, 6.1694f, 4.0316f, 6.0742f, 5.0148f)
                curveTo(6.6335f, 5.0f, 7.2516f, 5.0f, 7.9292f, 5.0f)
                horizontalLineTo(16.0704f)
                curveTo(16.7478f, 5.0f, 17.3658f, 5.0f, 17.9249f, 5.0148f)
                curveTo(17.8297f, 4.0316f, 17.6132f, 3.371f, 17.1209f, 2.8787f)
                close()
            }
        }
            .build()
        return _printerMinimalistic!!
    }

private var _printerMinimalistic: ImageVector? = null
