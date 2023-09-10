package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(
            name = "Keyboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 5.0f, 20.2426f, 5.0f, 21.1213f, 5.8787f)
                curveTo(22.0f, 6.7574f, 22.0f, 8.1716f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 15.8284f, 22.0f, 17.2426f, 21.1213f, 18.1213f)
                curveTo(20.2426f, 19.0f, 18.8284f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 19.0f, 3.7574f, 19.0f, 2.8787f, 18.1213f)
                curveTo(2.0f, 17.2426f, 2.0f, 15.8284f, 2.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 8.1716f, 2.0f, 6.7574f, 2.8787f, 5.8787f)
                curveTo(3.7574f, 5.0f, 5.1716f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(6.0f, 10.0f)
                curveTo(6.5523f, 10.0f, 7.0f, 9.5523f, 7.0f, 9.0f)
                curveTo(7.0f, 8.4477f, 6.5523f, 8.0f, 6.0f, 8.0f)
                curveTo(5.4477f, 8.0f, 5.0f, 8.4477f, 5.0f, 9.0f)
                curveTo(5.0f, 9.5523f, 5.4477f, 10.0f, 6.0f, 10.0f)
                close()
                moveTo(6.0f, 13.0f)
                curveTo(6.5523f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 6.5523f, 11.0f, 6.0f, 11.0f)
                curveTo(5.4477f, 11.0f, 5.0f, 11.4477f, 5.0f, 12.0f)
                curveTo(5.0f, 12.5523f, 5.4477f, 13.0f, 6.0f, 13.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveTo(9.5523f, 13.0f, 10.0f, 12.5523f, 10.0f, 12.0f)
                curveTo(10.0f, 11.4477f, 9.5523f, 11.0f, 9.0f, 11.0f)
                curveTo(8.4477f, 11.0f, 8.0f, 11.4477f, 8.0f, 12.0f)
                curveTo(8.0f, 12.5523f, 8.4477f, 13.0f, 9.0f, 13.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.5523f, 10.0f, 10.0f, 9.5523f, 10.0f, 9.0f)
                curveTo(10.0f, 8.4477f, 9.5523f, 8.0f, 9.0f, 8.0f)
                curveTo(8.4477f, 8.0f, 8.0f, 8.4477f, 8.0f, 9.0f)
                curveTo(8.0f, 9.5523f, 8.4477f, 10.0f, 9.0f, 10.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 9.5523f, 13.0f, 9.0f)
                curveTo(13.0f, 8.4477f, 12.5523f, 8.0f, 12.0f, 8.0f)
                curveTo(11.4477f, 8.0f, 11.0f, 8.4477f, 11.0f, 9.0f)
                curveTo(11.0f, 9.5523f, 11.4477f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(15.0f, 10.0f)
                curveTo(15.5523f, 10.0f, 16.0f, 9.5523f, 16.0f, 9.0f)
                curveTo(16.0f, 8.4477f, 15.5523f, 8.0f, 15.0f, 8.0f)
                curveTo(14.4477f, 8.0f, 14.0f, 8.4477f, 14.0f, 9.0f)
                curveTo(14.0f, 9.5523f, 14.4477f, 10.0f, 15.0f, 10.0f)
                close()
                moveTo(15.0f, 13.0f)
                curveTo(15.5523f, 13.0f, 16.0f, 12.5523f, 16.0f, 12.0f)
                curveTo(16.0f, 11.4477f, 15.5523f, 11.0f, 15.0f, 11.0f)
                curveTo(14.4477f, 11.0f, 14.0f, 11.4477f, 14.0f, 12.0f)
                curveTo(14.0f, 12.5523f, 14.4477f, 13.0f, 15.0f, 13.0f)
                close()
                moveTo(18.0f, 10.0f)
                curveTo(18.5523f, 10.0f, 19.0f, 9.5523f, 19.0f, 9.0f)
                curveTo(19.0f, 8.4477f, 18.5523f, 8.0f, 18.0f, 8.0f)
                curveTo(17.4477f, 8.0f, 17.0f, 8.4477f, 17.0f, 9.0f)
                curveTo(17.0f, 9.5523f, 17.4477f, 10.0f, 18.0f, 10.0f)
                close()
                moveTo(18.0f, 13.0f)
                curveTo(18.5523f, 13.0f, 19.0f, 12.5523f, 19.0f, 12.0f)
                curveTo(19.0f, 11.4477f, 18.5523f, 11.0f, 18.0f, 11.0f)
                curveTo(17.4477f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                curveTo(17.0f, 12.5523f, 17.4477f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(17.75f, 16.0f)
                curveTo(17.75f, 16.4142f, 17.4142f, 16.75f, 17.0f, 16.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 16.75f, 6.25f, 16.4142f, 6.25f, 16.0f)
                curveTo(6.25f, 15.5858f, 6.5858f, 15.25f, 7.0f, 15.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 15.25f, 17.75f, 15.5858f, 17.75f, 16.0f)
                close()
            }
        }
            .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
