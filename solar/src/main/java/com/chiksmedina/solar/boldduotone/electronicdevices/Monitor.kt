package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 11.5516f, 22.0f, 12.5494f, 21.9935f, 13.0f)
                horizontalLineTo(2.0065f)
                curveTo(2.0f, 12.5494f, 2.0f, 11.5516f, 2.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.9846f, 17.5f)
                curveTo(5.1453f, 17.5f, 3.7256f, 17.5f, 2.8436f, 16.6213f)
                curveTo(2.2721f, 16.052f, 2.0708f, 15.2579f, 2.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                curveTo(21.9292f, 15.2579f, 21.7279f, 16.052f, 21.1564f, 16.6213f)
                curveTo(20.2744f, 17.5f, 18.8547f, 17.5f, 16.0154f, 17.5f)
                horizontalLineTo(12.7529f)
                verticalLineTo(21.5f)
                horizontalLineTo(16.0154f)
                curveTo(16.4312f, 21.5f, 16.7683f, 21.8358f, 16.7683f, 22.25f)
                curveTo(16.7683f, 22.6642f, 16.4312f, 23.0f, 16.0154f, 23.0f)
                horizontalLineTo(7.9846f)
                curveTo(7.5688f, 23.0f, 7.2317f, 22.6642f, 7.2317f, 22.25f)
                curveTo(7.2317f, 21.8358f, 7.5688f, 21.5f, 7.9846f, 21.5f)
                horizontalLineTo(11.2471f)
                verticalLineTo(17.5f)
                horizontalLineTo(7.9846f)
                close()
            }
        }
            .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
