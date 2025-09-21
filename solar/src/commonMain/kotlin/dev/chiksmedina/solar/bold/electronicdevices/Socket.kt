package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Socket: ImageVector
    get() {
        if (_socket != null) {
            return _socket!!
        }
        _socket = Builder(
            name = "Socket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 9.3552f, 8.7058f, 7.1671f, 11.25f, 6.8032f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.9142f, 11.5858f, 8.25f, 12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 7.9142f, 12.75f, 7.5f)
                verticalLineTo(6.8032f)
                curveTo(15.2942f, 7.1671f, 17.25f, 9.3552f, 17.25f, 12.0f)
                curveTo(17.25f, 14.6449f, 15.2942f, 16.8329f, 12.75f, 17.1968f)
                verticalLineTo(16.4999f)
                curveTo(12.75f, 16.0857f, 12.4142f, 15.7499f, 12.0f, 15.7499f)
                curveTo(11.5858f, 15.7499f, 11.25f, 16.0857f, 11.25f, 16.4999f)
                verticalLineTo(17.1968f)
                curveTo(8.7058f, 16.8329f, 6.75f, 14.6449f, 6.75f, 12.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 12.5523f, 14.5523f, 13.0f, 14.0f, 13.0f)
                curveTo(13.4477f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 13.4477f, 11.0f, 14.0f, 11.0f)
                curveTo(14.5523f, 11.0f, 15.0f, 11.4477f, 15.0f, 12.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(10.5523f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
                curveTo(11.0f, 11.4477f, 10.5523f, 11.0f, 10.0f, 11.0f)
                curveTo(9.4477f, 11.0f, 9.0f, 11.4477f, 9.0f, 12.0f)
                curveTo(9.0f, 12.5523f, 9.4477f, 13.0f, 10.0f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(12.0f, 5.25f)
                curveTo(8.2721f, 5.25f, 5.25f, 8.2721f, 5.25f, 12.0f)
                curveTo(5.25f, 15.7279f, 8.2721f, 18.75f, 12.0f, 18.75f)
                curveTo(15.7279f, 18.75f, 18.75f, 15.7279f, 18.75f, 12.0f)
                curveTo(18.75f, 8.2721f, 15.7279f, 5.25f, 12.0f, 5.25f)
                close()
            }
        }
            .build()
        return _socket!!
    }

private var _socket: ImageVector? = null
