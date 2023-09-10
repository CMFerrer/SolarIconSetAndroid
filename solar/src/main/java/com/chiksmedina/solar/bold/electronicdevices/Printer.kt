package com.chiksmedina.solar.bold.electronicdevices

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
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(
            name = "Printer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 6.0f, 3.7574f, 6.0f, 2.8787f, 6.8787f)
                curveTo(2.0f, 7.7574f, 2.0f, 9.1716f, 2.0f, 12.0f)
                curveTo(2.0f, 14.8284f, 2.0f, 16.2426f, 2.8787f, 17.1213f)
                curveTo(3.3732f, 17.6159f, 4.0374f, 17.8321f, 5.0279f, 17.9266f)
                curveTo(5.0f, 17.2038f, 5.0f, 15.3522f, 5.0f, 14.5f)
                curveTo(4.7239f, 14.5f, 4.5f, 14.2761f, 4.5f, 14.0f)
                curveTo(4.5f, 13.7239f, 4.7239f, 13.5f, 5.0f, 13.5f)
                horizontalLineTo(19.0f)
                curveTo(19.2761f, 13.5f, 19.5f, 13.7239f, 19.5f, 14.0f)
                curveTo(19.5f, 14.2761f, 19.2761f, 14.5003f, 19.0f, 14.5003f)
                curveTo(19.0f, 15.3525f, 19.0f, 17.2039f, 18.9721f, 17.9266f)
                curveTo(19.9626f, 17.8321f, 20.6268f, 17.6159f, 21.1213f, 17.1213f)
                curveTo(22.0f, 16.2426f, 22.0f, 14.8284f, 22.0f, 12.0f)
                curveTo(22.0f, 9.1716f, 22.0f, 7.7574f, 21.1213f, 6.8787f)
                curveTo(20.2426f, 6.0f, 18.8284f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(9.0f, 10.75f)
                curveTo(9.4142f, 10.75f, 9.75f, 10.4142f, 9.75f, 10.0f)
                curveTo(9.75f, 9.5858f, 9.4142f, 9.25f, 9.0f, 9.25f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 9.25f, 5.25f, 9.5858f, 5.25f, 10.0f)
                curveTo(5.25f, 10.4142f, 5.5858f, 10.75f, 6.0f, 10.75f)
                horizontalLineTo(9.0f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 10.5523f, 18.0f, 10.0f)
                curveTo(18.0f, 9.4477f, 17.5523f, 9.0f, 17.0f, 9.0f)
                curveTo(16.4477f, 9.0f, 16.0f, 9.4477f, 16.0f, 10.0f)
                curveTo(16.0f, 10.5523f, 16.4477f, 11.0f, 17.0f, 11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1211f, 2.8787f)
                curveTo(16.2424f, 2.0f, 14.8282f, 2.0f, 11.9998f, 2.0f)
                curveTo(9.1713f, 2.0f, 7.7571f, 2.0f, 6.8784f, 2.8787f)
                curveTo(6.3861f, 3.371f, 6.1696f, 4.0316f, 6.0744f, 5.0148f)
                curveTo(6.6337f, 5.0f, 7.2518f, 5.0f, 7.9294f, 5.0f)
                horizontalLineTo(16.0706f)
                curveTo(16.748f, 5.0f, 17.366f, 5.0f, 17.9251f, 5.0148f)
                curveTo(17.8299f, 4.0316f, 17.6135f, 3.371f, 17.1211f, 2.8787f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0f, 14.5f)
                curveTo(18.0f, 17.3284f, 18.0f, 20.2426f, 17.1213f, 21.1213f)
                curveTo(16.2426f, 22.0f, 14.8284f, 22.0f, 12.0f, 22.0f)
                curveTo(9.1716f, 22.0f, 7.7574f, 22.0f, 6.8787f, 21.1213f)
                curveTo(6.0f, 20.2426f, 6.0f, 17.3284f, 6.0f, 14.5f)
                horizontalLineTo(18.0f)
                close()
                moveTo(15.75f, 16.75f)
                curveTo(15.75f, 17.1642f, 15.4142f, 17.5f, 15.0f, 17.5f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 17.5f, 8.25f, 17.1642f, 8.25f, 16.75f)
                curveTo(8.25f, 16.3358f, 8.5858f, 16.0f, 9.0f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 16.0f, 15.75f, 16.3358f, 15.75f, 16.75f)
                close()
                moveTo(13.75f, 19.75f)
                curveTo(13.75f, 20.1642f, 13.4142f, 20.5f, 13.0f, 20.5f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 20.5f, 8.25f, 20.1642f, 8.25f, 19.75f)
                curveTo(8.25f, 19.3358f, 8.5858f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 19.0f, 13.75f, 19.3358f, 13.75f, 19.75f)
                close()
            }
        }
            .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
