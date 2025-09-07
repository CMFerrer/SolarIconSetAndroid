package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(
            name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.25f, 9.0f)
                curveTo(4.25f, 4.7198f, 7.7198f, 1.25f, 12.0f, 1.25f)
                curveTo(16.2802f, 1.25f, 19.75f, 4.7198f, 19.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(19.75f, 19.2802f, 16.2802f, 22.75f, 12.0f, 22.75f)
                curveTo(7.7198f, 22.75f, 4.25f, 19.2802f, 4.25f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(11.25f, 2.7945f)
                curveTo(8.1518f, 3.1651f, 5.75f, 5.802f, 5.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(5.75f, 18.4518f, 8.5482f, 21.25f, 12.0f, 21.25f)
                curveTo(15.4518f, 21.25f, 18.25f, 18.4518f, 18.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.25f, 5.802f, 15.8482f, 3.1651f, 12.75f, 2.7945f)
                verticalLineTo(6.378f)
                curveTo(13.6239f, 6.6869f, 14.25f, 7.5203f, 14.25f, 8.5f)
                verticalLineTo(10.5f)
                curveTo(14.25f, 11.7426f, 13.2426f, 12.75f, 12.0f, 12.75f)
                curveTo(10.7574f, 12.75f, 9.75f, 11.7426f, 9.75f, 10.5f)
                verticalLineTo(8.5f)
                curveTo(9.75f, 7.5203f, 10.3761f, 6.6869f, 11.25f, 6.378f)
                verticalLineTo(2.7945f)
                close()
                moveTo(12.0f, 7.75f)
                curveTo(11.5858f, 7.75f, 11.25f, 8.0858f, 11.25f, 8.5f)
                verticalLineTo(10.5f)
                curveTo(11.25f, 10.9142f, 11.5858f, 11.25f, 12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 10.9142f, 12.75f, 10.5f)
                verticalLineTo(8.5f)
                curveTo(12.75f, 8.0858f, 12.4142f, 7.75f, 12.0f, 7.75f)
                close()
            }
        }
            .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
